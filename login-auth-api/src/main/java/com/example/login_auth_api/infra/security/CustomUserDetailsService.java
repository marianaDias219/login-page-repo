package com.example.login_auth_api.infra.security;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.example.login_auth_api.domain.user.User;
import com.example.login_auth_api.repositories.UserRepository;
import java.util.ArrayList;

public class CustomUserDetailsService implements UserDetailsService{
    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        User user = this.repository.findByEmail(username).orElseThrow(()->new UsernameNotFoundException("User Not Found"));
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), new ArrayList<>());
    }
}

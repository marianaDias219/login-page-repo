# Tutorial de Criação de Projeto Full-Stack com Angular + Java Spring

Projeto Full-Stack de uma página de login com o intuito de abordar temas como autenticação, tratamento de erros e integração Angular + Java Spring

ℹ️ Fonte: 🔗 https://www.youtube.com/watch?v=6qbuuPM_de4&t=307s

---

# 🖥️ Preparando o ambiente

  ## Verificar a instalação do Node 
     node --version
  
  ### Caso não possua o Node instalado seguir os passos a seguir:
  
  
  1. Vá até o site oficial: 🔗 https://nodejs.org

     ![image](https://github.com/user-attachments/assets/d3dfbdf3-ed6b-4662-aa50-b6c74fd7c66b)

  2. Baixe a versão LTS (recomendada para a maioria)

  3. Execute o instalador .msi e siga as instruções

  4. Após instalar, abra o terminal e verifique novamente a instalação do Node

---

  ## Instalar o Angular de forma global
  
  ⚠️Definir qual versão do Angular irá utilizar, nesse projeto será utilizada a versão 17
  
    npm install -g @angular/cli@17

---

  ## Criar o projeto
    ng new
  Responder as perguntas:
  - Nome do projeto a ser criado
  ![image](https://github.com/user-attachments/assets/350966fd-39bc-4438-8775-e0962dd6ff51)

  - Stylesheet (Para o projeto foi escolhido SCSS)
  ![image](https://github.com/user-attachments/assets/d84802b5-43f3-4dfc-b847-acadb016e61f)

  - Habilitar Server-Side Rendering (Para o projeto não será utilizado)
  ![image](https://github.com/user-attachments/assets/c0e2c219-7ea8-4edc-b350-efd6d1452191)

---  
  
  ## Abrir o projeto no VS Code

  Ao entrar na pasta do projeto, executar o comando
  
    code .

# 👩‍💻 Hora de programar

A priori será definido o FRONT-END do projeto, baseando-se no esquema mostrado a seguir:

![image](https://github.com/user-attachments/assets/fcb42c19-3f4d-4757-80e0-e582d6c13d3d)

ℹ️ Fonte: 🔗 https://www.figma.com/design/7T1wkErczpMOBeqtpVjMSb/Login-Page-Design?node-id=6-920&p=f&t=iqlgNEq6kaKVHAgX-0

---

  ## Retirar estilizações pré-definidas na criação do arquivo
  Seguir o caminho nas pastas: src > app > app.component.html

  No arquivo **app.component.html** manter apenas em seu conteúdo a tag `<router-outlet />`, que será utilizada posteriormente para exibir cada página de acordo com a rota

  ![image](https://github.com/user-attachments/assets/86a3456f-74d2-4c09-90a4-ce6e9d1edeae)

 💡 Ao abrir o terminal e digitar `npm start`, será exibida a porta em que se pode visualizar seu projeto.

---

  ## Construir os componentes

  ### Componente de **Layout**

  Na aplicação será utilizada um layout comum entre as telas, e para reaproveitar o código será criado um componente que pode ser personalizado posteriormente.

  Abrir outro terminal e criar o componente **default-login-layout** na pasta **components**:
  
    ng g c components/default-login-layout

  No arquivo criado, inciar a estruturação do componente:

  - Baixar as imagens utilizadas no layout
  
  - Inserir as imagens no projeto, seguindo src > assets, criar uma pasta chamada `svg` para inserir as imagens

    ![image](https://github.com/user-attachments/assets/8a41cf02-ca30-4fcb-8383-28793bed3f02)

  ### Componente de **Login**

  Criar componente correspondente à página de login

    ng g c pages/login

  Importar o componente de layout criado anteriormente, seguindo o caminho src > pages/login > login.components.ts

  Em **imports** inserir **DefaultLoginLayoutComponent**

  ![image](https://github.com/user-attachments/assets/85d4e2d7-8a42-43c7-bcad-e98e2b199942)

  Em seguida, no arquivo login.components.html na mesma pasta, inserir a tag `<app-default-login-layout>`

  E por fim, criar a rota correspondente ao login, seguindo src > app.routes.ts.

  No arquivo app.routes.ts inserir em **Routes** 

    {
      path: "login",
      component:LoginComponent
    }
    
  ![image](https://github.com/user-attachments/assets/abe5b29f-9cb7-471c-b0ce-65e6cadf1a8f)

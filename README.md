# Simulador de Banco

## Descrição

Este aplicativo foi desenvolvido baseado no desafio técnico Back-end do PicPay: https://github.com/PicPay/picpay-desafio-backend.

## Requisitos

- [x] Java 17

- [x] Maven

- [x] H2 Database

## Instalação

Para instalar a API, siga os seguintes passos:

### Clone o repositório do GitHub:
```bash
git clone https://github.com/MarcelFeo/spring-sistema-banco.git
```

### Entre na pasta do projeto:
```bash
cd spring-sistema-banco
```

### Execute o comando para buildar a aplicação:
```bash
mvn clean install
```

### Crie um banco de dados PostgreSQL com o nome api_produtos.

### Inicie a aplicação:
A aplicação estará disponível em ```http://localhost:8081```

## Endpoints

A API possui as seguintes funcionalidades:

<ul>
  <li>Para cadastrar um usuário, precisamos do Nome Completo, CPF, e-mail e Senha. CPF/CNPJ e e-mails são únicos no sistema. Sendo assim, o sistema não permite dois usuários com o mesmo CPF ou endereço de e-mail.</li>
  <li>Usuários podem enviar dinheiro (efetuar transferência) para lojistas e entre usuários.</li>
</ul>

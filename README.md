# Individualsurlefond

Título do Projeto
-------

Sur le fond

Descrição do Projeto
-------

Este projeto consiste no desenvolvimento de um aplicativo mobile criado no FlutterFlow, integrado com uma API REST hospedada no Render, utilizando o Swagger para consumo dos endpoints.
O objetivo principal é permitir que um usuário se cadastre, faça login, visualize seus dados pessoais, gerencie seu endereço e navegue por uma tela inicial com layout estruturado (header, footer, imagens e botões).
O projeto segue os requisitos da UC, incluindo documentação, integração com API real, prints do FlutterFlow e deploy funcional do backend.

Descrição das Funcionalidades
----------

1. Tela de Login

Formúlario contendo:
Email;
Senha.

Chamada à API de autenticação
Redirecionamento automático para a tela inicial após login bem-sucedido
Exibição de mensagens de erro em caso de credenciais inválidas

2. Tela de Cadastro

Formulário contendo:

Email;
Senha;
Confirmar senha;
Nome completo;
Data de nascimento;
CPF.


Integração com API para criação de novos usuários
Exibição de confirmação ao finalizar o cadastro
Redirecionamento para a tela de login

3. Tela de Dados do Usuário

Carregamento automático dos dados do usuário autenticado

Exibição de:

Nome;
Email;
Senha;
Data de nascimento;
CPF.


Informação adicional retornada pela API
Botão para atualizar dados

4. Tela Inicial

Header com título, icone e foto
Área central com imagem, texto explicativo e ícones
Footer fixo
Botão que redireciona para continuar e voltar

5. Tela de Endereço

Campos incluídos:

Logradouro;
Localidade;
CEP;
Número;
Complemento;
Bairro;
Referência.

Botão “Salvar” que envia os dados à API

Tecnologias Utilizadas
-------------------

Front-end:

FlutterFlow
Dart
Widgets nativos do Flutter
HTTP Request via API Calls do FlutterFlow

Back-end

Java 23
Spring Boot
Spring Data JPA
PostgreSQL
Deploy no Render
Documentação via Swagger

Ferramentas
--------------

Git / GitHub
Swagger UI
FlutterFlow

Login – API Call

1. Call Definition
2. Response & Test
3. Aba de Test

Cadastro de Usuário – API Call
1. Call Definition
2. Response & Test
3. Aba de Test

Dados do Usuário – API Call
1. Call Definition
2. Response & Test
3. Aba de Test

Cadastro de Endereço – API Call
1. Call Definition
2. Response & Test
3. Aba de Test

Swagger:
-------------

(https://individualsurlefond.onrender.com/aula/swagger-ui/index.html#/)

Desenvolvedor
----------

Nome: Ana Clara Kaizer Ribeiro
Turma: 2 Info B

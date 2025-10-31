<h1 align="center">⚔️ Crônicas de Eldoria ⚔️</h1>

<p align="center">
  <em>Um RPG de texto e turnos desenvolvido com Spring Boot — onde cada decisão molda seu destino.</em>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Spring%20Boot-3.5.7-6DB33F?style=for-the-badge&logo=springboot" alt="Spring Boot">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java" alt="Java">
  <img src="https://img.shields.io/badge/Maven-3.9.9-C71A36?style=for-the-badge&logo=apachemaven" alt="Maven">
  <img src="https://img.shields.io/badge/H2-Database-blue?style=for-the-badge&logo=h2" alt="H2 Database">
  <img src="https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow?style=for-the-badge" alt="Status">
</p>

---

## 🧙‍♂️ Sobre o Projeto

**Crônicas de Eldoria** é um **RPG de texto e batalhas em turnos**, desenvolvido em **Spring Boot** com Java.  
O jogador cria personagens, escolhe classes, realiza missões e evolui em um mundo medieval cheio de desafios.

O objetivo do projeto é **unir aprendizado em desenvolvimento backend** com uma experiência interativa e divertida.

---

## 🎯 Objetivo do MVP (Mínimo Produto Viável)

A primeira versão jogável incluirá:

- 👤 **Registro e login de usuários**
- 🧝 **Criação de até 3 personagens por jogador**
- 📜 **Visualização de personagens e atributos**
- ⚔️ **Missões básicas e de alto nível**
- 🧩 **Batalhas simplificadas** (cálculo de dano básico, sem buffs ou itens complexos)

---

## 🏗️ Arquitetura do Projeto

| Camada | Função | Tecnologias |
|--------|---------|--------------|
| **Controller** | Endpoints da API REST | Spring Web |
| **Service** | Lógica de negócio e sistema de batalha | Java / Spring Boot |
| **Repository** | Acesso e persistência de dados | Spring Data JPA / H2 |
| **Security** | Login, senha e autenticação | Spring Security |
| **Domain / Model** | Estruturas de dados do jogo | Java |
| **DTOs** | Comunicação entre camadas | Java |

---

## 🧩 Estrutura de Pacotes

```

com.alissondev.cronicasdeeldoria
├── controller      → Endpoints REST
├── service         → Lógica de negócio
├── model           → Entidades (Personagem, Usuário, Missão, etc.)
├── repository      → Interfaces JPA
├── config          → Configurações (segurança, beans)
└── dto             → Objetos de transferência de dados

````

---

## ⚙️ Tecnologias Utilizadas

| Categoria | Tecnologias |
|------------|--------------|
| **Linguagem** | Java 17 |
| **Framework Principal** | Spring Boot 3.5.7 |
| **Dependências** | Spring Web, Spring Data JPA, Spring Security, Lombok |
| **Banco de Dados** | H2 (em memória, para desenvolvimento) |
| **Build Tool** | Maven |
| **IDE Recomendada** | IntelliJ IDEA ou VS Code |
| **Versionamento** | Git + GitHub |
| **Testes** | Spring Boot Starter Test |
| **Futuro Deploy** | Render ou Railway |

---

## 🚀 Como Rodar o Projeto

### 🔧 Pré-requisitos
- **Java 17+**
- **Maven 3+**
- **IDE com suporte a Spring Boot**

### ▶️ Executando localmente


# Clone o repositório
git clone https://github.com/alissonandrade1/cronicas-de-eldoria.git

# Entre na pasta do projeto
cd cronicas-de-eldoria

# Rode o projeto com Maven
mvn spring-boot:run


Depois acesse:
👉 **[http://localhost:8080](http://localhost:8080)**

---

## 🗃️ Banco de Dados

O projeto utiliza o **H2 Database** (em memória), ideal para desenvolvimento rápido e simples.

| Configuração | Valor              |
| ------------ | ------------------ |
| **Driver**   | org.h2.Driver      |
| **JDBC URL** | jdbc:h2:mem:testdb |
| **User**     | sa                 |
| **Password** | *(vazia)*          |

Acesse o console do H2 em:
🔗 [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

---

## 🌱 Estrutura de Branches

| Branch      | Descrição                           |
| ----------- | ----------------------------------- |
| `main`      | Versão estável do código (produção) |
| `develop`   | Desenvolvimento ativo               |
| `feature/*` | Novas funcionalidades               |
| `release/*` | Versões de testes finais            |
| `hotfix/*`  | Correções urgentes em produção      |

---

## 🧾 Commits e Padrão de Mensagens

Use o padrão **Conventional Commits**:

| Tipo       | Exemplo                                     | Descrição                  |
| ---------- | ------------------------------------------- | -------------------------- |
| `feat`     | `feat: adicionar criação de personagem`     | Nova funcionalidade        |
| `fix`      | `fix: corrigir erro de autenticação`        | Correção de bug            |
| `chore`    | `chore: ajustes no pom.xml`                 | Manutenção do projeto      |
| `docs`     | `docs: atualizar README`                    | Alterações na documentação |
| `refactor` | `refactor: melhorar organização de pacotes` | Refatoração de código      |

---

## 📅 Roadmap (MVP)

* [x] Setup inicial do projeto
* [x] Estrutura de pacotes
* [ ] Autenticação de usuários
* [ ] Cadastro e visualização de personagens
* [ ] Missões básicas
* [ ] Sistema de batalha simples
* [ ] Documentação da API (Swagger)
* [ ] Deploy público do backend

---

## 🌐 Visibilidade e Deploy

Este repositório é **público** para fins de portfólio e aprendizado,
mas **não aceita contribuições externas no momento**.

O backend será futuramente hospedado no **Render** ou **Railway**,
com banco de dados **PostgreSQL** e endpoints públicos acessíveis.

---

## 💡 Aprendizados

Este projeto tem como propósito **aprimorar habilidades práticas em desenvolvimento backend**, incluindo:

* Arquitetura em camadas (MVC)
* Boas práticas com Spring Boot
* Criação de APIs RESTful
* Controle de autenticação e segurança
* Uso de banco de dados em memória
* Organização e versionamento profissional no Git

---

## 🧙‍♂️ Autor

Feito com ☕ e coragem por **[Alisson Andrade](https://github.com/alissonandrade1)**
💬 “O código é a espada, e o bug... o dragão.”

<p align="center">
  <img src="https://i.imgur.com/Fvdc6Ph.gif" width="120px" alt="sword animation"/>
</p>

---

## 🧾 Licença

Este projeto está licenciado sob a **MIT License** — veja o arquivo [LICENSE](LICENSE) para mais detalhes.

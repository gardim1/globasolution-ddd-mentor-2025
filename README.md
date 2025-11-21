# Global Solution 2025 – O Futuro do Trabalho
## API de Upskilling/Reskilling – Java + Spring Boot

Este projeto é uma API desenvolvida para uma plataforma de **Upskilling/Reskilling**, focada em preparar profissionais para as exigências do futuro do trabalho até 2030, impulsionadas pela **IA, automação, dados e digitalização**. A plataforma permite que usuários se cadastrem, explorem trilhas de aprendizagem e desenvolvam as competências do futuro.

---
## Integrantes

* **Leonardo Correia** – RM 550413
* **João Vitor Boht** – RM 558690
* **Vinicius Gardim** – RM 556013

---
## Tecnologias Utilizadas

O projeto foi construído utilizando um *stack* moderno e robusto, centrado no ecossistema Java/Spring Boot.

* **Java 24+** (funciona a partir da 17+)
* **Spring Boot 3+**
* **Spring Data JPA**
* **H2 Database** (para ambiente de desenvolvimento e testes)
* **Maven** (Gerenciador de Dependências)
* **Bean Validation**
* **Exception Handler** com `@RestControllerAdvice`

---
## Arquitetura

O projeto segue a arquitetura **MVC em camadas** (Model-View-Controller, adaptada para API), garantindo a separação de responsabilidades, manutenibilidade e escalabilidade:

$$Controller \rightarrow Service \rightarrow Repository \rightarrow Domain \rightarrow Exception \ Handler$$

---
## Banco de Dados

* **Banco utilizado:** H2 (em memória).
* **Inicialização:** Dados de *seed* automáticos via arquivo `data.sql`.
* **Acesso ao Console H2:** Acesse o *database* console para inspeção:
    ```
    http://localhost:8080/h2-console
    ```

---
## Como Executar

Siga os passos abaixo para rodar a aplicação localmente:

1.  **Clonar o repositório:**
    ```bash
    git clone https://github.com/gardim1/globasolution-ddd-mentor-2025
    ```
2.  **Abrir no IntelliJ IDEA**.
3.  **Executar a aplicação** via Maven:
    ```bash
    mvn spring-boot:run
    ```
    A API estará disponível em `http://localhost:8080`.

---
## Endpoints da API

A API oferece dois recursos principais: `usuarios` e `trilhas`, com operações CRUD (Create, Read, Update, Delete) completas.

### Usuários (`/usuarios`)

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| `GET` | `/usuarios` | Lista todos os usuários. |
| `GET` | `/usuarios/{id}` | Busca usuário por ID. |
| `POST` | `/usuarios` | Cria um novo usuário. |
| `PUT` | `/usuarios/{id}` | Atualiza um usuário existente. |
| `DELETE` | `/usuarios/{id}` | Remove um usuário. |

### Trilhas (`/trilhas`)

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| `GET` | `/trilhas` | Lista todas as trilhas de aprendizagem. |
| `GET` | `/trilhas/{id}` | Busca trilha por ID. |
| `POST` | `/trilhas` | Cria uma nova trilha. |
| `PUT` | `/trilhas/{id}` | Atualiza uma trilha existente. |
| `DELETE` | `/trilhas/{id}` | Remove uma trilha. |

---
## Exemplos de JSON

### Criar Usuário (POST /usuarios)

```json
{
  "nome": "Flavin do Pneu",
  "email": "flavin@example.com",
  "areaAtuacao": "Tecnologia",
  "nivelCarreira": "JUNIOR"
}
```
### Criar Trilha (POST /trilhas)

```json
{
  "nome": "Introdução à IA",
  "descricao": "Fundamentos de IA moderna",
  "nivel": "INTERMEDIARIO",
  "cargaHoraria": 40,
  "focoPrincipal": "Inteligência Artificial"
}
```
---
## Conexão com os ODS (Objetivos de Desenvolvimento Sustentável)

A solução contribui diretamente para os seguintes Objetivos de Desenvolvimento Sustentável da ONU:

* **ODS 4** – Educação de Qualidade
* **ODS 8** – Trabalho Decente e Crescimento Econômico
* **ODS 9** – Inovação e Infraestrutura
* **ODS 10** – Redução das Desigualdades

---
## Considerações Finais

A API de Upskilling/Reskilling é um pilar estratégico que promove a **inclusão digital**, o **preparo profissional** e o **desenvolvimento contínuo**, essenciais para o mercado de trabalho em 2030. Com uma arquitetura sólida, organizada e escalável em **Java/Spring Boot**, ela pavimenta o caminho para futuras integrações e a expansão da plataforma educacional.

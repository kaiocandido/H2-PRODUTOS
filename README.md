#  API de Produtos – Backend Java (Spring Boot)

Este projeto é uma API simples desenvolvida em **Java com Spring Boot**, permitindo realizar operações básicas de CRUD para produtos.

## 🚀 Funcionalidades

A API permite:

- ✔️ Criar um produto  
- ✔️ Atualizar um produto por ID  
- ✔️ Deletar um produto por ID  
- ✔️ Buscar produtos por nome  
- ✔️ Listar todos os produtos  

---

## 🛠️ Tecnologias utilizadas

- **Java 17+**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **H2 / MySQL / PostgreSQL** (dependendo do que você configurou)
- **Maven**

---

## 📦 Endpoints da API

### ➤ Criar produto  
`POST /produtos`

**Body JSON:**

```json
{
  "id": "123",
  "name": "Mouse Gamer",
  "descricao": "Mouse RGB",
  "preco": 59.90
}


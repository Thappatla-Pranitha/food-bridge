# Food Bridge 🍲

A Java Spring Boot REST API for a food donation platform designed to connect food donors with people in need.

## 🎯 Objective

Reduce food waste by making surplus food easier to list and share with communities.

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## ✨ Features

- Create food donation listings
- Retrieve all food donations
- Retrieve a donation by ID
- Delete a donation by ID
- Store donation data using JPA and an H2 database

## 🔗 API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/food` | Retrieve all donations |
| POST | `/api/food` | Create a donation |
| GET | `/api/food/{id}` | Retrieve a donation by ID |
| DELETE | `/api/food/{id}` | Delete a donation |

### Example request

`POST /api/food`

```json
{
  "foodName": "Vegetable Meals",
  "quantity": 20,
  "donorName": "Community Kitchen",
  "location": "Karimnagar"
}
```

## 🚀 Running the Project

1. Install JDK 17 and Maven, or use an IDE with Maven support.
2. Clone this repository.
3. Open the project as a Maven project.
4. Run `FoodBridgeApplication.java`.
5. Test the API using Postman or another REST client.

## 📌 Project Status

**In development.** The source code has been uploaded to GitHub. Compilation and API tests are still pending.

## 👩‍💻 Author

Pranitha Thappatla

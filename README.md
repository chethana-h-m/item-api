Item Management REST API (Spring Boot)
This is a simple Java Spring Boot RESTful API for managing items (like a mini e-commerce / movie catalog system).
It uses in-memory storage (ArrayList) and supports adding items and fetching items by ID
Features
•	Add a new item
•	Get item by ID
•	Input validation
•	Global error handling
•	In-memory storage (no database)
•	Ready for deployment (Railway compatible)
Tech Stack
•	Java 17
•	Spring Boot
•	Maven
•	REST API
API Endpoints
Add Item (POST)
POST http://localhost:8080/items
Body:
{
  "id": 4,
  "name": "Headphones",
  "description": "Boat wireless",
  "price": 1999
}

Get Item by ID (GET)
GET http://localhost:8080/items/1
 Validation Example
Request:
{
  "id": 5,
  "name": "",
  "description": "",
  "price": 0
}
Response:
{
  "name": "Name is required",
  "description": "Description is required",
  "price": "Price must be greater than 0"
}
 Deployment (Railway)
•	Uses system.properties
•	Auto-detects PORT
•	No database required



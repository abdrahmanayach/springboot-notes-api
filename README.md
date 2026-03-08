# Notes API

A simple RESTful API built with Spring Boot for creating, reading, updating, and deleting notes.

## Features

- Built with Spring Boot, Spring Data JPA, and PostgreSQL.
- RESTful endpoints with proper HTTP status codes.
- Simple CRUD operations for notes.

## Installation

Clone the repository and install dependencies:

```bash
mvn clean install
```

## Usage

```bash
mvn spring-boot:run     # Development
mvn package             # Production
```

The server runs on http://localhost:8080

## API Endpoints

### Get All Notes

```
GET /notes
```

**Response:**

```json
[
  {
    "id": 1,
    "title": "My Note",
    "content": "This is my note content"
  }
]
```

### Get Note by ID

```
GET /notes/{id}
```

**Example:**

```
GET /notes/1
```

**Response:**

```json
{
  "id": 1,
  "title": "My Note",
  "content": "This is my note content"
}
```

### Create Note

```
POST /notes
```

**Request Body:**

```json
{
  "title": "New Note",
  "content": "Note content here"
}
```

**Response:**

```json
{
  "id": 1,
  "title": "New Note",
  "content": "Note content here"
}
```

### Update Note

```
PUT /notes/{id}
```

**Example:**

```
PUT /notes/1
```

**Request Body:**

```json
{
  "title": "Updated Title",
  "content": "Updated content"
}
```

**Response:**

```json
{
  "id": 1,
  "title": "Updated Title",
  "content": "Updated content"
}
```

### Delete Note

```
DELETE /notes/{id}
```

**Example:**

```
DELETE /notes/1
```

**Response:** 204 No Content

# Person Info Application

This is a full-stack application that allows users to submit and retrieve person information. The application consists of a Spring Boot backend and an Angular frontend.
## Technologies Used

- **Backend**: Spring Boot, Spring Data JPA, H2 Database
- **Frontend**: Angular, HttpClient
- **Build Tool**: Maven

## Features

- Submit person information (name, age, title and hometown).
- Retrieve a list of all persons.

## Getting Started

### Prerequisites

- Java 11 or later
- Node.js and npm
- Maven

### Backend Setup

1. Clone the repository:
   git clone https://github.com/shilpamungi/_DataEntryApplication.git

2. Run the application
   ./mvnw spring-boot:run
   The backend will run on http://localhost:8080.

 ###  Frontend Setup
 Setup steps available in README.md of Angular UI Application.
 1. Serve the Angular application along with springboot so that they work together.
ng serve

The frontend will run on http://localhost:4200.

### Usage
Open your web browser and go to http://localhost:4200.
Fill in the form to add a person’s name, age, title and hometown.
Name and Title are required fields which shows error message when not entered. Also Submit button will be disabled untill required fields are entered.
Submit the form to see success message in another page and new entry listed in table alongwith all previous entries.

   


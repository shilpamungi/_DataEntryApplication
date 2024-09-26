# Person Info Application

This is a full-stack application that allows users to submit and retrieve person information. The application consists of a Spring Boot backend and an Angular frontend.
## Technologies Used

- **Backend**: Spring Boot, Spring Data JPA, H2 Database
- **Frontend**: Angular, RxJS, HttpClient
- **Build Tool**: Maven

## Features

- Submit person information (name, age, title and hometown).
- Retrieve a list of all persons.
- View person details by ID.

## Getting Started

### Prerequisites

- Java 11 or later
- Node.js and npm
- Maven

### Backend Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/shilpamungi/_DataEntryApplication.git

2. Run the application
   ./mvnw spring-boot:run
   The backend will run on http://localhost:8080.

 ###  Frontend Setup
1. Navigate to the Angular project directory:
cd angular-ui

2. Install dependencies:
npm install

3. Serve the Angular application:
ng serve

The frontend will run on http://localhost:4200.

### Usage
Open your web browser and go to http://localhost:4200.
Fill in the form to add a person’s name, age, tutle and hometown.
Submit the form to see the new entry listed below.
You can also search for all the person's added.

   


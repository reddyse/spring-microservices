# User and Department Microservices

This repository contains two microservices: User and Department. Each microservice is designed to handle specific functionalities related to user management and department management, respectively.

## User Microservice

The User microservice is responsible for managing user-related operations such as creating and retrieving user information. It provides APIs to interact with user data stored in a database.

### Technologies Used

- Java 17
- Springboot 3.1.1
- Dependencies
  - Lombok
  - H2 database
  - Spring Data JPA
  - Spring Web
  - Eureka Discovery Client
- RESTful API design

### Getting Started

To run the User microservice locally, follow these steps:

1. Clone this repository: `git clone https://github.com/reddyse/spring-microservices.git`
//2. Navigate to the User microservice directory: `cd user-department-microservices/user`
//3. Install the dependencies: `npm install`
//4. Configure the database connection in `config.js` file.
//5. Start the microservice: `npm start`
6. The User microservice will be running at `http://localhost:9001`.

### API Endpoints

The User microservice exposes the following API endpoints:

//- `GET /users` - Retrieve all users
- `GET /users/:id` - Retrieve a specific user by ID
- `POST /users` - Create a new user
//- `PUT /users/:id` - Update a user by ID
//- `DELETE /users/:id` - Delete a user by ID

## Department Microservice

The Department microservice is responsible for managing department-related operations such as creating, retrieving, updating, and deleting department information. It provides APIs to interact with department data stored in a database.

### Technologies Used

- Java
- Springboot
- H2 Database
- RESTful API design

### Getting Started

To run the Department microservice locally, follow these steps:

1. Clone this repository: `git clone https://github.com/your-username/user-department-microservices.git`
//2. Navigate to the Department microservice directory: `cd user-department-microservices/department`
//3. Install the dependencies: `npm install`
//4. Configure the database connection in `config.js` file.
//5. Start the microservice: `npm start`
6. The Department microservice will be running at `http://localhost:9002`.

### API Endpoints

The Department microservice exposes the following API endpoints:

//- `GET /departments` - Retrieve all departments
- `GET /departments/:id` - Retrieve a specific department by ID
- `POST /departments` - Create a new department
//- `PUT /departments/:id` - Update a department by ID
//- `DELETE /departments/:id` - Delete a department by ID

For detailed information about request/response payloads and examples, refer to the Department microservice's API documentation.

## Contributing

Contributions are welcome! If you want to contribute to this project, please follow these steps:

1. Fork this repository.
2. Create a new branch: `git checkout -b feature/my-feature`.
3. Make your changes and commit them: `git commit -m 'Add some feature'`.
4. Push to the branch: `git push origin feature/my-feature`.
5. Submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

If you have any questions or suggestions, please feel free to reach out to us:

- Email: [praneethsettipalli@gmail.com](mailto:praneethsettipalli@gmail.com)

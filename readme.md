Coding Challenge 2 - Backend API

### Task

Please develop a small API using the language of your choice that will enable a front end application to connect into
your API and search for a list of Rick&amp;Morty characters by name. The API should provide a GraphQL endpoint to enable
the user to search for a list of characters, as detailed in the documentation
here: https://rickandmortyapi.com/documentation
The API should have a way for the user to search through the characters by name
The characters provided as a result should follow the schema detailed in documentation
It is not necessary to pull the data from a database. It will absolutely suffice to emulate the database by
hardcoding a few results.

### Description

Very Simple GraphQL API to retrieve a list of Customer (following the above specification) by given non unique name.
Offers an graphql endpoint under http://localhost:8080/graphql following the defined schema. To change this endpoint
the file .graphqlconfig needs to be adjusted.

### Install and Startup without

- Unzip tar
- Startup Application via via IDE or run command: ```java -jar target/graphQLEndpoint-1.0.0.jar```
- Test endpoint via curl, http or http://localhost:8080/graphiql?path=/graphql

### Install and Startup with Docker

- To build as image run: ``` docker build --tag=graphql-endpoint:latest ```
- To run image: ``` docker run -p 8080:8080 graphql-endpoint:latest ```
- Application is now avaiable under localhost:8080/graphiql
- Test endpoint via curl, http or http://localhost:8080/graphiql?path=/graphql

### Implementation Log

- Read task description
- Concept first idea
- Create project
- Read schema definition and create graph ql schema
- Create java objects
- Create api controller
- Populate in-memory db
- Test service and provide proof of correctness
- Test service using: http://localhost:8080/graphiql?path=/graphql
- Adjust graphql config
- Add simple logging
- BONUS: Dockerize Application
- Refactoring and closing task
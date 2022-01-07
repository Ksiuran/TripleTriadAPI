# TripleTriadAPI

## Project Description

Triple Triad is a staple deckbuilding competitive card game found in the Final Fantasy game series. This application focuses on the newest edition of the game from the massively multiplayer Final Fantasy XIV. The game consists of two players, each with their own deck of 6 unique cards, and hundreds of possible combinations of cards from a vast collection that grows with every update to the live game. Our API collects and stores to the database relevant information about the cards from an outside API to keep up to date with the growing collection database. The user interface supports account creation, authentication, and collection and deck management. 

## Technologies Used

* Java
* Spring Boot
* Spring Data JPA with Hibernate
* PostgreSQL
* JUnit
* Mockito

## Features

List of features ready and TODOs for future development
* Creating an account
* Adding individual or all cards to your account
* Fetches cards from external api
* Building and saving a deck

To-do list:
* Finish Deck implementation
* Finish Game implementation

## Getting Started
   
Standard java application install, since we are not supplying a built jar you will need to pull the source code and build it.  
`git clone https://github.com/Dragonimi/TripleTriadAPI`  
Run the above command to obtain the source locally  
`cd /TripleTriadAPI`  
`git checkout dev`  
Running those two commands will move you into the project root and switch you to the dev branch.  
`git pull`  
Sanity pull to make sure you are up-to-date.  
Currently main is far behind dev and does not have the listed features.  
At this point you should be in your IDE, this is a Maven project so do whatever action you need to to fetch the dependencies.  
To get the application running you need a working application.yml, we has ours connected to an external database with sensitive information so it could not be uploaded.  
Below is a sample application.yml to get the application running using a h2 local database.  
```
server:
  port: 5000
  servlet:
    context-path: /ttapi

spring:
  application:
    name: TripleTriadAPI
  datasource:
    url: jdbc:h2:file:./resources;MODE=PostgreSQL;
    username: sa
    password: password
    driverClassName: org.h2.Driver
  jpa:
    database-platform: org.hibernate.dialect.H2Dialect
    show-sql: true
    hibernate:
      ddl-auto: create
  h2:
    console:
      enabled: true #http://localhost:5000/ttapi/h2-console
      settings:
       web-allow-others: false
```

With this file placed in src/main/resources you should be good to go.  
In the project root run `mvn spring-boot:run`   

If you see something like `Started TtapiApplication in #.### seconds (JVM running for #.###)`  
congratulations, the api is set up and running.  

## Usage

After the application is successfully installed and running there is no direct interactions points with it, you will need to either use the ui we built [Ui Link](https://github.com/hoyzington/triple-triad-ui/tree/dev) or an application like Postman to interact with the endpoints directly.

## Contributors

* Scott Hoisington
* Alexander Snell
* Jong Soo Chong
* William Nelson
* Wilson Neely

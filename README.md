# Eureka Server Overview

This project sets up a Eureka Server, a service registry for microservices, using Spring Boot and Spring Cloud Netflix. Eureka Server enables service discovery, allowing microservices to find and communicate with each other dynamically.

## Project Structure

- **`EurekaserverApplication.java`**: The main Spring Boot application class that initializes the Eureka Server.
- **`application.properties`**: Configuration file for setting up Eureka Server properties.
- **`pom.xml`**: Maven configuration file for managing dependencies and build settings.

## Code Explanation

### `EurekaserverApplication.java`

```java
package com.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaserverApplication.class, args);
    }

}


@SpringBootApplication: Annotation that marks the class as a Spring Boot application.

@EnableEurekaServer: Annotation that enables the Eureka Server functionality.

SpringApplication.run: Starts the Spring Boot application.


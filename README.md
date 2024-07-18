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
```

- **`@SpringBootApplication:`** Annotation that marks the class as a Spring Boot application.

- **`@EnableEurekaServer:`** Annotation that enables the Eureka Server functionality.

- **`SpringApplication.run:`** Starts the Spring Boot application.

## application.properties

```
spring.application.name=eurekaserver

server.port=8761

eureka.instance.hostname=localhost

eureka.client.registerWithEureka=false

eureka.client.fetchRegistry=false

eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka/

```

- **`spring.application.name:`** Sets the name of the application.

- **`server.port:`** Configures the port on which Eureka Server will run (8761).

- **`eureka.instance.hostname:`** Specifies the hostname of the Eureka Server instance.

- **`eureka.client.registerWithEureka:`** Disables registration of Eureka Server with itself (since it does not need to register).

- **`eureka.client.fetchRegistry:`** Disables fetching the registry (since it does not need to fetch registry data).

- **`eureka.client.serviceUrl.defaultZone:`** Defines the URL where Eureka Server will expose its service registry.


## pom.xml

```
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.7.9</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.eurekaserver</groupId>
	<artifactId>eurekaserver</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>eurekaserver</name>
	<description>Demo project for Spring Boot</description>
	<properties>
        <java.version>17</java.version>
        <spring-cloud.version>2021.0.6</spring-cloud.version>
    </properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
	<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-dependencies</artifactId>
				<version>${spring-cloud.version}</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>
</project>

```

- **`spring-cloud-starter-netflix-eureka-server:`** Dependency for adding Eureka Server functionality.

- **`spring-boot-starter-test:`** Dependency for testing.

- **`spring-cloud-dependencies:`** Manages Spring Cloud versions.

- **`spring-boot-maven-plugin:`** Plugin for building and running Spring Boot applications.


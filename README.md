## Eureka Server Overview

**Eureka Server** is a REST-based service provided by Netflix and is part of the Spring Cloud ecosystem. It is used for service discovery in microservices architectures. Eureka Server helps services find each other in a distributed system by maintaining a registry of service instances.

### Key Features

- **Service Registration**: Microservices register themselves with the Eureka Server. This process involves providing information such as service name, instance ID, and network location (e.g., IP address and port).

- **Service Discovery**: Services can query the Eureka Server to discover the locations of other services. This allows for dynamic interaction between services without hard-coded addresses.

- **Load Balancing**: By leveraging the service registry, Eureka facilitates client-side load balancing. Services can obtain a list of available instances and distribute requests among them.

- **Health Checks**: Eureka Server performs periodic health checks on registered services to ensure they are available. If a service fails to respond, it can be automatically removed from the registry.

- **Fault Tolerance**: Eureka Server itself is designed to be highly available. Even if one instance of Eureka Server fails, other instances can continue to provide service discovery.

### How It Works

1. **Service Registration**: When a microservice starts, it registers with the Eureka Server by sending a request with its metadata. The Eureka Server maintains this information in its registry.

2. **Service Discovery**: When a microservice needs to interact with another service, it queries the Eureka Server to get the list of instances and their locations.

3. **Heartbeat Mechanism**: Registered services send periodic heartbeats to the Eureka Server to indicate that they are still active. If a service fails to send a heartbeat within a specified time, it is considered unavailable and is removed from the registry.

4. **Client-Side Load Balancing**: Clients use the information from the Eureka Server to perform load balancing by selecting from a list of available service instances.

### Benefits

- **Dynamic Discovery**: Allows services to discover each other dynamically without manual configuration.
 
- **Scalability**: Supports adding or removing service instances dynamically, enhancing scalability.
 
- **High Availability**: Provides fault tolerance and high availability through service replication and backup instances.

### Common Use Case

Eureka Server is often used in microservices architectures where services need to interact with each other and require a centralized way to manage service locations. It is commonly used in conjunction with other Spring Cloud components such as Zuul (API Gateway) and Ribbon (client-side load balancing).




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


# Microservices Overview

## What is Microservices?

Microservices is an architectural style where an application is composed of small, independent services that communicate through APIs. Each service handles a specific business function and can be developed, deployed, and scaled separately.

## Why Use Microservices?

- **Scalability**: Scale individual services independently based on demand.
 
- **Flexibility**: Develop, deploy, and scale services separately.
 
- **Resilience**: Faults in one service do not affect others.
  
- **Technology Diversity**: Use different technologies for different services.
  
- **Faster Deployment**: Accelerate development cycles and releases.

## Advantages Over Monolithic Apps

- **Modularity**: Easier to understand and maintain.
 
- **Independent Deployment**: Reduce downtime and support continuous delivery.
  
- **Targeted Scaling**: Scale services individually.
  
- **Tech Variety**: Choose the best tools for each service.
 
- **Fault Isolation**: Minimize the impact of failures.

## Major Patterns in Microservices

- **Service Discovery**: Mechanism for services to find and communicate with each other dynamically without hard-coded addresses.

- **Load Balancing**: Distributes incoming network traffic across multiple instances of a service to avoid overloading any single instance and to enhance availability.

- **API Gateways**: Acts as a single entry point for all clients. Routes requests to the appropriate services, handles authentication, and aggregates responses.

- **Configuration & Credentials Management**: Centralized management of service configurations and sensitive credentials to ensure secure and consistent access across services.

- **Failover**: Provides redundancy and automatic switching to a backup service in case of a failure, ensuring high availability and reliability.

- **Distributed Tracing**: Tracks and visualizes requests as they travel through various services, aiding in debugging and performance monitoring.

- **Log Aggregation**: Collects and consolidates logs from various services into a centralized location for easier analysis and troubleshooting.

- **Monitoring**: Continuous observation of services and their performance metrics to ensure they are running smoothly and to detect issues early.

- **Circuit Breaker**: Prevents a failure in one service from cascading to others by detecting faults and temporarily stopping interactions with the failing service.
  

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



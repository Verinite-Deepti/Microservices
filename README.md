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
  


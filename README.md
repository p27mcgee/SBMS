This repository contains three Spring Boot projects comprising a simple
microservice based website.  It includes a Netflix Eureka server for service 
discovery, a simple private microservice for entity data and a public API 
"edge server" that uses the the entity microservice as its backend.
	
As presently configured the following URLs are of interest:

The Eureka Server Status page: 

	http://localhost:8761

The entity (internal) microservice:
 
	http://localhost:8088/items
	
The edge (public) API server:
	
	http://localhost:8088/top-brands
	

This code is based on the tutorial:  

	https://www.edureka.co/blog/microservices-with-spring-boot
	
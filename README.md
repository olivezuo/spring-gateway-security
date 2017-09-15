# spring-gateway-security

This is a special project which take care of the authorization for the Gateway layer in the microservice environment.
The project need to work with project [spring-web-security](https://github.com/olivezuo/spring-web-security). 
spring-web-security is responsible to authenticate the user and manage the session.

## Spring Boot Security
* Use PreAuthenticatedAuthenticationProvider.
* Use the session created by spring-web-security in web layer.
* Only do authorization.
* ACL stored in DB
* Using Redis to cache user ACL.

## Customization 
* The permission evaluator
* Possible to create new security expression 

## Future change
* Move the ACL to a independent service. 
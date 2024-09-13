Basics

Spring security is a powerful framework in Spring that helps secure your web application.

How it works

spring has got many components, we’ll understand every thing

From spring initializer, include the spring security dependency

this is automatically loaded, inbuilt form is loaded

password for development purpose is given

default username is user

our api was protected behind the login wall

- every time we re-run our application, a new dev password is generated
- to fix the password we add a property

```
spring.application.name=springsecurity
spring.security.user.password=demo@123
spring.security.user.name=admin
```

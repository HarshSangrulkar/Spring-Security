Basics

Spring security is a powerful framework in Spring that helps secure your web application.

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/ec89815b-5f53-4b3d-9435-1080bfb08f13/a34d0af9-df6b-470a-aa03-b08252abe3c3/image.png)

How it works

spring has got many components, we’ll understand every thing

From spring initializer, include the spring security dependency

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/ec89815b-5f53-4b3d-9435-1080bfb08f13/1b5d7d46-05e5-42ff-907a-0ceb5161f0ef/image.png)

this is automatically loaded, inbuilt form is loaded

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/ec89815b-5f53-4b3d-9435-1080bfb08f13/b576c782-32d7-4f32-b5cd-2a22a816eef3/image.png)

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

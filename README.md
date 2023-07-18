## MockTest- Backend (Spring-Boot, MySQL, Swagger3, JWT)
This is `MockBook` exam portal monolithic Backend RestAPI developed by Spring-Boot3, MySql
, all Rest endpoints are secured with JWT, spring security3 and endpoints are documented 
using swagger3(OpenAPI).

#### Functionalities
* Application is fully secured with JWT (SpringSecurity3.0) based authentication and authorization.
* There is role based authentication in application where users has two roles `ROLE_NORMAL`, `ROLE_ADMIN`.
* Admin has access to all endpoints API to performs operations such as Create, Read, Update and Delete.
* Users has only access to View Questions related API response on dashboard.
* User start any quiz from anyone category and attempt test and submit to see his/her result.
* Version2.0 of this test portal is under working with fully microservice based architecture where more functionality are integrated.

### Requirements
* `JDK-17`, `SpringBoot3.0.7`, `MySQL8.0`, `PostMan`, `Maven3.4`, `IntellijIDEA`.
* Clone this project in local folder.
* Create a database in mysql `create database mock_test;`.
* Go to main application of @SpringBoot and run.
* Table of each entity is generated automatically.
* Go to browser and hit `http:localhost:8182/swagger-ui/index.html`
* See all endpoints and learn.
* Go to postman and signup from there then login using email and password you will definetly access endpoints.
* (Or take reference from mock_test-databases folder.)


### Screenshots
<img width="959" alt="1" src="https://github.com/abhinav8949/mockbook-Backend/assets/63671705/d63e078e-b033-440d-9575-00027e832521">
<img width="953" alt="2" src="https://github.com/abhinav8949/mockbook-Backend/assets/63671705/d5dba501-d931-472c-a4d6-5619f6a64a2c">
<img width="944" alt="3" src="https://github.com/abhinav8949/mockbook-Backend/assets/63671705/722cd159-7125-4e7b-b54e-8263e293b56a">
<img width="950" alt="4" src="https://github.com/abhinav8949/mockbook-Backend/assets/63671705/78d03917-e5da-4df1-bd0a-b97f67580061">
<img width="943" alt="5" src="https://github.com/abhinav8949/mockbook-Backend/assets/63671705/43a106fe-1fd9-4df7-8056-c58d9236af59">
<img width="941" alt="6" src="https://github.com/abhinav8949/mockbook-Backend/assets/63671705/1b38bb0e-5312-4ae4-b6b6-576ba40e16fc">

**************--------Thanks--------**************

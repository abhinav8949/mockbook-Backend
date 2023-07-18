## MockTest- Backend
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
* Or import all table file from mock_test-databases folder from mysql-workbench.
* Go to main application of @SpringBoot and run.

### Screenshots

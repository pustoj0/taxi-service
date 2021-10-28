<h2> :pencil: About The Project</h2>

<p align="justify"> 
  Project is a basic implementation of taxi service Java application and is created to show my ability in using OOP, SOLID, JDBC and use of CRUD operation.
</p>

<h2> Features </h2>

- User authentication
- Display all car/driver/manufacturer
- Delete all car/driver/manufacturer
- Add driver to car
- Display all drivers of your car

<h2> Briefing </h2>

In this project driver is user and there are no division between roles, so every user is administrator. After creating account, he can manipulate cars/drivers/manufacturers in diffrent ways and have a way to see their properties. Project was created to test my current abilities so it has little commercial value.

<h2> Technologies </h2>

- Java 11
- MySQL
- JDBC
- Servlet Api
- JSP
- JSTL
- TomCat

<h2>How to start</h2>

- Install MySQL.
- Install Tomcat 9.x.x version.
- Fork this project and clone it.
- Initialise a database. Use resources/init_db.sql file located in resources and run it in your DBMS.
- Configure your database connection information in ConnectionUtil.java in java/util folder.
- Configure your Tomcat. Use artifact to deploy - web-practice:war-exploded, Application context - "/".
- Run this project using Tomcat's local server.

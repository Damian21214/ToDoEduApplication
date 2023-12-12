# ToDo Educational Application

<!-- TOC -->
* [ToDo Educational Application](#todo-educational-application)
  * [Objective](#objective)
  * [Description](#description)
  * [Conclusion](#conclusion)
  * [Technical Details](#technical-details)
  * [Step 1. Initial project skeleton and used tools](#step-1-initial-project-skeleton-and-used-tools)
  * [Step 2. Domain and entity modeling](#step-2-domain-and-entity-modeling)
    * [Entities and Records](#entities-and-records)
    * [Object-Relational Mapping (ORM)](#object-relational-mapping-orm)
      * [Pros](#pros)
      * [Cons](#cons)
    * [Entities vs Records](#entities-vs-records)
    * [Key concepts](#key-concepts)
    * [Conclusion](#conclusion-1)
  * [Step 3. Repositories](#step-3-repositories)
    * [Spring Boot Data Repositories**](#spring-boot-data-repositories)
    * [How to use Spring Boot Data Repositories](#how-to-use-spring-boot-data-repositories)
    * [Conclusion](#conclusion-2)
  * [Step 4. Sample Data](#step-4-sample-data)
  * [Step 5. Web Layer and REST in Web Applications](#step-5-web-layer-and-rest-in-web-applications)
    * [REST](#rest)
    * [Spring Boot Application](#spring-boot-application)
    * [RestController](#restcontroller)
    * [Controller](#controller)
    * [Main differences](#main-differences)
  * [Step 6. Service Layer](#step-6-service-layer)
  * [Step 7. REST Controller enrichment](#step-7-rest-controller-enrichment)
<!-- TOC -->

## Objective

The objective of the ToDo Educational Application is to demonstrate the entire process of creating a web application
from idea to working web service.

## Description

The application is a simple service that allows a user to create, edit, and delete to-do lists, and to manage tasks
within each list.

Lists will have a title, creation date, status (determined by the statuses of tasks on the list), and status change
date. List statuses are (created, in progress, completed).

Tasks will have a title, description, scheduled date, status change date, and status (created, planned, in progress,
completed).

For simplicity, aspects of multitenancy will be omitted, so the application will be single-user.

## Conclusion

The conclusion will present the development of the application for multitenancy and the security issue.

## Technical Details

The application will be developed using the following technologies:
[see Step 1](#step-1-initial-project-skeleton-and-used-tools)

## Step 1. Initial project skeleton and used tools

* [Java 21](https://openjdk.org/projects/jdk/21/)

  Alternatives:
    * [Kotlin](https://kotlinlang.org/)
    * [Groovy](https://groovy-lang.org/)
* [Spring Framework](https://spring.io/projects/spring-framework)
* [SpringBoot](https://spring.io/projects/spring-boot)
* [Spring initializr](https://start.spring.io/)
    * [Apache Maven](https://maven.apache.org/) build tool

      Alternatives:
        * [Gradle Groovy](https://gradle.org/)
        * [Gradle Kotlin](https://gradle.org/kotlin/)
    * Jar packaging - [Jar vs war](https://www.baeldung.com/java-jar-war-packaging)
    * Dependencies
        * [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
        * [HSQL DB](https://hsqldb.org/)
        * [Spring Web](https://spring.io/guides/gs/serving-web-content/)
        * [Thymeleaf](https://www.thymeleaf.org/)
        * [Lombok](https://projectlombok.org/)
            * [Junit](https://junit.org/junit5/)
* IDE [IntelliJ Idea](https://www.jetbrains.com/idea/)
    * [Eclipse](https://www.eclipse.org/)
    * [Spring Tools 4 for Eclipse](https://spring.io/tools)
    * [Spring Tools 4 for Theia](https://github.com/spring-projects/sts4/wiki/Installation#theia)
    * [Spring Tools 4 for Visual Studio Code](https://marketplace.visualstudio.com/items?itemName=vmware.vscode-boot-dev-pack)
    *
  Net[Beans](https://netbeans.apache.org/front/main/) + [NB SpringBoot](https://plugins.netbeans.apache.org/catalogue/?id=4)
* VCS [Git](https://git-scm.com/)
* [GitHub](https://github.com/)

## Step 2. Domain and entity modeling

### Entities and Records

_Entities_ are objects that represent real-world entities, such as customers, products, or orders.
They have a unique identity and can be stored in a database.
Records are rows in a database table. They represent a single instance of an entity.
The main difference between entities and records is that entities are objects,
while records are rows in a database table.
Entities have a unique identity, while records do not.

### Object-Relational Mapping (ORM)

Object-relational mapping (ORM) is a technique that allows you to map objects to database tables.
ORM frameworks provide a way to abstract the details of database access from your application code.

ORM frameworks typically use a data mapper to map objects to records.
The data mapper is responsible for converting objects to records and vice versa.

ORM frameworks can be a powerful tool for simplifying database access.
They can make your code more maintainable and efficient.

#### Pros

* Increased productivity - ORM frameworks can automate many of the tasks involved in database access, such as creating
  and
  updating records. This can free up your developers to focus on other aspects of your application.
* Improved maintainability - ORM frameworks can help you to keep your database access code consistent. This can make it
  easier to maintain your application as it evolves.
* Increased performance - ORM frameworks can sometimes improve the performance of your database access code. This is
  because they can take advantage of database-specific optimizations.

#### Cons

* Complexity - ORM frameworks can add complexity to your application code. This is because you need to learn how to use
  the
  framework and its associated annotations.
* Performance - ORM frameworks can sometimes degrade the performance of your database access code. This is because they
  add
  a layer of abstraction between your application code and the database.

### Entities vs Records

Entities and records are two different ways of representing data in a database. Entities are objects that represent
real-world entities, while records are rows in a database table. ORM is a technique that allows you to map objects to
database tables.

* _Domain modeling_ is the process of defining the objects and relationships that exist in a business domain.
* _Entity modeling_ is a specific type of domain modeling that is used to represent objects in a database.
* _JPA_ is a Java API that provides a standard way to interact with databases.

### Key concepts

* _Objects_ - Things that exist in the business domain, such as customers, products, or orders.
* _Relationships_ - Connections between objects. They can be one-to-one, one-to-many, or many-to-many.
* _Entities_ - Objects that have a unique identity and that can be stored in a database.
* _Entity classes_ - Java classes that represent entities. They must be annotated with the `@Entity` annotation.

### Conclusion

Domain modeling and entity modeling are essential skills for any software developer who works with databases.

## Step 3. Repositories

### Spring Boot Data Repositories**

Spring Boot Data Repositories is a framework that provides a high-level abstraction for accessing data from a variety of
data stores.
It provides a consistent API for performing common data access operations, such as CRUD, without having to
worry about the underlying data store implementation.

**Benefits of using Spring Boot Data Repositories:**

* **Increased productivity:** Spring Boot Data Repositories can help you to write less code and focus on your
  application logic.
* **Improved maintainability:** Spring Boot Data Repositories can help you to keep your data access code consistent and
  easy to understand.
* **Increased performance:** Spring Boot Data Repositories can take advantage of database-specific optimizations to
  improve the performance of your data access code.

### How to use Spring Boot Data Repositories

To use Spring Boot Data Repositories, you need to annotate your entity classes with the `@Entity` annotation and your
repository interfaces with the `@Repository` annotation. You can then use the repository methods to perform data access
operations.

**Example:**

The following example shows how to use Spring Boot Data Repositories to create a repository for a `Customer` entity:

```java

@Entity
public class Customer
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String email;

}

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>
{

}
```

This repository provides the following methods for performing data access operations on `Customer` entities:

* `save(Customer customer)`: Saves a `Customer` entity to the database.
* `findById(Long id)`: Returns the `Customer` entity with the specified ID.
* `findAll()`: Returns a list of all `Customer` entities.
* `delete(Customer customer)`: Deletes the specified `Customer` entity from the database.

### Conclusion

Spring Boot Data Repositories is a powerful framework that can help you to simplify data access in your Spring Boot
applications.
It provides a consistent API for performing common data access operations, without having to worry about
the underlying data store implementation.

## Step 4. Sample Data

Sample data is useful during the development phase for several reasons.
One is that it allows developers to test the functionality of the application more thoroughly.
This results in an immense improvement in the robustness and accuracy of one's code, as it implies addressing edge cases
early on in the development process.
Sample data also assists in the simulation of user behavior, which aids in the comprehension of how users would
interact with the application in the real world.

Moreover, Spring Boot as a flexible software development framework permits us to naturally integrate sample data loaded
from a simple SQL script.
To implement sample data in Spring Boot application, one of the methods is to utilize a file named `data.sql` situated
at project's root directory.
Spring Boot automatically identifies and executes this file at the startup, enabling developers to prepare the
application with predetermined data.

Let's suppose you have two entities, `Customer` and `Product`.
A simplified example of `data.sql` might look like this:
Remember that the structure and commands of your SQL data script would depend upon the specific database and ORM (i.e.,
JPA) annotations you're utilizing.

In conclusion, embracing sample data during the development process is a best practice that enables effective
functionality testing and realistic user behavior simulations. Coupling this with `data.sql` in your Spring Boot
application adds a layer of automation to your boilerplate routines.

## Step 5. Web Layer and REST in Web Applications

In the context of web applications, web layer, also known as the presentation layer, is the interface between the user
and the application. It includes all the components related to user interaction like HTML, CSS, JavaScript, templates,
and forms. It also includes the server-side technology that serves these client-side technologies, which is where
controllers come in.

### REST

REST (REpresentational State Transfer) is an architectural style for networked hypermedia applications, primarily used
for web services. The idea behind REST is to treat server-side resources (like data objects) as resources that can be
created, read, updated, and deleted using standard HTTP methods.

When building RESTful services, it's important to choose an appropriate client-server communication.
REST utilizes the standard HTTP methods GET (read), POST (create), PUT/PATCH (update), and DELETE (destroy).
In a RESTful system, URLs identify resources
(for example, "/users" might represent a collection of users, while "/users/1" might represent a user with the ID of 1).

### Spring Boot Application

Spring Boot provides an opinionated view of the Spring platform and libraries, making it easy to create stand-alone,
production-grade applications. It's designed to simplify the bootstrap and development process, aiming to make it easier
to start up a new project.

Spring Boot Applications typically involve some standard setup like application configuration, launching an application
server, or connecting to a database. Spring Boot auto-configures these steps based on the included dependencies and
allows us to focus more on business functionality rather than the setup.

### RestController

In Spring Boot, a `@RestController` is a specialized version of the controller which is a key part of the MVC paradigm.
It's used to build RESTful web services and has `@ResponseBody` annotation included by default. This means that whatever
value is returned by the controller methods is written directly to the HTTP response body.

For example, here's a simple `@RestController`:
In the above example, a GET request to "/hello" will return the string "Hello, World!".

### Controller

The `@Controller` annotation in Spring is a more traditional style controller and primarily used in combination with
rendered views. It doesn't include `@ResponseBody` by default. Therefore, method return values are interpreted as view
names.

Here's a simple example of a `@Controller`:
In this case, a GET request to "/hello" will return the view named "hello-view", using whatever template engine you've
configured (like Thymeleaf or FreeMarker). The `Model` is populated with a message attribute to be accessed within the
view.

### Main differences

The main difference between `@Controller` and `@RestController` lies in how the response is generated. `@Controller` is
used when we want to return a view (typically for a traditional web application where the server generates
HTML). `@RestController` is used when we want to return data directly to the caller (typically for a REST API that's
machine-readable, like JSON).

## Step 6. Service Layer

The service layer, commonly known as the business logic layer, is an abstract layer within a software architecture
pattern that specifies operation sequences, transaction procedures, and some complex business rules. In a web
application, the service layer acts as a bridge between controllers (web) and repositories (data), applying business
logic on data before relaying it for further actions.
Here is a general illustration in JVM-based web application:

```java

@Controller
public class ExampleController
{
	private final ExampleService exampleService;

	public ExampleController(final ExampleService exampleService)
	{
		this.exampleService = exampleService;
	}

	// HTTP handlers go here
}

@Service
public class ExampleService
{
	private final ExampleRepository exampleRepository;

	public ExampleService(final ExampleRepository exampleRepository)
	{
		this.exampleRepository = exampleRepository;
	}

	// Business rules and logic are applied here
}

@Repository
public interface ExampleRepository extends JpaRepository<Example, Long>
{
	// Database operations happen here
}
```

The `@Service `annotation in Spring Boot is a specialized form of the `@Component` annotation.
It is used at the class level, and Spring recognizes those classes as candidates for Spring beans.
It is part of the Spring stereotype annotations that help to clearly differentiate the roles of classes across layers in
the application.
It doesn't provide any additional behavior compared to `@Component`, rather, it's used for better code readability and
understanding.
Here is how you can define a service in Spring Boot:

```java

@Service
public class ExampleService
{
	// Your service logic goes here
} 
```

The above `ExampleService` is just a typical Spring bean but annotated with @Service. This annotation also allows for
automatic detection of classes for dependency injection when annotation-based configuration and classpath scanning are
used.

## Step 7. REST Controller enrichment

Server-side HTML rendering, AJAX, and Single Page Applications (SPA) are three different approaches to building web
applications.

### Brief comparison

1. Server-side HTML rendering: In this approach, the server generates the HTML content and sends it to the client
   whenever a request is made. The server processes the request, retrieves data from the database, and generates the
   HTML dynamically. The entire page is then sent to the client for display. This approach is traditional and has been
   widely used for many years.

2. AJAX (Asynchronous JavaScript and XML): AJAX allows for asynchronous communication between the client and server
   without requiring a full page reload. With AJAX, the client can make requests to the server in the background and
   receive data in various formats, such as JSON or XML. The client-side JavaScript then updates the HTML content
   dynamically based on the received data. This approach provides a more interactive user experience as it allows for
   partial updates without reloading the entire page.

3. Single Page Applications (SPA): SPAs are web applications that load a single HTML page initially and then dynamically
   update the content as the user interacts with the application. SPAs rely heavily on JavaScript frameworks like React,
   Angular, or Vue.js to handle routing, data fetching, and rendering on the client-side. The server primarily serves as
   an API endpoint, providing data to the client as requested. SPAs offer a highly responsive and fluid user experience
   as they minimize page reloads.

Each approach has its own advantages and considerations. Server-side HTML rendering is simpler to implement and provides
good initial page load performance. AJAX allows for partial updates and can enhance interactivity, but it requires more
complex client-side code. SPAs provide a highly interactive and seamless user experience but can be more complex to
develop and maintain.
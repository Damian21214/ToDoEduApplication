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
  * [Step 4: Sample Data](#step-4-sample-data)
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
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String email;

}

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

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




# ToDo Educational Application

<!-- TOC -->

* [ToDo Educational Application](#todo-educational-application)
    * [Objective](#objective)
    * [Description](#description)
    * [Conclusion](#conclusion)
    * [Technical Details](#technical-details)
    * [Step 1. Initial project skeleton and used tools](#step-1-initial-project-skeleton-and-used-tools)

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

## Step 2. Domain modeling


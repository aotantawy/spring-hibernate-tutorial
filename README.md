# General Concepts

## Table of contents

* [Objective](#-objective)
* [What's spring & why to use it?](#whats-spring--why-to-use-it)
* [Spring Goals](#spring-goals)
* [Spring Architecture](#spring-architecture)
* [dependency injection & inversion of control](#dependency-injection--inversion-of-control)
* [Java Bean](#java-bean)
* [Aspect-oriented programming](#aspect-oriented-programming)
* [Model-view-controller](#model-view-controller)
* [Data Access Objects (DAO)](#data-access-objects-dao)
* [Object-relational mapping (ORM)](#object-relational-mapping-orm)
* [References](#-references)

<img src="https://spring.io/images/OG-Spring.png" width="100%" height="500">

## 🎯 Objective

1. Learn the theory behind spring
2. grasp general concepts of spring

---

### What's spring & why to use it?

  - spring is a java framework for building web applications and it's released at 2004
  - spring came out to solve some problems in J2EE (Java enterprise edition)
      - Enterprise java bean and their complex configurations
      - poor performance
  - therefore, spring is a simplified version of java enterprise edition

### Spring Goals

  - lightweight development using POJO
  - loosely coupled app using dependency injection
  - declarative programming using AOP
  - Minimize boilerplate code

### Spring Architecture

  - spring was introduced through a layered architecture, each layer contains a set of modules (~20 modules) and all these modules are on top of the core layer, spring contains a spread set of layers so it uses **one-stop-shop philosophy**
  - Spring modules
      1. core: contains dependency injection feature which uses factory pattern to create beans in the project
      2. Aspect-oriented programming (AOP)
      3. Data Access Object
      4. Object-relational mapping
      5. Java Enterprise Edition (JEE)
      6. Web: contains MVC, web sockets

### Dependency injection & Inversion of control

  - Let say you create class A and this class take an object of class B as a parameter for the constructor, this hierarchy makes a dependency (class A depend upon class B), the problem arises when you have a set of classes and each class depend upon another class this will make your software highly coupled (bad architecture) as some parts will be collapsed when we change something
  ```java 
  class B {
    // Some code
  }
  
  class A {
    B obj;
    public A(B obj) {
      this.obj = obj;
    }
  }
  ```
  - SOLUTION: dependency injection instead of creating and controlling objects with ourselves we invert and delegate this task to someone else but who will be responsible? XML will make our software be loosely coupled as we will not hard code any object so no need to recompile the project


### Java Bean

  - it's nothing but a java class that should have 3 things:
      1. all member variables are private and have their setters and getters (setX,getX)
      2. default constructor 
      3. implement serializable
  - those beans will help us to achieve dependency injection and inversion of control principles

### Aspect-oriented programming

  - it's a programming paradigm that is used to increase software modularity by applying the separation of concerns principle
  - let say we have 5 different classes each of which needs a logger method this architecture has a bad smell as 5 different classes have the same function therefore we decided to create a new class called logger and any class that want to log either extend or use logger class
  - PROBLEM: 1-those classes will be highly dependent (coupling) on the cross-cutting class (logger class), 2- if we want to change some behavior of the logger class we need to pass through all the classes and modify them
  - SOLUTION: here is where the AOP will come to solve those problems
      1. Define pointcut (logger, security) point where it's used across multiple classes
      2. call those cross-cutting objects an aspect (logger aspect, security aspect) a special separated class
      3. create aspect configuration: these configurations will define what do you want to do and when

### Model-view-controller

  - it's a software design pattern "architecture" in which your software is separated into 3 parts:
      1. Model: this component is responsible for dealing with data in the database 
      2. View: this component is responsible for dealing with user view (UI) in which the user will interact with 
      3. Controller: responsible for managing the flow between Model, view, and dealing with user requests and response

### Data Access Objects (DAO)

  - it's a design pattern that provides an interface that provides access to underlying databases throughout some (CRUD) operations

  ```java
  public class Employee {
    private String name;
    public void setName(String name) {
      this.name = name;
    }
    public String getName() {
      return this.name;
    }
  }

  interface EmployeeDAO {
    List<Employee> getAllNames();
  }
  ```

### Object-relational mapping (ORM)

  - it's an abstract layer for accessing databases easily which maps data into simple objects (POJO or JSON)
  
---
    
## 🔗 References

1. [Spring & Hibernate for Beginners (includes spring boot)](https://www.udemy.com/course/spring-hibernate-tutorial/)
2. [Web development with java spring framework](https://www.coursera.org/learn/web-development-with-java-spring-framework/home/welcome) 


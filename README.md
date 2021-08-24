# General Concepts

## Table of contents

- [Objective](#-objective)
- [What's spring & why to use it?](#whats-spring--why-to-use-it)
- [Spring Goals](#spring-goals)
- [Spring Architecture](#spring-architecture)
- [dependency injection & inversion of control](#dependency-injection--inversion-of-control)
- [Spring Container](#spring-container)
- [Spring Bean](#spring-bean)
- [Bean Scope](#bean-scope)
- [Bean life cycle](#bean-life-cycle)
- [Aspect-oriented programming](#aspect-oriented-programming-aop)
- [Model-view-controller](#model-view-controller-mvc)
- [Data Access Objects (DAO)](#data-access-objects-dao)
- [Code Samples Structure](#code-samples-structure)
- [References](#-references)

<img src="https://spring.io/images/OG-Spring.png" title="spring logo, src:spring.io" width="100%" height="500">

--- 

## 🎯 Objective

1. Learn the theory behind spring
2. grasp general concepts of spring


### What's spring & why to use it?

- spring is a java framework for building web applications and it was released back in 2004
- spring came out to solve some problems in J2EE (Jakarta enterprise edition)
  1. Enterprise java bean (JEB) and their complex configurations
  2. poor performance
- therefore, we can generally say that spring is a simplified version for building java enterprise applications

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

- Let say you create class A and this class take an object of class B as a parameter for the constructor, this hierarchy makes a dependency (class A depend upon class B), the problem arises when you have a set of classes and each class depend upon another set of classes this will make your software highly coupled (bad architecture) as some parts will be collapsed when we change something

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

- in order to, make software loosely coupled we need to apply:
  1. Inversion of control principle: to create and manage objects
  2. Dependency injection principle: to inject required dependencies for each object

### Spring container

- it's one of the core components of spring framework which is responsible for assembling and maintaining objects from creation till destruction and it uses dependency injection (DI) to build a certain object

### Spring Bean

- basically it's a java object which is created and maintained through spring IOC container and it forms the backbone for any spring application

### Bean Scope

- bean scope is responsible for deciding:

  1. How long the bean will live?
  2. How many instances will be created?

  |     Scope      | Description                                             |
  | :------------: | :------------------------------------------------------ |
  |   Singleton    | Default scope, create one instance per spring container |
  |   Prototype    | Create new instance every time bean is requested        |
  |    Request     | Single bean instance per HTTP request                   |
  |    Session     | Single bean instance per HTTP session                   |
  | Global-session | Single bean instance per global HTTP session            |

### Bean life cycle

  <img src="https://media.geeksforgeeks.org/wp-content/uploads/20200428011831/Bean-Life-Cycle-Process-flow3.png" title="bean life cycle src:geeksforgeeks.org" width="100%" height="500">

### Aspect-oriented programming (AOP)

- it's a programming paradigm that uses the separation of concerns cross-cutting principle to increase modularity which consequently decreases coupling
- **Eg.** if we define 5 classes each one contains a logger object
- How to apply AOP ?
  1. define point-cut (logger, security), points where cross-cutting concerns are applied
  2. create aspect for each point-cut (logger aspect, security aspect) which defines what will this aspect do?
  3. create aspect configurations, which defines when and where will those aspects execute?

### Model-view-controller (MVC)

- it's a software architectural pattern in which your software is separated into 3 parts:
  <figure>
    <blockquote>
      <img src="https://qph.fs.quoracdn.net/main-qimg-c3f2bef1693561dfb24e0f00aa592c80" title="MVC, src:quora.com" width="100%" height="300" >
    </blockquote>
    <figurecaption>Ideal MVC</figurecaption>
  </figure>
  1. Model: it's a component that handles anything related to data in the software
  2. View: it's a component that deals with UI related stuff
  3. Controller: it's a component that manages flow between the other two components and handles any business logic in the software
  <figure>
    <blockquote>
      <img src="/diagrams/spring-mvc.png" title="Spring MVC" width="100%" height="300" >
    </blockquote>
    <figurecaption>Spring MVC</figurecaption>
  </figure> 

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


---

### Code samples structure
  <img src="/diagrams/class-diagram.png" title="Class diagram" width="100%" height="400">
  
  *Class Diagram*
  
  <img src="/diagrams/spring-components.png" title="Spring components" width="100%" height="400">
  
  *Spring Components*
  
  > **_Note:_** This is not the optimal structure and you may find some little changes in some examples for simplification purposes


## 🔗 References

1. [Spring & Hibernate for Beginners (includes spring boot)](https://www.udemy.com/course/spring-hibernate-tutorial/)
2. [Web development with java spring framework](https://www.coursera.org/learn/web-development-with-java-spring-framework/home/welcome)

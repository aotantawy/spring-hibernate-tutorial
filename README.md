# Table of Contents

- [Objective](#objective)
- [What is the spring Framework?](#what-is-the-spring-framework)
- [Why Spring framework came out?](#why-spring-framework-came-out)
- [What is spring architecture?](#what-is-spring-architecture)
- [Spring Beans](#spring-beans)
    - [What is a bean?](#what-is-a-bean)
    - [What is bean scope?](#what-is-bean-scope)
    - [What is bean life-cycle?](#what-is-bean-life-cycle)
- [What is dependency injection & inversion of control?](#what-is-dependency-injection-and-inversion-of-control)
- [What is aspect-oriented programming?](#what-is-aspect-oriented-programming)
- [Hibernate](#hibernate)
    - [What is hibernate?](#what-is-hibernate)
    - [What is an entity life-cycle?](#what-is-an-entity-life-cycle)
    - [What is cascading and their types?](#what-is-cascading-and-their-types)
    - [Difference between eager and lazy loading](#difference-between-eager-and-lazy-loading)
- [Resources](#resources)

<img src="https://spring.io/images/OG-Spring.png" title="spring logo, src:spring.io" width="100%" height="500">

## Objective

- grasp spring concepts
- learn the theory behind the Spring framework 

## What is the Spring Framework?

- it's a web framework for building web apps using java
- released in 2004

## Why Spring framework came out?

- to solve complex configurations in a java enterprise edition that uses java enterprise beans (EJB)
- also to enhance poor performance
- create loosely coupled software

## What is spring architecture?

- spring introduces a layered architecture; each layer contains a set of modules (~20 modules)
- through this layered architecture spring achieved one-stop-shop philosophy
- Modules:
    1. Core: contains dependency injection and inversion of control which uses a factory design pattern 
    2. Aspect-oriented programming: to remove cross-cutting concerns 
    3. Data access: contains JDBC, ORM
    4. Web: contains servlets, web sockets 

## Spring beans

### What is a bean?

- Simply, a bean is a java object which is created and destroyed through spring IOC and DI

### What is bean scope?

- bean scope is responsible for deciding:

  1. How long will the bean live?
  2. How many instances will be created?

  |     Scope      | Description                                             |
  | :------------: |:------------------------------------------------------: |
  |   Singleton    | Default scope, create one instance per Spring container |
  |   Prototype    | Create a new instance every time the bean is requested        |
  |    Request     | Single bean instance per HTTP request                   |
  |    Session     | Single bean instance per HTTP session                   |
  | Global-session | Single bean instance per global HTTP session            |

### What is bean life-cycle?

<img src="https://media.geeksforgeeks.org/wp-content/uploads/20200428011831/Bean-Life-Cycle-Process-flow3.png" title="bean life cycle src:geeksforgeeks.org" width="100%" height="500">

## What is Dependency Injection and Inversion of control?

- It's a process of delegating instantiation and assembling objects into:
    1. XML files
    2. XML using annotations
    3. other java code
- and to inject object dependencies you have to use:
    1. Constructor injection 
    2. Setter injection

## What is aspect-oriented programming?

- it's a programming paradigm that aims to increase modularity by separating cross-cutting concerns
- Steps:
    1. Define point-cut (logger, security) "cross-cutting concern"
    2. Define those points into something called aspect
    3. Define configuration for each aspect (when-where you want to call this aspect)

## Hibernate

### What is hibernate?

- It's an object-relational mapping that relies on a layer in between app and database to handle conversion between tables and classes
- Java App ⇒ hibernate ⇒ JDBC ⇒ DB

### What is an entity life-cycle?

1. transient (un-tracked)
2. persist (attached to the database so any change that happens will reflect on the database)
3. detached
4. removed

### What is cascading and their types?

- Apply the same changes-operations to related entities
- Types:
    1. Save
    2. Delete
    3. Detach
    4. All
    5. Remove
    6. merge

### Difference between eager and lazy loading

- Eager: loads all data at once
- Lazy: loads data whenever it's required-requested

## Resources

- [Coursera](https://www.coursera.org/learn/web-development-with-java-spring-framework/home/welcome)
- [Udemy](https://www.udemy.com/course/spring-hibernate-tutorial/)

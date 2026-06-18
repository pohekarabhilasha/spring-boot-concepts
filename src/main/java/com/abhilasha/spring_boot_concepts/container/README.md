# Spring Container

The Spring container is the part of the framework that creates, configures, wires, and manages all the beans in the application. At startup it reads the annotations, builds every bean, injects their dependencies, and holds them ready to use. It is the engine that implements IoC.

## What's in this folder

`ContainerDemoRunner.java` injects the `ApplicationContext` (which is the container itself) and fetches beans from it directly, by type and by name. It also prints how many beans the container is managing.

## Concepts covered

### The container
The container holds all managed objects (beans). Normally Spring injects beans for you, but you can also ask the container for a bean directly using `getBean()`.

### Two container types
BeanFactory is the basic container. It is lazy, so it creates a bean only when that bean is first requested, and it has minimal features.

ApplicationContext is a superset of BeanFactory. It adds features like event publishing, internationalization, and annotation processing, and it eagerly creates singleton beans at startup, so configuration errors show up immediately. This is the container used in practice, and Spring Boot configures one automatically.

### Fetching beans
`context.getBean(CardPayment.class)` gets a bean by its type.

`context.getBean("walletPayment")` gets a bean by its name. A `@Component` bean is named after its class with a lowercase first letter by default.

`context.getBeanDefinitionCount()` returns how many beans the container is managing.

## How to run

From the project root run `./mvnw spring-boot:run`. The demo prints the fetched beans and the total bean count at startup.

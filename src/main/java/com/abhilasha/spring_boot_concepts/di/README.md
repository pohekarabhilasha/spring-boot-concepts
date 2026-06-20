# Dependency Injection (DI)

Dependency Injection is the technique that implements IoC. Instead of a class creating its own dependencies with `new`, Spring supplies them from outside.

## What's in this folder

This demo uses a simple `Notifier` with two implementations, Email and SMS, to show the injection annotations together.

`Notifier.java` is the interface.

`EmailNotifier.java` is a `Notifier` marked `@Primary`, so it is the default.

`SmsNotifier.java` is the other `Notifier`.

`NotificationService.java` uses constructor injection and shows `@Primary` and `@Qualifier` working together.

`DiDemoRunner.java` runs at startup and prints both notifications.

## Concepts covered

### Three types of injection
Constructor injection passes the dependency through the constructor. This is the recommended type.

Setter injection passes the dependency through a setter method. Use it for optional dependencies.

Field injection puts `@Autowired` directly on the field. It is best avoided.

### Why constructor injection is preferred
The object is always complete, because required dependencies are provided at creation.

Fields can be marked `final`, so the object is immutable.

It is easy to test, because a mock can be passed into the constructor without needing Spring.

### Annotations
`@Autowired` tells Spring to inject a matching bean. It is not needed on a single constructor since Spring 4.3.

`@Primary` marks one bean as the default when several of the same type exist. Here Email is the default.

`@Qualifier` picks a specific bean by name. Here it picks SMS. If both are present, `@Qualifier` overrides `@Primary`.

## How to run

From the project root run `./mvnw spring-boot:run`. The demo prints an email notification, which is the `@Primary` default, and an SMS notification, which is chosen with `@Qualifier`.

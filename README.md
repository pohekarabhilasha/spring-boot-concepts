# Spring Boot Concepts!!

A topic-by-topic walkthrough of Spring Boot core concepts, with small, well-commented examples. Built for learners: clone it, read it, run the app, and use it as a quick reference before interviews.

## How to use this repo

Each concept is its own package under `src/main/java/com/abhilasha/spring_boot_concepts/`. Inside every package you'll find one or more small classes demonstrating the concept, each well commented.

This is a single Spring Boot application, so you run the whole thing once and each concept's demo prints its output at startup:

```
./mvnw spring-boot:run
```

You need Java 17 or later and Maven (the included `mvnw` wrapper handles Maven for you). Check Java with `java -version`.

## How the project was set up

Generated with [Spring Initializr](https://start.spring.io) using:

* Project: Maven
* Language: Java
* Spring Boot: 3.x
* Dependencies: Spring Web

To recreate it: open start.spring.io, pick the options above, click Generate, and unzip into your repo folder.

## Topics

* [ioc](https://github.com/pohekarabhilasha/spring-boot-concepts/tree/main/src/main/java/com/abhilasha/spring_boot_concepts/ioc) — Inversion of Control: the container creates and wires objects, no `new`

More topics are added one at a time as I work through them.

## Contributing

This is primarily a personal learning repo, but if you spot a bug or have a cleaner example, open an issue or PR — happy to take suggestions.

## License

[MIT](https://github.com/pohekarabhilasha/spring-boot-concepts/blob/main/LICENSE) — free to use, learn from, and share.

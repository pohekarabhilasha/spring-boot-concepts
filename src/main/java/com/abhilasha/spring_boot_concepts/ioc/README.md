# IoC - Inversion of Control

Inversion of Control is a design principle where the job of creating and managing objects is handed to the Spring container instead of being done in your own code. Normally you create objects with `new` and wire their dependencies yourself. With IoC, Spring creates the objects, manages their lifecycle, and injects their dependencies. You just declare what you need.

## What's in this folder

- `PaymentMethod.java` - the common interface that every payment type implements
- `CardPayment.java`, `WalletPayment.java`, `CashPayment.java` - three Spring-managed beans (`@Component`), each a different way to pay
- `IocDemoRunner.java` - runs at startup; Spring finds all three payment beans and injects them as a `List`, with no `new` anywhere

## Concepts covered

### What IoC means
- Traditional code: you create objects with `new` and stay in control
- IoC: the container creates and manages objects for you, so control is inverted

### Advantages
- **Loose coupling** - classes depend on the `PaymentMethod` interface, not a concrete class, so an implementation can be swapped without editing the class
- **Easier testing** - dependencies are injected, so a fake can be passed in during tests instead of the real one
- **No manual wiring** - Spring builds and connects the objects, so there is no `new` chain to write or maintain

### Injecting multiple beans
- Asking for `List<PaymentMethod>` makes Spring inject every bean of that type

## How to run

From the project root:

```
./mvnw spring-boot:run
```

The demo prints each payment method at startup, showing that Spring created and wired all three beans on its own.

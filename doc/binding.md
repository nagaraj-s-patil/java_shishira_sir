**Static Binding (Early Binding)** occurs at **compile time** and is used for:

- `private` methods
- `final` methods
- `static` methods

In static binding, the method call is resolved by the compiler based on the reference type.

### Example:

```java
class Animal {
    static void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    static void sound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();  // Reference type is Animal
        animal.sound();  // Output: "Animal sound"
    }
}
```

### Explanation:

- Even though the object `animal` refers to a `Dog`, since `sound()` is a `static` method, **the method is resolved at compile time based on the reference type** (which is `Animal`).
- This is **early binding**, and the `Animal`'s `sound()` method is called, not the `Dog`'s version.

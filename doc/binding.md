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


## Inheritance in Java

**Inheritance** is one of the fundamental concepts of Object-Oriented Programming (OOP). It allows a new class (called a **subclass** or **child class**) to inherit the properties and behaviors (fields and methods) from an existing class (called a **superclass** or **parent class**). This promotes code reusability and establishes a relationship between the parent and child class.

### Types of Inheritance

1. **Single Inheritance**:
   - A subclass inherits from one superclass.
   - Example: 
     ```java
     class Animal {
         void sound() {
             System.out.println("Animal makes sound");
         }
     }
     
     class Dog extends Animal {
         void bark() {
             System.out.println("Dog barks");
         }
     }
     ```

2. **Multilevel Inheritance**:
   - A subclass can inherit from another subclass, forming a chain of inheritance.
   - Example:
     ```java
     class Animal {
         void sound() {
             System.out.println("Animal makes sound");
         }
     }
     
     class Dog extends Animal {
         void bark() {
             System.out.println("Dog barks");
         }
     }
     
     class Puppy extends Dog {
         void play() {
             System.out.println("Puppy plays");
         }
     }
     ```

3. **Hierarchical Inheritance**:
   - Multiple subclasses inherit from a single superclass.
   - Example:
     ```java
     class Animal {
         void sound() {
             System.out.println("Animal makes sound");
         }
     }
     
     class Dog extends Animal {
         void bark() {
             System.out.println("Dog barks");
         }
     }
     
     class Cat extends Animal {
         void meow() {
             System.out.println("Cat meows");
         }
     }
     ```

4. **Multiple Inheritance (Not directly supported in Java)**:
   - A subclass inherits from multiple superclasses. Java does not support multiple inheritance through classes to avoid complexity and ambiguity, but it can be achieved using interfaces.
   - Example using **interfaces**:
     ```java
     interface Animal {
         void sound();
     }
     
     interface Pet {
         void play();
     }
     
     class Dog implements Animal, Pet {
         public void sound() {
             System.out.println("Dog makes sound");
         }
         
         public void play() {
             System.out.println("Dog plays");
         }
     }
     ```

5. **Hybrid Inheritance (Not directly supported in Java)**:
   - A combination of more than one type of inheritance. This is usually achieved using interfaces.

### Advantages of Inheritance

1. **Code Reusability**:
   - Inheritance allows you to reuse the code of an existing class without rewriting it, reducing redundancy and promoting maintainability.

2. **Extensibility**:
   - New classes can be easily created by extending existing classes, thus adding new features without altering the existing code.

3. **Method Overriding**:
   - Inheritance allows child classes to override methods of the parent class, enabling dynamic polymorphism.

4. **Improved Maintainability**:
   - Since the code is organized and common functionalities are placed in the superclass, maintaining and updating code becomes easier.

5. **Data Encapsulation**:
   - Inheritance helps in hiding implementation details by keeping common data in the parent class and using it in subclasses.

6. **Promotes a hierarchical classification**:
   - Inheritance models real-world relationships like "is-a" relationships (e.g., a Dog "is a" type of Animal), which help in organizing classes and objects logically.


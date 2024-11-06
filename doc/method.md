
## Methods

A method is a member of a class that represents specific functionality.

In Java, a method represents the behavior of an object.

A class can have multiple methods in any order.

A method never executes on its own; it must be invoked.

A method can be invoked multiple times.
```java
class Pen {
    void write() {
        System.out.println("pen write");
    }
    public static void main(String[] args) {
        System.out.println("main Start");
        Pen p = new Pen();
        p.write();
        p.write();
        p.write();
        System.out.println("main End");
    }
}
```

### Output:

```java
main Start
pen write
pen write
pen write
main End
```

### There are 2 Categories of Methods:

#### 1. Concrete Method
#### 2. Abstract Method

### Concrete Method:

A Concrete Method is a method which has both declaration as well as implementation (definition).

```java
void meth()                    ->   Declaration  
{ 
 //body / logic / implementation -> Implementation 
}
```

### Abstract Method:

An Abstract Method is a Method which has only Method Declaration, but no method implementation.

- Abstract Method must be terminated with a semicolon.
- Abstract method must be declared by using the keyword `abstract`.
- Abstract method cannot have a body.

**Note:** The `main` method is also a method which is automatically executed by JVM.  
We can invoke the `main` method, but it's not a good practice.


c



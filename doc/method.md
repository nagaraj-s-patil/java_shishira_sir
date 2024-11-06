
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


# Return Statement, Return Type, and Method Rules in Java

## Return Statement:

A **return statement** is used to send data back from a method to where it was called. The **return keyword** is used to return the data.

Example:  
```java
public int addNumbers(int a, int b) {
    return a + b;  // Returning the sum of a and b
}
```

---

## Return Type:

The **return type** specifies what kind of data a method will return. For example, it can be `int`, `String`, `double`, etc. The return type must match the data that is returned by the method.

Example:
```java
public String greetUser(String name) {
    return "Hello, " + name;  // Returning a String
}
```

**Note:** The `void` keyword is used when a method doesn't return any data.  
Example:  
```java
public void printMessage(String message) {
    System.out.println(message);  // No return value
}
```

---

## Method Rules:

### 1) A void method can't return any data:


Example:
```java
public void printSum(int a, int b) {
    System.out.println("Sum: " + (a + b));  // Just prints the sum, doesn't return any data
}
```

### 2) A method must have a return type, either void or any other type:


Example:
```java
public int multiplyNumbers(int x, int y) {
    return x * y;  // Returning an integer value
}
```

### 3) If a method has a return type, then it must return the data:

Example:
```java
public boolean isEven(int number) {
    return number % 2 == 0;  // Returns true if the number is even
}
```

### 4) A method can't have multiple return types:


Example (Incorrect):
```java
public int calculate(int x) {
    if (x < 0) {
        return "Negative";  // Error: Mismatch of return type
    }
    return x * 2;  // Returns int
}
```

### 5) Logically, a method can't have multiple return statements:


Example:
```java
public int findMax(int a, int b) {
    if (a > b) {
        return a;  // Return if a is greater
    }
    return b;  // Return if b is greater
}
```

### 6) Returning data and the return type must match:

Example:
```java
public double calculateArea(double radius) {
    return Math.PI * radius * radius;  // Returns a double value
}
```

### 7) Inside a method, if we are returning the data, then the return statement must be the last executable code:


Example:
```java
public int sum(int a, int b) {
    return a + b;  // The return statement must be last
    System.out.println("This code will never execute");  // This won't be executed
}
```

---



## Methods

A method is a member of a class that represents specific functionality.

In Java, a method represents the behavior of an object.

A class can have multiple methods in any order.

A method never executes on its own; it must be invoked.

A method can be invoked multiple times.

```javaclass Pen {
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

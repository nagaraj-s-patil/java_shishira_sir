   <h2>Methods</h2>
    <p>A method is a member of a class that represents specific functionality.</p>
    <p>In Java, a method represents the behavior of an object.</p>
    <p>A class can have multiple methods in any order.</p>
    <p>A method never executes on its own; it must be invoked.</p>
    <p>A method can be invoked multiple times.</p>
    <pre><code>
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
    </code></pre>
    <h3>Output:</h3>
    <pre><code>
main Start
pen write
pen write
pen write
main End
    </code></pre>


<h3>There are 2  Categories of Methods: </h3>

<h3>1. Concrete Method. </h3>
<h3>2. Abstract Method. </h3>
<h3>concreate metod :-</h3>
	A Concrete Method is a method which has both declaration as well as implementation(diffination)

<pre><code>
void meth()                    ->   Declaration  
 
{ 
 //body / logic / implementation -> Implementation 
}
</code></pre>


<h3>abstract method:-</h3>

   An Abstract Method is a Method which has only Method Declaration , But no method 
implementation. 
Abstract Method must be terminated with semicolon. 
Abstract method must be declared by using keyword called abstract. 
Abstract method cannot have body.

note:- main is also a method which is atomaticalu executed by jvm
	we can also a invoke the main method but its not a good practice

<pre><code>
abstract void meth();  </code></pre>
                                 


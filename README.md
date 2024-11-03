<h2 title="class notes">Table of Contents</h2><table id="syllabus" title="Syllabus" style="width: 100%; border-collapse: collapse;">
<tr>
<td style="border: 1px solid #ddd; padding: 8px;">
 <a href="#what-is-java" aria-label="Jump to What is Java section">1. What is Java?</a>
 </td>
 <td style="border: 1px solid #ddd; padding: 8px;">
<a href="#key-features-of-java" aria-label="Jump to Key Features of Java section">2. Key Features of Java</a> </td>
</tr>
 <tr>
 <td style="border: 1px solid #ddd; padding: 8px;">
<a href="#object-state-and-behavior">3. Object State and Behavior</a>
</td> <td style="border: 1px solid #ddd; padding: 8px;">
 <a href="#class-and-object">4. Class and Object</a></td>
<td style="border: 1px solid #ddd; padding: 8px;">
<a href="#keywords">5. Keywords or Reserved Words</a></td></tr>
<tr> <td style="border: 1px solid #ddd; padding: 8px;">
 <a href="#identifiers">6. Identifiers</a> </td>
 <td style="border: 1px solid #ddd; padding: 8px;">
 <a href="#gpocn">7. Practices of Class Naming Convention</a>  </td>
<td style="border: 1px solid #ddd; padding: 8px;">
<a href="#javacompilationprocess">8. Java Compilation Process</a>  </td>
</tr>
 <tr>
 <td style="border: 1px solid #ddd; padding: 8px;"><a href="#association">9. Association (Has-A Relationship)</a>
</td><td style="border: 1px solid #ddd; padding: 8px;">
 <a href="#composition">10. Composition</a></td><td style="borde
<h2 id="what-is-java">What is Java?</h2><p>Java is an object-oriented programming language similar to C++, but with advanced and simplified features. It is known for its versatility, is free to access, and can run on various platforms, making it ideal for developing robust, scalable, and portable applications.</p>
<ul>
  <li><strong>Developed by:</strong> Sun Microsystems, with contributions from James Gosling and his team in the early 1990s.</li>
  <li><strong>Original Project Name:</strong> Oak</li>
  <li><strong>Current Owner:</strong> Oracle Corporation (since 2010)</li>
  <li><strong>Tagline:</strong> "Write once, run anywhere"</li>
  <li><strong>Latest Version:</strong> Java 12 (as of March 2019)</li>
</ul>

<p>Java is widely used alongside technologies like Spring, Node.js, Android, Hadoop, and J2EE to build full-fledged applications. It also supports continuous integration and testing using tools like Selenium.</p>

<h2 id="key-features-of-java">Key Features of Java</h2>
<ul>
  <li><strong>Simple</strong>: Java eliminates complexities seen in C++ (like pointers and operator overloading).</li>
  <li><strong>Portable</strong>: Being platform-independent, Java applications written on one platform can run on any other.</li>
  <li><strong>Object-Oriented</strong>: Java treats everything as an "object," with states and behaviors, enabling organized, reusable code.</li>
  <li><strong>Dynamic</strong>: Java adapts to an evolving environment, supporting dynamic memory allocation, which enhances application performance.</li>
  <li><strong>Robust</strong>: With strong memory management, Java eliminates many runtime errors through checks at both compile-time and runtime.</li>
</ul>

<p><strong>Note:</strong> In Java, a "Platform" is a combination of the Operating System (OS) and the Processor.</p>

<h1 id="object-state-and-behavior" >Object State and Behavior</h1>
<p >In object-oriented programming, an <strong>object</strong> represents a real-world physical entity. Anything or everything that physically exists can be considered an object.</p>

<h2>Object Characteristics</h2>
<ul>
  <li><strong>State</strong>: The state of an object refers to its properties or information that describes it.</li>
  <li><strong>Behavior</strong>: The behavior of an object is the action or work that the object can perform.</li>
</ul>

<h2>Example: Myntra Application</h2>
<p>Consider a product (e.g., a shoe) in the Myntra application. This product (shoe) is an object with specific states and behaviors.</p>

<h3>State</h3>
<ul>
  <li>Price</li>
  <li>Size</li>
  <li>Discount</li>
  <li>Color</li>
  <li>Customer Rating</li>
  <li>...and more</li>
</ul>

<h3>Behavior</h3>
<ul>
  <li><code>addToBag()</code> - Adds the item to the shopping bag.</li>
  <li><code>addToWishList()</code> - Adds the item to the wishlist.</li>
  <li><code>buy()</code> - Initiates the purchase of the item.</li>
  <li><code>cancel()</code> - Cancels the item order.</li>
</ul>

<hr>
<h2 id="class-and-object">📘 Class and Object</h2>

<h3>🔹 Class</h3>
<ul>
    <li>A class is a logical entity or blueprint used to create objects.</li>
    <li>It acts as a descriptor for an object, defining its structure and behavior.</li>
</ul>

<h3>🔹 Object</h3>
<ul>
    <li>An object cannot exist without a class. Therefore, the class must be created first.</li>
    <li>Objects are real-world physical entities and instances of a class.</li>
    <li>Multiple objects can be created from a single class, referred to as <b>similar</b> or <b>identical objects</b>.</li>
    <li>If one object is destroyed, it doesn't affect other objects or the class.</li>
    <li>Each object operates independently.</li>
</ul>

<h3>🔹 Programming Grammar</h3>
<p>
    The grammar of a programming language is called <b>syntax</b>.
</p>

<h2 id="keywords">🔑 Keywords (Reserved Words)</h2>

<p>
    Keywords are predefined words that are part of the programming language and have specific meanings.
</p>
<ul>
    <li>Each keyword has a predefined purpose and function within the language.</li>
    <li>In Java, there are around <b>53 keywords</b>, all written in lowercase.</li>
    <li>Examples include: <code>package</code>, <code>import</code>, <code>public</code>, <code>private</code>, <code>protected</code>, <code>class</code>, <code>new</code>, <code>this</code>, <code>super</code>, <code>interface</code>, <code>abstract</code>, <code>static</code>, <code>final</code>, <code>int</code>, <code>long</code>, <code>double</code>, <code>if</code>, <code>else</code>, <code>for</code>, etc.</li>
</ul>

<p>
    Java is a <b>case-sensitive programming language</b>, meaning it distinguishes between uppercase and lowercase letters.
</p>


<h2 id="identifiers">🔖 Identifiers</h2>

<p>
    An <b>identifier</b> is a name used to identify a Java member such as a class, interface, method, variable, constructor, package, or enum.
</p>

<h3>🔹 Identifier Rules</h3>
<ul>
    <li>Identifiers <b>cannot contain spaces</b>.</li>
    <p><i>Example:</i> <code>myVariable</code> (✅) vs. <code>my Variable</code> (❌)</p>   
    <li>Identifiers <b>cannot contain special characters</b> except <code>_</code> (underscore) and <code>$</code> (dollar sign).</li>
    <p><i>Example:</i> <code>my_variable</code> (✅), <code>$myVariable</code> (✅) vs. <code>my-variable</code> (❌)</p>    
    <li>Identifiers <b>cannot be Java keywords</b>.</li>
    <p><i>Example:</i> <code>className</code> (✅) vs. <code>class</code> (❌)</p>    
    <li>Identifiers can include numbers but <b>must not start with a number</b>.</li>
    <p><i>Example:</i> <code>variable1</code> (✅) vs. <code>1variable</code> (❌)</p>
</ul>

<h3>🔹 Examples of Valid Identifiers</h3>
<ul>
    <li><code>myClass</code></li>
    <li><code>my_interface</code></li>
    <li><code>MyMethod1</code></li>
    <li><code>_constructorExample</code></li>
    <li><code>$packageName</code></li>
</ul>

<h3>🔹 Examples of Invalid Identifiers</h3>
<ul>
    <li><code>my Variable</code> (contains a space)</li>
    <li><code>my-variable</code> (contains a hyphen)</li>
    <li><code>class</code> (Java keyword)</li>
    <li><code>1variable</code> (starts with a number)</li>
</ul>
<hr>
<h2 id="gpocn">📝 Good Practices of Class Naming Convention</h2>
<ol>
    <li><b>Use Upper Camel Case</b>: Each word in the class name starts with an uppercase letter.</li>
    <li><b>Use Singular Nouns</b>: Class names should be singular nouns that represent a single entity.</li>
    <li><b>Avoid Special Characters</b>: Avoid using special characters like <code>_</code> (underscore) and <code>$</code> (dollar sign) in class names.</li>
</ol>

<h2 id="compiler">💻 Compiler</h2>
<p>
    A <b>compiler</b> is a special software tool used for checking and correcting Java programs.
</p>

<h3 >🔹 Java Compiler</h3>
<p>
    <code>javac</code> is the name of the Java compiler.
</p>

<h3 id="javacompilationprocess">🔹 Java Compilation Process</h3>
<p>
    The compilation in Java is a two-step process:
</p>

<img src="https://i.ytimg.com/vi/GOU2xgQD2ow/maxresdefault.jpg" alt="Profile Image" width="400">
<ol>
    <li><b>Step 1</b>: Check the syntax of the Java program.</li>
    <li><b>Step 2</b>: If the program is syntactically correct, the compiler generates <b>Bytecode</b>.</li>
</ol>

<h3>🔹 Compilation Errors</h3>
<p>
    If the Java program has syntax errors, the compiler throws a <b>compilation error</b>, and in this case, bytecode is not generated.
</p>

<h2 id="association">🔗 Association</h2>
<p>
    Association is an object-oriented concept where one or multiple objects get associated with another object.
</p>
<p>
    <b>Examples:</b>
    <ul>
        <li>An <code>Employee</code> object is associated with a <code>Company</code> object.</li>
        <li>An <code>Engine</code> object is associated with a <code>Car</code> object.</li>
    </ul>
</p>
<p>
    Association is also referred to as a <b>relationship</b>. There are two forms of association:
</p>
<ol>
    <li>Composition</li>
    <li>Aggregation</li>
</ol>

<h3 id="composition">🔹 Composition</h3>
<p>
    Composition is a special form of association where the associated object cannot logically exist independently of the owner object. 
    If the owner object is destroyed, the associated object is also destroyed.
</p>
<p>
    Composition represents a <b>strong relationship</b> between the objects.
</p>

<h3 id="aggregation">🔹 Aggregation</h3>
<p>
    Aggregation is a special form of association where the associated object can logically exist independently of the owner object.
    It can continue to exist even without the owner object.
</p>
<p>
    Aggregation represents a <b>weak relationship</b> between the objects.
</p>

![composition_aggregation_diagram](https://github.com/user-attachments/assets/f5fad034-cc71-41da-b14b-75bf387b5294)








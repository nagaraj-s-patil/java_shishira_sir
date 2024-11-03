<h2 title="class notes">Table of Contents</h2>
<ul title="Syllabus">
    <li><a href="#object-state-and-behavior">Object State and Behavior</li>
    <li><a href="#class-and-object">Class and Object</a></li>
    <li><a href="#keywords">Keywords</a></li>
    <li><a href="#identifiers">Identifiers</a></li>
   
</ul>

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
![image](https://github.com/user-attachments/assets/742ad226-b432-4b8f-a9d7-5aca2a787adb)




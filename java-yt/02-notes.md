##### How my computer understands Java?

Java is a programming language which is object oriented by nature.

1. It is owned by oracle
2. It is open source and free.
3. Java is an object oriented language which gives a clear structure to programs and allows code to be reused, lowering developmental costs.

##### History of Java:

1. Java was developed by James Gosling, who is also known as the father of Java, and his team (also known as green team) at Sun microsystems (which is now a subsidiary of Oracle Corporation) and released in 1995. First it was called as Greentalk and intended for interactive decision, but it was too advanced for the digital cable television industry.

2. It was best suited for internet programming. After some time the name greentalk was changed to oak and then in 1995, it was finally renamed to JAVA.

3. JDK or Java development kit consists of tools that are used to develop and run java code. JDK consists of JRE and Java development tools.
   JRE or Java runtime environment is a package that provides an environment to only run the Java Program on your machine. It is only used to run Java programs.
   JDT or Java Developmental tools consist of many tools like compiler, debugger, and other development tools.
   To run code, we need JVM. JVM in each OS is different and to running Java, we require an JVM compatible with the OS. JVM is nothing but a interpreter.

4. Java is platform independent because it uses a virtual machine. Bytecodes are effecitvely platform independent. The virtual machine takes care of the differences between the bytecodes for the different platforms, thus JVM is platform dependent.

5. Java code involves a two step execution, first through an OS independent compiler; and second; in a virtual machine (JVM) which is custom built for every OS. First the source '.java' file is passed through the compiler which then encodes the source code into a machine independent coding known as bytecode. (generates .class files)

6. These stages are:

- ClassLoader: The main class is loaded into the memory bypassing its '.class' file to the JVM. All the other class referenced in the program are loaded through the class loader. A class loader, itself an object, creates a flat namespace of class bodies that are referenced by string name.

- Bytecode Verifier: After the bytecode of a class is loaded by the class loader, it has to be inspected by the bytecode verifier, whose job is to check that the instructions don't perform damaging actions. Like -> Variables are initialized before they are used. Local variable accesses fall within the runtime stack, etc.

- Just in time compiler: This is the final stage encountered by the java program, and its job is to convert the loaded bytecode into machine code. It's main purpose is to do heavy optimizations in performance.

7. Introduced “write once, run anywhere” concept with cross platform compatibility

- Developed with vision of backward compatibility. Should not break with new release.
- Rapid Growth and Diversification(Late 1990s - 2010s) :Expanded from web applets to server side applications; standardized into different editions for various computational platforms.
- source code in HLL → compiler → output code(byte code) → JVM runs the byte code by converting it into machine code. Different machines have different JVMs
- byte code is not in 010101…. it is a verified form of code.
- Java is robust due to its strong memory management, exception handling, and type checking mechanisms that help in preventing system crashes and ensuring reliable performance.
- Multithreaded: Multi-threading in programming is the ability of a CPU to execute multiple threads concurrently, allowing for more efficient processing and task management.
- Java is architecturally neutral because its compiled code (bytecode) can run on any device with a Java virtual machine (JVM). regardless of the underlying hardware architecture.
- Java combines high performance with interpretability, as its bytecode is interpreted by the JVM, which employs JIT (just in time) compilation for efficient and fast execution.
- Java is inherently distributed designed to facilitate network-based application development and interaction, seamlessly integrating with Internet protocols and a remote method invocation.
- program.java → java compiler → Program.class → JVM → Program
- file extensions:

  - .Java
    - contains java source code
    - high level human readable
    - used for development
    - file is editable
  - .Class
    - Contains java bytecode
    - for consumption of JVM
    - Used for execution
    - Not meant to be edited

- .JDK
  - it is a software development kit to develop java applications
  - includes the JRE, an interpreter/loader (Java), a compiler (javac), a doc generator(Javadoc), and other tools needed for Java development
  - essentially JDK is a superset of JRE
- .JRE
  - it is a part of JDK but can be downloaded separately
  - Provides the libraries, the JVM, an other components to run applications
  - Does not have tools and utilities for developers like compilers or debuggers
- .JVM
  - It is a part of JRE and responsible for executing the bytecode
  - Ensures Java’s write once, run anywhere capability
  - Not platform independent: a different JVM is needed for each type of OS

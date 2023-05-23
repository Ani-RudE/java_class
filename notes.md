// Description: This file contains all the notes of the course.
    **JAVA Notes**

    1. Java is a high level, robust, secured and object-oriented programming language.
    2. Java was developed by Sun Microsystems (which is now the subsidiary of Oracle) in the year 1995.
    3. James Gosling is known as the father of Java.
    4. Before Java, its name was Oak.
    5. Java is a platform independent language.
    6. Java is a portable language because it facilitates you to carry the Java bytecode to any platform.
    7. Java is an Object-Oriented Language.
    8. Java is a robust language because it uses strong memory management.
    9. Java is a secured language because it doesn't use explicit pointers.
    10. Java is a dynamic language.
    11. Java is a multithreaded language.
    12. Java is an interpreted language.
    13. Java is a distributed language.
    
    **Features of Java**


    -->Super Keyword--
    The super keyword in Java is a reference variable that is used to refer parent class objects. The keyword "super" came into the picture with the concept of Inheritance. It is majorly used in the following contexts:
    1. Use of super with variables: This scenario occurs when a derived class and base class has same data members. In order to access the data members of base class, super keyword is used.
    2. Use of super with methods: When a derived class overrides a method of base class, we use super keyword to call methods from base class.
    3. Use of super with constructors: When a derived class and base class have same constructors, we use super keyword to call constructors from base class.


    -->this Keyword--
    The this keyword in Java is a reference to the current object. The keyword "this" was introduced with the concept of oops. It is majorly used in the following contexts:
    1. Use of this as a reference to current class instance variables.
    2. Use of this() to call current class constructors.
    3. Use of this keyword as an argument in the method call.
    4. Use of this keyword as an argument in the constructor call.
    5. Use of this keyword to return the current class instance.


    -->Static Keyword--
    The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested class. The static keyword belongs to the class than an instance of the class.
    1. The static can be:
        a. Variable (also known as a class variable)
        b. Method (also known as a class method)
        c. Block
        d. Nested class
    2. The static keyword is used to:
        a. Create a variable that will be common to all objects of the same class.
        b. Create methods that will be called without creating an object of the class.
        c. To refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
        d. For memory management.
    3. The static keyword can be used with the following:
        a. Variables: The static variables are used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
        b. Methods: The static methods can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
        c. Blocks: The static blocks are used to initialize the static variables. The static blocks are executed before the constructors.
        d. Nested class: The static nested class cannot access non-static data members and methods. It can be accessed by outer class name.


    -->Final Keyword--
    The final keyword in java is used to restrict the user. final states that the value can't be changed.
    1. The final keyword can be used with the following:
        a. Variables: The final variable can't be changed once assigned. The final variable can be a primitive data type or a reference.
        b. Methods: The final method can't be overridden by the inheriting class.
        c. Classes: The final class can't be inherited.
    2. The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or uninitialized final variable. It can be initialized in the constructor only. The blank final variable can be static also which will be initialized in the static block only.

    
    -->Abstract Class--
    A class which is declared with the abstract keyword is known as an abstract class in Java. It can have abstract and non-abstract methods (method with the body). Before learning the Java abstract class, let's understand the abstraction in Java first. Abstraction is a process of hiding the implementation details and showing only functionality to the user. There are two ways to achieve abstraction in java - abstract class (0 to 100%) and interface (100%). An abstract class can have an abstract method without a body and it can have methods with the body as well. But, in the case of an interface, all the methods must be abstract. Since Java 8, we can have default and static methods in an interface. An abstract class is mostly used to provide a base for subclasses to extend and implement the abstract methods and override or use the implemented methods in abstract class itself. An abstract class can never be instantiated. 
    Syntax--
    abstract class className{  
        //methods  
    }


    -->Interface--
    An interface in Java is a blueprint of a class. It has static constants and abstract methods only. The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java. In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body. Java Interface also represents the IS-A relationship. It cannot be instantiated just like the abstract class. Since Java 8, we can have default and static methods in an interface. Since Java 9, we can have private methods in an interface. Since Java 8, we can have private and static methods in an interface also. For now, let's understand the basic difference between abstract class and interface. The interface is used to achieve abstraction and multiple inheritance in Java. It cannot have a method body. The interface is declared using the interface keyword. It cannot be instantiated just like the abstract class. Since Java 8, we can have default and static methods in an interface. Since Java 9, we can have private methods in an interface. Since Java 8, we can have private and static methods in an interface also. An abstract class can have an abstract and non-abstract method. It can be instantiated just like the normal class. The abstract class is declared using the abstract keyword. It can have a method body (non-abstract methods). It can have a constructor and static method also. It can have final methods which will force the subclass not to change the body of the method. It can have final variables. It can have instance variables. It can provide the implementation of the interface. The abstract keyword is used to declare the abstract class.
    Syntax--
    interface <interface_name>{  
        //declare constant fields  
        //declare methods that abstract by default.  
    }


    -->Exception Handling--
    An exception is an unwanted or unexpected event, which occurs during the execution of a program i.e at run time, that disrupts the normal flow of the program's instructions. In other words, an exception is a run-time error. Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc. In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime. The exception handling in Java is one of the powerful mechanisms to handle the runtime errors so that the normal flow of the application can be maintained. Exception Handling is mainly used to handle the checked exceptions. If there occurs any unchecked exception such as NullPointerException, it is programmers fault that he is not performing check up before the code being used. There are mainly two types of exceptions: checked and unchecked where error is considered as unchecked exception. The sun microsystem says there are three types of exceptions:
    1. Checked Exception
    2. Unchecked Exception
    3. Error


    --> throw keyword--
    The Java throw keyword is used to explicitly throw an exception. We can throw either checked or uncheked exception in java by throw keyword. The throw keyword is mainly used to throw custom exception. We will see custom exceptions later. Let's see a simple example of throw keyword.
    Example- 
    class Test{  
        static void validate(int age){  
            if(age<18)  
            throw new ArithmeticException("not valid");  
            else  
            System.out.println("welcome to vote");  
        }  
        public static void main(String args[]){  
            validate(13);  
            System.out.println("rest of the code...");  
        }  
    }


    -->throws keyword--
    The Java throws keyword is used to declare an exception. it is used in function declaration. If we are calling a method that declares an exception, we must either caught or declare the exception. The throws keyword is used to declare an exception. It gives an information to the programmer that there may occur an exception so it is better for the programmer to provide the exception handling code so that normal flow can be maintained.


    -->finally block--
    The finally block is a block that is used to execute important code such as closing connection, stream etc. Java finally block is always executed whether exception is handled or not. Java finally block follows try or catch block. The finally block will not be executed if program exits(either by calling System.exit() or by causing a fatal error that causes the process to abort).


    -->catch block--
    The catch block is used to handle the exception. It must be used after the try block only. You can use multiple catch block with a single try. The catch block must be used after the try block only. You can use multiple catch block with a single try.


    -->Enumeration--
    The enumeration in Java is one of the types of data structure which is used to store the constants. In other words, enum is a keyword, a feature which is used to represent fixed number of well-known values in Java, For example, Number of days in Week, Number of planets in Solar system etc. It is a special type of class that contains only static constants. It is mainly used to define the collection of constants, such as the days of the week, the months in a year etc. The enum constants are implicitly static and final .
    Example-
    enum Season { WINTER, SPRING, SUMMER, FALL }
    class EnumExample1{
        public static void main(String[] args) {
            for (Season s : Season.values())
                System.out.println(s);
        }
    }


    -> Threads--

    Threads are light-weight processes within a process. Threads can be used to perform complicated tasks in the background without interrupting the main program.

    Different States of a Thread--
    1. New - When a new thread is created, it is in the new state.
    2. Active - When the thread scheduler selects a thread from the ready queue and assigns it to the processor, the thread is in the active state.
    3. Waiting - When a thread is waiting for another thread to perform a task, it is in the waiting state.
    4. Blocked - When a thread is prevented from entering the active state because of some reason, it is in the blocked state.
    5. Terminated - When a thread has completed its task, it is in the terminated state.    

    InterruptedException--
    When a thread is in the waiting or sleeping state, another thread can interrupt it using the interrupt() method of the Thread class. This causes an InterruptedException to be thrown. The interrupted thread can catch this exception and continue its execution.

    Priority of a Thread--
    Every thread has a priority that helps the operating system determine the order in which threads are scheduled. Java uses the following thread priorities:
    1. MIN_PRIORITY - The minimum priority that a thread can have. Its value is 1.
    2. NORM_PRIORITY - The default priority of a thread. Its value is 5.
    3. MAX_PRIORITY - The maximum priority that a thread can have. Its value is 10.

    *We need to use Thread class in case on interface, but in case of inheritance we can directly extend the Thread class and override the run() method.
    
    Thread Functions--
    1. start() - This method starts the execution of the thread. It calls the run() method of the thread internally.
    2. run() - This method is called when a thread is in the active state. You need to override this method to specify the actions that the thread will perform.
    3. sleep() - This method causes the currently executing thread to sleep for the specified number of milliseconds.
    4. join() - This method waits for a thread to die. It causes the currently executing thread to wait until the thread on which it is called is dead.
    5. yield() - This method causes the currently executing thread to yield to any other threads of the same priority that are waiting to be scheduled.(increases the priority of the thread)
    6. interrupt() - This method interrupts the execution of a thread. It throws an InterruptedException when the thread is in the waiting or sleeping state.
    7. isAlive() - This method tests if a thread is alive.
    8. getName() - This method returns the name of the thread.
    9. setName() - This method changes the name of the thread.
    10. getPriority() - This method returns the priority of the thread.
    11. setPriority() - This method sets the priority of the thread.
    12. getThreadGroup() - This method returns the thread group to which the thread belongs.
    13. setDaemon() - This method marks the thread as a daemon thread.
    14. isDaemon() - This method tests if a thread is a daemon thread.
    15. getId() - This method returns the identifier of the thread.
    16. getStackTrace() - This method returns an array of stack trace elements representing the stack dump of the thread.
    17. getState() - This method returns the state of the thread.
    18. holdsLock() - This method returns true if the current thread holds the lock on the specified object.

    Daemon Thread--
    A daemon thread is a thread that runs in the background. It provides services to user threads. Its life depends on the user threads i.e. when all the user threads die, JVM terminates this thread automatically. You can use setDaemon() method to create a daemon thread.

    Synchronization--
    Synchronization is the capability to control the access of multiple threads to any shared resource. Java Synchronization is better option where we want to allow only one thread to access the shared resource.
    in java, we use synchronized keyword to perform synchronization. we can synchronized method and synchronized block to perform synchronization.


    -> Java.lang Package--

    Object Class--
    The Object class is the parent class of all the classes in java by default. In other words, it is the topmost class of java. The Object class is beneficial if you want to refer any object whose type you don't know. Notice that parent class reference variable can refer the child class object, know as upcasting.
    Functions--
    1. getClass() - This method returns the class of an object.
    2. hashCode() - This method returns the hash code of an object.
    3. equals() - This method compares the given object to the current object.
    4. clone() - This method creates a new object with the same class as the current object.
    5. toString() - This method returns the string representation of an object.
    6. notify() - This method wakes up a single thread that is waiting on this object's monitor.
    7. notifyAll() - This method wakes up all the threads that wait on this object's monitor.
    8. wait() - This method causes the current thread to wait until another thread invokes the notify() or notifyAll() method for this object.
    9. finalize() - This method is invoked by the garbage collector before object is being garbage collected.

    Wrapper Class--
    A wrapper class wraps (encloses) around a data type and gives it an object appearance. Wherever, the data type is required as an object, this object can be used. Wrapper classes include methods to unwrap the object and give back the data type. The object data type is known as Wrapper class data type.
    Functions--
    1. intValue() - This method returns the integer value of the specified object.
    2. byteValue() - This method returns the byte value of the specified object.
    3. shortValue() - This method returns the short value of the specified object.
    4. longValue() - This method returns the long value of the specified object.
    5. floatValue() - This method returns the float value of the specified object.
    6. doubleValue() - This method returns the double value of the specified object.
    7. booleanValue() - This method returns the boolean value of the specified object.
    8. charValue() - This method returns the character value of the specified object.
    9. valueOf() - This method returns the wrapper object holding the value of the specified primitive.(ex- Integer.valueOf(10))

    AutoBoxing--
    The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing. For example – conversion of int to Integer, long to Long, double to Double etc.
    ex- Integer i = 10; //autoboxing

    AutoUnBoxing-- The automatic conversion of wrapper class into its corresponding primitive type is known as unboxing.For example – conversion of Integer to int, Long to long, Double to double etc.ex - Integer i = new Integer(10); // unboxing

    String Class-- The String class represents character strings.All string literals in Java programs, such as "abc", are implemented as instances of this class.Strings are constant;
    their values cannot be changed after they are created.String buffers support mutable strings.Because String objects are immutable they can be shared.For example : String str = "abc";
    Functions-- 1. charAt() - This method returns the character at the specified index .2. compareTo() - This method compares two strings lexicographically .3. concat() - This method concatenates one string to the end of another string .4. contains() - This method searches the sequence of characters in this string .5. endsWith() - This method tests if this string ends with the specified suffix .6. equals() - This method compares this string to the specified object .7. equalsIgnoreCase() - This method compares this String to another String, ignoring case considerations .8. format() - This method returns a formatted string using the specified format string and arguments .9. getBytes() - This method encodes this String into a sequence of bytes using the platform's default charset.

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      StringBuffer Class-- StringBuffer class is used to create mutable(modifiable) string.The StringBuffer class in java is same as String class except it is mutable i.e.it can be changed.example:
    StringBuffer sb = new StringBuffer("Hello ");
    Functions-- 1. append() - This method concatenates the given argument with this string .2. insert() - This method inserts the given string with this string at the given position .3. replace() - This method replaces the given string from the specified beginIndex and endIndex .4. delete() - This method deletes the string from the specified beginIndex to endIndex .5. reverse() - This method reverses the characters in the StringBuffer object.

                                                                                                                                                                                                                                                                                                                                                                                               StringBuilder Class-- StringBuilder class is used to create mutable(modifiable) string.The StringBuilder class in java is same as StringBuffer class except that it is non
        - synchronized i.e.it is not thread safe.Its methods are not synchronized.example : StringBuilder sb = new StringBuilder("Hello ");
    Functions--
    samw as StringBuffer class

    Math Class--
    The java.lang.Math class contains methods for performing basic numeric operations such as the elementary exponential, logarithm, square root, and trigonometric functions.
    Functions--
    1. abs() - This method returns the absolute value of the given argument.
    2. ceil() - This method returns the smallest integer that is greater than or equal to the argument.
    3. floor() - This method returns the largest integer that is less than or equal to the argument.
    4. max() - This method returns the larger of two arguments.
    5. min() - This method returns the smaller of two arguments.
    6. pow() - This method returns the value of the first argument raised to the power of the second argument.
    7. random() - This method returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
    8. round() - This method returns the closest long or int, as given by the methods return type, to the argument.
    9. sqrt() - This method returns the square root of the argument.

    Enum Class--
    An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
    To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:
    example: enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
    we can even have fields, constructors and methods in enum.
    Functions--
    1. values() - This method returns an array containing all the values of the enum.
    2. valueOf() - This method returns the enum constant of the specified string value, if exists.
    3. ordinal() - This method returns the ordinal of an enum constant.(index)

    
    -->Java IO Streams--

    Streams--
    A stream is a sequence of data. In Java a stream is composed of bytes. It's called a stream because it's like a stream of water that continues to flow.
    There are two types of Streams and they are:
    1. Byte Streams - Byte Streams provide a convenient means for handling input and output of bytes. Byte Streams classes are defined by using two abstract classes, namely InputStream and OutputStream.
    2. Character Streams - Character Streams provide a convenient means for handling input & output of characters. Character Streams classes are defined by using two abstract classes, namely Reader and Writer.

    Buffer--
    A buffer is a temporary storage area of fixed size. Often buffers are used to store data before or after it's processed. For example, a file is read from disk into a buffer, then the file is processed, and finally written from the buffer to another location. Buffers are also used within a program when moving data from one area of memory to another.

    InputStream Class--
    The InputStream class is the superclass of all classes representing an input stream of bytes. Applications that need to define a subclass of InputStream must always provide a method that returns the next byte of input.
    Functions--
    1. read() - This method reads the next byte of data from the input stream.
    2. available() - This method returns the number of bytes that can be read from the input stream without blocking by the next caller of a method for this input stream.
    3. close() - This method closes the input stream and releases any system resources associated with the stream.
    4. mark() - This method marks the current position in this input stream.
    5. reset() - This method resets the input stream to the last marked position.
    6. skip() - This method skips over and discards n bytes of data from the input stream.
    7. markable() - This method tests if this input stream supports the mark and reset methods.
    8. read(byte[] b) - This method reads some number of bytes from the input stream and stores them into the buffer array b.
    9. read(byte[] b, int off, int len) - This method reads up to len bytes of data from the input stream into an array of bytes.

    OutputStream Class--
    The OutputStream class is the superclass of all classes representing an output stream of bytes. An output stream accepts output bytes and sends them to some sink.
    Functions--
    1. write() - This method writes the specified byte to the output stream.
    2. flush() - This method flushes the output stream and forces any buffered output bytes to be written out.
    3. close() - This method closes the output stream and releases any system resources associated with this stream.
    4. write(byte[] b) - This method writes b.length bytes from the specified byte array to the output stream.

    java.io package--
    The java.io package contains all the classes required for input and output operations. We can perform file handling in Java by Java I/O API. For example, we can read and write raw bytes from and to the file, but reading and writing raw bytes is not very convenient and doesn't support high-level data types. So, we use Java FileInputStream and FileOutputStream classes, along with DataInputStream and DataOutputStream classes, to perform file handling in Java.

    FileOutPutStream Class--
    The FileOutputStream class is used to write data to a file. You can create the FileOutputStream object by passing the path of a file or File object.
    Functions--
    1. write(int b) - This method writes the specified byte to the file output stream.
    2. write(byte[] b) - This method writes b.length bytes from the specified byte array to the file output stream.
    3. close() - This method closes the file output stream.
    4. flush() - This method flushes the file output stream.

    FileInputStream Class--
    The FileInputStream class is used to read data from the file. You can create the FileInputStream object by passing the path of a file or File object.
    Functions--
    1. read() - This method reads a byte of data from this input stream.
    2. read(byte[] b) - This method reads up to b.length bytes of data from this input stream into an array of bytes.
    3. close() - This method closes the file input stream.
    4. available() - This method returns an estimate of the number of remaining bytes that can be read (or skipped over) from this input stream without blocking by the next invocation of a method for this input stream.

    FileReader Class--
    The FileReader class is used to read data from the file. It returns data in byte format like FileInputStream class.
    Functions--
    1. read() - This method reads a single character.
    2. read(char[] cbuf) - This method reads characters into an array.
    3. close() - This method closes the file reader.

    FileWriter Class--
    The FileWriter class is used to write character-oriented data to a file. It is character-oriented class which is used for file handling in java.
    Functions--
    1. write(String text) - This method writes a string to the file.
    2. write(char[] cbuf) - This method writes a character array to the file.
    3. flush() - This method flushes the data of the file.
    4. close() - This method closes the file writer.

    BufferedReader Class--
    The BufferedReader class is used to read the text from a character-based input stream. It can be used to read data line by line by readLine() method. It makes the performance fast. It inherits Reader class.
    Functions--
    1. read() - This method reads a single character.
    2. read(char[] cbuf, int off, int len) - This method reads characters into a portion of an array.
    3. readLine() - This method reads a line of text.
    4. close() - This method closes the stream and releases any system resources associated with it.

    BufferedInputStream Class--
    The BufferedInputStream class is used to read information from stream. It internally uses buffer mechanism to make the performance fast.
    Functions--
    1. read() - This method reads the next byte of data from the input stream.
    2. available() - This method returns the number of bytes that can be read from the input stream without blocking by the next caller of a method for this input stream.
    3. close() - This method closes the input stream and releases any system resources associated with the stream.
    4. mark() - This method marks the current position in this input stream.
    5. reset() - This method resets the input stream to the last marked position.
    6. skip() - This method skips over and discards n bytes of data from the input stream.
    7. markable() - This method tests if this input stream supports the mark and reset methods.
    8. read(byte[] b) - This method reads some number of bytes from the input stream and stores them into the buffer array b.

    PipedStream--
    Piped streams provide the ability for two threads running in the same JVM to communicate. One thread sends data to the stream and the other thread receives data from the stream.

    PipedInputStream Class--
    The PipedInputStream class is used to read the data from the pipe. It should be connected to the piped output stream; otherwise, an exception will occur.
    Functions--
    1. read() - This method reads the next byte of data from the input stream.
    2. available() - This method returns the number of bytes that can be read from the input stream without blocking by the next caller of a method for this input stream.
    3. close() - This method closes the input stream and releases any system resources associated with the stream.

    PipedOutputStream Class--
    The PipedOutputStream class is used to write the data to the pipe. The constructor of this class takes the piped input stream object as an argument.
    Functions--
    1. write(int b) - This method writes the specified byte to the piped output stream.
    2. flush() - This method flushes the piped output stream.
    3. close() - This method closes the piped output stream.

    RandomAccessFile Class--
    The RandomAccessFile class of the java.io package allows us to read from, and write to files in Java. The RandomAccessFile class treats a file as a large array of bytes stored in the file system. This class allows us to read from, write to and modify the file contents by accessing random locations in the file.
    Functions--
    1. read() - This method reads a byte of data from this file.
    2. read(byte[] b) - This method reads up to b.length bytes of data from this file into an array of bytes.
    3. readLine() - This method reads the next line of text from this file.
    4. write(int b) - This method writes the specified byte to this file.
    5. write(byte[] b) - This method writes b.length bytes from the specified byte array to this file.
    6. writeBytes(String s) - This method writes a string to this file, one byte at a time.
    7. seek(long pos) - This method sets the file-pointer offset, measured from the beginning of this file, at which the next read or write occurs.
    8. getFilePointer() - This method returns the offset from the beginning of the file, in bytes, at which the next read or write occurs.
    9. length() - This method returns the length of this file.
    10. close() - This method closes this random access file stream and releases any system resources associated with the stream.
    11.skipBytes(int n) - This method attempts to skip over n bytes of input discarding the skipped bytes.

    File Class--
    The File class is an abstract representation of file and directory pathname. It is platform dependent. It is used to get the pathname of the file or directory.
    Functions--
    1. createNewFile() - This method creates a new, empty file.
    2. delete() - This method deletes the file or directory.
    3. exists() - This method tests whether the file or directory exists.
    4. getName() - This method returns the name of the file or directory.
    5. getAbsolutePath() - This method returns the absolute pathname of the file or directory.
    6. isDirectory() - This method tests whether the file is a directory or not.
    7. isFile() - This method tests whether the file is a file or not.
    8. length() - This method returns the size of the file.
    9. list() - This method returns an array of the files in the directory.
    10. mkdir() - This method creates a directory.
    11. renameTo() - This method renames the file or directory.
    12. setLastModified() - This method changes the timestamp of the file or directory.
    13. setReadOnly() - This method marks the file or directory as read-only.
    14. toString() - This method returns the pathname of the file or directory.
    15. canRead() - This method tests whether the file or directory can be read or not.
    16. canWrite() - This method tests whether the file or directory can be written or not.
    17. getFreeSpace() - This method returns the number of unallocated bytes in the partition.
    18. getTotalSpace() - This method returns the size of the partition.
    19. getUsableSpace() - This method returns the number of bytes available to this virtual machine on the partition.
    20. getParent() - This method returns the pathname of the parent directory of the file or directory.

    Serialization--
    Serialization is a mechanism of converting the state of an object into a byte stream. Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.
    The ObjectOutputStream class contains writeObject() method for serializing an Object.
    The ObjectInputStream class contains readObject() method for deserializing an object.
    If a class implements Serializable interface, then all its sub classes will also be serializable. So we don't need to implement it separately.
    The serialization mechanism generates an object graph for serialization. Thus it determines whether the included object references are serializable or not. So it throws NotSerializableException when the object is not serializable.
    To make an object serializable we implement the java.io.Serializable interface.
    The ObjectOutputStream class is used to serialize an Object.
    The ObjectInputStream class is used to deserialize an object.
    The ObjectOutputStream class contains writeObject() method for serializing an Object.
    The ObjectInputStream class contains readObject() method for deserializing an object.

    Transient Keyword--
    If you don't want to serialize any data member of a class, you can mark it as transient.
    When JVM serializes the object, it ignores the original value of the transient variable and saves the default value of that variable data type.
    The transient keyword can be applied with variables only and it is not applicable for methods and classes.
    Example--
    import java.io.*;
    class Student implements Serializable
    {
        int id;
        String name;
        transient int age; // Now it will not be serialized
    public
        Student(int id, String name, int age)
        {
            this.id = id;
            this.name = name;
            this.age = age;
        }
    } public class TransientExample
    {
    public
        static void main(String args[]) throws Exception
        {
            Student s1 = new Student(211, "ravi", 22); // creating object
            // writing object into file
            FileOutputStream f = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(f);
            out.writeObject(s1);
            out.flush();
            // closing the stream
            out.close();
            f.close();
            System.out.println("success");
        }
    }


    JAVA GENERICS--

    Generics in Java is similar to templates in C++. The idea is to allow type (Integer, String, … etc, and user-defined types) to be a parameter to methods, classes, and interfaces. For example, classes like HashSet, ArrayList, HashMap, etc use generics very well. We can use them for any type.
    Syntax--
    "class name<T1, T2, ..., Tn> { /* ... */ }"
    T1, T2, …, Tn are type parameters.


    Collections in Java--

    The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
    Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.
    Interface Collection-
    The Collection interface (java.util.Collection) is one of the root interfaces of the Java Collection API. Java Collection framework provides many interfaces (Set, List, Queue, Deque etc.) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet etc).
    Functions--
    1. add() - This method is used to add an element to the collection.
    2. addAll() - This method is used to add all elements of a collection to another collection.
    3. clear() - This method is used to remove all elements from the collection.
    4. contains() - This method is used to return true if the collection contains the specified element.
    5. containsAll() - This method is used to return true if the collection contains all elements of the specified collection.
    6. isEmpty() - This method is used to check whether the collection is empty or not. It returns true if the collection is empty otherwise false.
    7. iterator() - This method returns an iterator over the collection.
    8. remove() - This method is used to remove a single instance of the specified element from the collection.
    9. removeAll() - This method is used to remove all the elements from the collection that are present in the specified collection.
    10. retainAll() - This method is used to remove all the elements from the collection that are not present in the specified collection.
    11. size() - This method is used to return the number of elements in the collection.
    12. toArray() - This method is used to return an array containing all the elements of the collection.
    
    List--
    The List interface extends Collection and declares the behavior of a collection that stores a sequence of elements. Elements can be inserted or accessed by their position in the list, using a zero-based index.
    Functions--
    1. add(int index, Object element) - It is used to insert the specified element at the specified position index in a list.
    2. addAll(int index, Collection c) - It is used to insert all elements of a specified collection c at the specified position index of a list.
    3. get(int index) - It is used to get the element present at the specified position in a list.
    4. indexOf(Object o) - It is used to return the index in a list of the first occurrence of the specified element, or -1 if the list does not contain any element.
    5. lastIndexOf(Object o) - It is used to return the index in a list of the last occurrence of the specified element, or -1 if the list does not contain any element.
    6. listIterator() - It is used to return a list iterator over the elements in a list (in proper sequence).
    7. remove(int index) - It is used to remove the element present at the specified position in a list.
    8. set(int index, Object element) - It is used to replace the element present at the specified position in a list with the specified element.
    9. subList(int fromIndex, int toIndex) - It is used to return a view of the portion of a list between the specified fromIndex, inclusive, and toIndex, exclusive.

    Queue--
    The Queue interface present in the java.util package and extends the Collection interface is used to hold the elements about to be processed in FIFO(First In First Out) order. It is an ordered list of objects with its use limited to insert elements at the end of the list and deleting elements from the start of the list, i.e. it follows the FIFO or the First-In-First-Out principle. Being an interface the queue needs a concrete class for the declaration and the most common classes are the PriorityQueue and LinkedList in Java.
    Functions--
    1. add() - This method is used to add elements at the tail of queue. More specifically, at the last of linked-list if it is used, or according to the priority in case of priority queue implementation.
    2. peek() - This method is used to view the head of queue without removing it. It returns Null if the queue is empty.
    3. element() - This method is similar to peek(). It throws NoSuchElementException when the queue is empty.
    4. remove() - This method removes and returns the head of the queue. It throws NoSuchElementException when the queue is empty.
    5. poll() - This method removes and returns the head of the queue. It returns null if the queue is empty.

    ArrayList--
    ArrayList is a part of collection framework and is present in java.util package. It provides us dynamic arrays in Java. Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed.
    Functions--
    1. add() - This function is used to add an element at the end of the ArrayList.
    2. add(index, element) - This function is used to add an element at a specific index in an ArrayList.
    3. clear() - This function is used to remove all the elements from any list.
    4. clone() - This function is used to create a shallow copy of the mentioned array list. It means the new list will simply copy the elements as well as the structure of the list on which clone() is called.
    5. contains() - This function is used to check whether the specified element is present in a list or not. If the element is present then it returns true else it gives false.
    6. ensureCapacity() - This function increases the capacity of an ArrayList instance.

    Iterator--
    Iterator interface provides the facility of iterating the elements in a forward direction only.
    Functions--
    1. hasNext() - This method returns true if the iteration has more elements.
    2. next() - This method returns the next element in the iteration.
    3. remove() - This method removes the last element returned by the iterator. It is less used.

    ListIterator--
    ListIterator interface provides the facility of iterating the elements in a bidirectional manner.
    Functions--
    1. hasNext() - This method returns true if the iteration has more elements.
    2. next() - This method returns the next element in the iteration.
    3. hasPrevious() - This method returns true if the iteration has more elements in the reverse direction.
    4. previous() - This method returns the previous element in the iteration.
    5. nextIndex() - This method returns the index of the element that would be returned by a subsequent call to next().
    6. previousIndex() - This method returns the index of the element that would be returned by a subsequent call to previous().
    7. remove() - This method removes from the list the last element that was returned by next() or previous().
    8. set(E e) - This method replaces the last element returned by next() or previous() with the specified element.
    9. add(E e) - This method inserts the specified element into the list.

    LinkedList--
    LinkedList is a linear data structure where each element is a separate object. Each element of the list is comprising of two items, the data and a reference to the next node. The last node has a reference to null. The entry point into a linked list is called the head of the list. It should be noted that head is not a separate node, but the reference to the first node. If the list is empty then the head is a null reference.it is essentially a double linked list.
    Functions--
    1. add() - This function is used to insert an element at the tail of the linked list.
    2. add(int index, E element) - This function is used to insert the specified element at the specified position index in a list.
    3. addFirst(E e) - This function is used to insert the given element at the beginning of the linked list.   
    4. addLast(E e) - This function is used to insert the given element at the end of the linked list.
    5. clear() - This function is used to remove all the elements from the linked list.
    6. poll() - This function is used to retrieve and remove the head (first element) of the linked list.
    7. remove() - This function is used to retrieve and remove the head (first element) of the linked list.

    ArrayDeque--
    ArrayDeque class implements the Deque interface. It facilitates us to use the Deque. Unlike queue, we can add or delete the elements from both the ends.
    Functions--
    1. add() - This function is used to insert the specified element at the end of the deque.
    2. addFirst() - This function is used to insert the specified element at the start of the deque.
    3. addLast() - This function is used to insert the specified element at the end of the deque.
    4. offer() - This function is used to insert the specified element at the end of the deque.
    5. offerFirst() - This function is used to insert the specified element at the start of the deque.
    6. offerLast() - This function is used to insert the specified element at the end of the deque.
    7. iterator() - This function returns an iterator over the elements in this deque.
    8. descendingIterator() - This function returns an iterator over the elements in this deque in reverse sequential order.
    9. push() - This function is used to insert the specified element at the start of the deque.
    10. pop() - This function is used to retrieve and remove the first element of the deque.
    11. removeFirst() - This function is used to retrieve and remove the first element of the deque.
    12. removeLast() - This function is used to retrieve and remove the last element of the deque.
    
    PriorityQueue--    
    PriorityQueue is an unbounded queue based on a priority heap and the elements of the priority queue are ordered by default in natural order.
    Functions--
    1. add() - This function is used to insert an element in the priority queue.
    2. offer() - This function is used to insert an element in the priority queue.
    3. peek() - This function is used to view the head of queue without removing it. It returns Null if the queue is empty.
    4. poll() - This function removes and returns the head of the queue. It returns null if the queue is empty.

    Hashing--
    Hashing is a technique that is used to uniquely identify a specific object from a group of similar objects. Some examples of how hashing is used in our lives include:
    1. In universities, each student is assigned a unique roll number that can be used to retrieve information about them.

    Set--
    Set is an interface which extends Collection. It is an unordered collection of objects in which duplicate values cannot be stored. Basically, Set is implemented by HashSet, LinkedHashSet or TreeSet (sorted representation). Set has various methods to add, remove clear, size, etc to enhance the usage of this interface.
    Functions--
    1. add() - This function is used to add an element in the set.
    2. addAll() - This function is used to add all the elements of a list to the set.
    3. clear() - This function is used to remove all the elements from the set.
    4. contains() - This function is used to check whether an element is present in the set or not. It returns True if the element is present and False if the element is not present.
    5. containsAll() - This function is used to check whether all the elements of a Collection is present in the set or not. It returns True if the set contains all the elements and False if the set does not contain all the elements.

    HashSet--
    HashSet class implements Set Interface. It represents the collection that uses a hash table for storage. Hashing is used to store the elements in the HashSet. It contains unique items.
    Functions--
    1. add() - This function is used to add an element in the set.
    2. addAll() - This function is used to add all the elements of a list to the set.
    3. clear() - This function is used to remove all the elements from the set.
    4. contains() - This function is used to check whether an element is present in the set or not. It returns True if the element is present and False if the element is not present.

    TreeSet--
    TreeSet implements the SortedSet interface so duplicate values are not allowed in TreeSet. TreeSet does not preserve the insertion order of elements but elements are sorted by keys. TreeSet does not allow to insert Heterogeneous objects. It will throw classCastException at Runtime if trying to add hetrogeneous objects.
    
    Comparable--
    Comparable interface is used to order the objects of user-defined class. This interface is found in java.lang package and contains only one method named compareTo(Object). It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only. For example, it may be rollno, name, age or anything else.
    Comparable provides compareTo() method to sort elements. Internally, it uses compareTo() method of String class to sort elements.

    TreeMap--
    TreeMap implements the SortedMap interface so duplicate values are not allowed in TreeMap. TreeMap does not preserve the insertion order of elements but elements are sorted by keys. TreeMap does not allow to insert Heterogeneous objects. It will throw classCastException at Runtime if trying to add hetrogeneous objects.
    Functions--
    1. put() - This method is used to insert a particular mapping of key-value pair into the map.
    2. putAll() - This method is used to insert the specified map in the map.

    HashMap--
    HashMap implements the Map interface and extends AbstractMap class. It contains only unique elements. It may have one null key and multiple null values. It maintains no order.
    Functions--
    1. put() - This method is used to insert a particular mapping of key-value pair into the map.
    2. putAll() - This method is used to insert the specified map in the map.
    3. putIfAbsent() - This method inserts a mapping if the specified key is not already associated with a value or is mapped to null and returns null otherwise.
    4. get() - This method returns the value for the specified key.
    5. getOrDefault() - This method returns the value for the specified key if key is exists in the map otherwise it returns the specified default value.
    6. remove() - This method removes the entry for the specified key only if it is currently mapped to the specified value.
    7. replace() - This method replaces the entry for the specified key only if it is currently mapped to some value.

    StringTokenizer--
    StringTokenizer class in Java is used to break a string into tokens. StringTokenizer is a legacy class that is retained for compatibility reasons although its use is discouraged in new code. It is recommended that anyone seeking this functionality use the split method of String or the java.util.regex package instead.
    Functions--
    1. countTokens() - This method returns the total number of tokens.
    2. hasMoreTokens() - This method checks if there are more tokens available.
    3. nextToken() - This method returns the next token from the StringTokenizer object.


    JDBC--

    JDBC stands for Java Database Connectivity. It provides a set of Java API for accessing the relational databases from Java program. JDBC API uses JDBC drivers to connect with the database. There are four types of JDBC drivers:
    1. JDBC-ODBC bridge driver
    2. Native-API driver (partially java driver)
    3. Network Protocol driver (fully java driver)
    4. Thin driver (fully java driver)

    Database--
    A database is a collection of interrelated data's stored in a database server; these data's will be stored in the form of tables. The primary aim of the database is to provide a way to store and retrieve database information in fast and efficient manner.

    Primary Key--
    A primary key is a field in a table which uniquely identifies each row/record in a database table. Primary keys must contain unique values. A primary key column cannot have NULL values. A table can have only one primary key, which may consist of single or multiple fields.

    Foreign Key--
    A foreign key is a column or group of columns in a relational database table that provides a link between data in two tables. It acts as a cross-reference between tables because it references the primary key of another table, thereby establishing a link between them.
    
    SQLite--
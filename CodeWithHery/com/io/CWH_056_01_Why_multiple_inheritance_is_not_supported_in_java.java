package CodeWithHery.com.io;
public class CWH_056_01_Why_multiple_inheritance_is_not_supported_in_java {
}
/*
Is multiple inheritance allowed in Java?
            Multiple inheritance faces problems when there exists a method with the same signature in both the superclasses.
            Due to such a problem, java does not support multiple inheritance directly, but the similar concept can be achieved using interfaces.
            A class can implement multiple interfaces and extend a class at the same time.

Some Important points :
            Interfaces in java are a bit like the class but with a significantly different.
            An Interface can only have method signatures field and a default method.
            The class implementing an interface needs to declare the methods ( not field )
            You can create a reference of an interface but not the object
            Interface methods are public by default
 */
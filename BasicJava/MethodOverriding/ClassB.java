package BasicJava.MethodOverriding;

public class ClassB extends ClassA{
    public int Add(int a, int b){
        System.out.println("this is: "+ (a*b));
        return a*b;
    }
}

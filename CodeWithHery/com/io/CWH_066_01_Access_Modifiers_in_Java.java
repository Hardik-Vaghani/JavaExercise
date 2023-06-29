package CodeWithHery.com.io;
class C1{
    public int x = 5;
    protected int y =45;
    int z = 6;
    private int a = 78;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class CWH_066_01_Access_Modifiers_in_Java {
    public static void main(String[] args) {
        C1 c = new C1();
        // c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a);
    }
}
/*
=> Access Modifiers in Java

*) Access modifiers determine whether other classes can use a particular field or invoke a particular method can be public, private, protected, or default ( no modifier ). See the table given below :

Access Modifier 	within class	    within package	    outside package by subclass only	    outside package

public	                Y	                Y	                        Y	                            Y
protected	            Y	                Y	                        Y                           	N
Default             	Y	                Y	                        N                           	N
private	                Y	                N	                        N                           	N
 */

package BasicJava.Constructors;

public class ClassA {

    public int multiply(int a, int b){
        return a*b;
    }

    public ClassA(){                //[by default call thay jay che jyar objcte create thay che tyare.]
        //default constructor
    }

    protected ClassA(int rollno){
        //Parameterized constructor
        System.out.println("rollno");
    }
    ClassA(String name){
        //Parameterized constructor
    }

    public ClassA(String name, int rollno){
        //MultipleParameterized constructor
    }
}
//['Method Overloading'(Polymorphisim) na javu j che, pn tene  "Constructor Overloading" kahevay che. ]
//[Constructor nu name hamashya tena class na name thi ja hoy che.]
//[te public,protected, default chalechej.]
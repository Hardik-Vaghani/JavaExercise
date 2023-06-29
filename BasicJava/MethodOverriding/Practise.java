package BasicJava.MethodOverriding;

public class Practise extends ClassB{
//    public static void main(String[] args) {
//
//        ClassA a= new ClassA();  //je class ni pase value leviche  che te ni pasethi levu "= new ClassA()" / variable super class no banavavo.
//        a.Add(8,9);
//
//        ClassA b = new ClassB();
//        b.Add(8,9);
//    }
//}

    public static void main(String[] args) {

        Practise pt =new Practise();  //jyare object super class tema j hoy che mate te supar class ni metodh call kareche.
        pt.Add(8,9);

    }
    @Override                         // pn jyare object banviye chiye tyare jo child class pashe potani method hoy che to te super call ne method ne overrid karideche. potani method run kareche.
    public int Add(int a, int b){
        System.out.println("2nd method sum is: "+(a+b));  //[thodu jovu '(a+b)' --> 'a+b' karine output.
        return a+b;
    }
}
//javac Pratice.java
//javac -d . Pratice.java
//javac -d . *.java
//java Practise.java/Practise
package CodeWithHery;
interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{   //<== class ma  interface ne inheritance karava implement karvu
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class CWH_058_01_Inheritance_in_Interfaces {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}

/*
Note: Remember that interface cannot implement another interface only classes can do that!

public interface Interface 1 {
        void meth1 ();
        }


public interface Interface 2 extends Interface 1 {     //<== Inteface ne inheritance  karava extends use karo
        void meth 2( );
        }


 */
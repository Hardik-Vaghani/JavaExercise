package ApnaCollage.com.io.advance;

class Student1 {
    static String school;            //static use key word
    String name;   
}
  
public class StaticKeyWord {
    public static void main(String[] args) {
        Student1.school = "JMV";      //static calling directly
        Student1 s1 = new Student1();  //objecte calling
        Student1 s2 = new Student1();  //objecte calling
  
        s1.name = "Meena";
        s2.name = "Beena";
  
        System.out.println(Student1.school);
        System.out.println(Student1.school);
    }
}

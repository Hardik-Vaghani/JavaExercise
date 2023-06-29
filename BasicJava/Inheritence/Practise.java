package BasicJava.Inheritence;

public class Practise extends ClassMin{
    public static void main(String[] args) {
        ClassMin pt= new Practise();
        System.out.println(pt.add(5,9));
    }
    public int add(int a, int b){
        System.out.println("The sum: "+(a*b));
        return a*b;
    }
}

package BasicJava.ObjectsAndCalling;

public class Practise extends ClassA{
    public static void main(String[] args) {
        Practise pt = new Practise();
        pt.cont();

    }
    public void cont(){
        int sum = super.add(5,6);       //['super' keyword parent class pase jay che jo teni pase nathi to suqance ma parent na parent pase jay ce ne tya thi value lave che.]
        System.out.println("sum is: "+ sum);

        ClassB b;                            //[object banvyo che, ne calling karelu che.]
        b = new ClassB();
        int prodeuct = b.mul(5,6);
        System.out.println("prodeuct is: "+ prodeuct);
    }

}

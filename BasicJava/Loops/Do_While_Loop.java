package BasicJava.Loops;

public class Do_While_Loop {
    public static void main(String[] args) {

        int a = 0;
        String name = "Android Dev";

        do{
            System.out.println(name);
            a++;
        }while (a<5); //(a>5)

        System.out.println(name+" Out of loop!");

    }
}

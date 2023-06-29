package BasicJava.Conditional_Statements;

public class Switch_Class {
    public static void main(String[] args) {
        int day = 3;

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("No entry");
                break;
        }
    }
}

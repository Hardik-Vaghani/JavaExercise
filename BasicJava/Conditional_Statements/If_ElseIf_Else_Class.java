package BasicJava.Conditional_Statements;

public class If_ElseIf_Else_Class {
    public static void main(String[] args) {
        int mathMarks = 80;

        if(mathMarks>95){
            System.out.println("Motorbike will be gifted as present.");
        } else if (mathMarks>80){
            System.out.println("SmartPhone will be gifted as present.");
        } else if (mathMarks>75){
            System.out.println("Bicycle will be gifted as present.");
        } else {
            System.out.println("Try harder next time!");
        }
    }
}

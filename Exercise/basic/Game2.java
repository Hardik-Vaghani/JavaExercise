package Exercise.basic;

import java.util.Scanner;
import java.util.Random;
public class Game2 {
    public static void main(String[] args) {

       int user;
       String cp="" ;
       int computer;
       String response;
       String us="";

       Scanner sc=new Scanner(System.in);
       Random generator=new Random();

        System.out.println("Lets play Rock Paper Scissor!\n" +
                "Type your move\n" +
                "1=paper,2=rock,3=scissor\n");



        boolean b= false;

        while (!b){
            computer=generator.nextInt(3)+1;

            if (computer==1){
                cp="paper";
            }else if (computer==2){
                cp="rock";
            }else if (computer==3){
                cp="scissor";
            }
            System.out.println("Enter your play:");

            user = sc.nextInt();
            if (user==1){
                us="paper";
            }else if (user==2){
                us="rock";
            }else if (user==3){
                us="scissor";
            }

            if(cp.equals(us)){
                System.out.println("Its a tie");
            }else if((cp.equals("rock") && us.equals("paper"))){ 
                System.out.println("paper is win");
                b=true;
            }else if((cp.equals("paper") && us.equals("scissor"))){
                System.out.println("scissor is win");
                b=true;
            }else if((cp.equals("scissor") && us.equals("rock"))){
                System.out.println("rock is win");
                b=true;
            }else{
                System.out.println("you are \"Loss\" try again");
                b=false;
            }
        }
    }
}
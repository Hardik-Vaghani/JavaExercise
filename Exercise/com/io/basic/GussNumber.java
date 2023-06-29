package Exercise.com.io.basic;

import java.util.Random;
import java.util.Scanner;

class Game{
    int number;
    int timeOfNumber=0;
    int userInput;

    // public int gettimeOfNumber() {
    //     return timeOfNumber;

    // }public void settimeOfNumber(int timeOfNumber) {
    //     this.timeOfNumber = timeOfNumber;

    // }
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);   
    }
    void userInput(){
        Scanner sc = new Scanner(System.in);
        this.userInput = sc.nextInt();
    }
    boolean compare(){
        timeOfNumber++;
        if(number==userInput){
            System.out.format("is correct number , you are \"win\"\n");
            System.out.printf(" your  attempted  %d time",timeOfNumber );
            return true;
        }else if(number<userInput){
            System.out.println("is to biger , try Again");

        }else if(number>userInput){
            System.out.println("is to smallest , try Again");
        }
        return false;
        
    }

}
public class GussNumber {
    public static void main(String[] args) {
        Game g = new Game();
        // boolean b=false;
        // while(!b){
        //     g.userInput();
        //     g.compare();    
        // }
        for(boolean b=false;!b;g.userInput(),g.compare()){}

        
        
    }
    
}

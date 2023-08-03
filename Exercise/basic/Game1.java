package Exercise.basic;

import java.util.Random;
import java.util.Scanner;

class PlayGame{
    int pcnum;
    int usernum=0;
    int timeOfnum=0;
    PlayGame(){
        Random rd = new Random();
        this.pcnum = rd.nextInt(100);
    }
    void inputnumbre(){
        Scanner s= new Scanner(System.in);
        this.usernum = s.nextInt();
    }
    boolean commpare(){
        timeOfnum++;
        if(usernum==pcnum){
            System.out.printf("your Right guess a number %d you \"Win\" attempted %d",usernum,timeOfnum);
            return true;
        }else if(usernum > pcnum){
            System.out.println("your number is gratter");
        }else if(usernum < pcnum){
            System.out.println(" your number is lesser");
        }
        return false;
    }
}
public class Game1{
    public static void main(String[] args) {
        PlayGame pg = new PlayGame();
        boolean b= false;
        while(!b){
            pg.inputnumbre();
            pg.commpare();
        }
    }
}
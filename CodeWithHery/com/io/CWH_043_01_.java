package CodeWithHery.com.io;
import java.util.*;
class game
{
    public int rand, guess, no_of_guesses=0;
    public game ()
    {
        Random rd = new Random ();
        rand = rd.nextInt (10);
    }

    public void userInput (int num)
    {

        guess = num;
    }
    public boolean isCorrect ()
    {
        if (rand > guess)
        {
            System.out.println ("have chosen a lesser number");
            no_of_guesses=no_of_guesses+1;
            return false;
        }
        else if (rand < guess)
        {
            System.out.println ("have chosen a bigger number");
            no_of_guesses=no_of_guesses+1;
            return false;
        }
        else
        {
            System.out.println ("correct guess");
            no_of_guesses=no_of_guesses+1;

            System.out.println("no. of guess required = "+no_of_guesses);
            return true;
        }


    }

}

public class CWH_043_01_ {

    public static void main (String[]args)
    {
        System.out.println ("Hello World");
        Scanner sc=new Scanner(System.in);
        game gm = new game ();
        System.out.println("guess a number:");
        gm.userInput(sc.nextInt());
        while(!gm.isCorrect ()){
            System.out.println("guess a number:");
            gm.userInput(sc.nextInt());
        }



    }
}
package CodeWithHery;
public class CWH_015_01_Practice_Set {
    public static void main(String[] args) {
        // Problem 1
        //String name = "Jack Parker";
        //name = name.toLowerCase();
        //System.out.println(name);

        // Problem 2
        //String text = "To My     Friend";
        //text = text.replace(" ", "_");
        //System.out.println(text);

        // Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Sachin");
        System.out.println(letter);

        // Problem 4
        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);

    }
}

// letter = “Dear <|name|>, Thanks a lot”

// Replace <|name|> with a string (some name)
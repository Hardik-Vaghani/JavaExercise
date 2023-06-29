package ApnaCollage.com.io.advance.Constructor;

class bottel1 {
    String type;
    int rupees;

    public void prin() {
        System.out.println(this.type);
        System.out.println(this.rupees);
    }
    bottel1() {                                                        /*/non parameterize constructor/*/
        System.out.println("difference");
    }
}
public class ConstructorS1 {
    public static void main(String[] args) {
        bottel1 b1 = new bottel1();
        b1.type = "iron";
        b1.rupees = 599;
        b1.prin();
    } 
}
package ApnaCollage.com.io.advance.Constructor;

class bottel3 {
    String type;
    int rupees;

    public void prin() {
        System.out.println(this.type);
        System.out.println(this.rupees);
    }
    bottel3() {                                                       /*/non parameter constructor/*/

    }
    bottel3(bottel3 b2) {                                               /*/copy constructor/*/
        this.type = b2.type;
        this.rupees = b2.rupees;
    }
}
public class ConstructorS3 {
    public static void main(String[] args) {
        bottel3 b1 = new bottel3();
        // b1.pennumber = 002;
        b1.type = "iron";
        b1.rupees = 599;

        b1.prin();

        bottel3 b2 = new bottel3(b1);
        b2.prin();
    }
}

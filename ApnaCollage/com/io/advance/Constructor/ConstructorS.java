package ApnaCollage.com.io.advance.Constructor;

class bottel {
    String type;
    int no;

    public void prin() {
        System.out.println(this.type);
        System.out.println(this.no);
    }
    bottel(int pennumber,String name,String type,int no,int rupees) { /*/parameterize constructor/*/
       // System.out.println("constructor is method");
       this.type = type;
       this.no = no;
    }
    bottel() {                                                        /*/non parameterize constructor/*/
        System.out.println("difference");
    }
    bottel(bottel b3) {                                               /*/copy constructor/*/
        this.type = b3.type;
        this.no = b3.no;
    }
}
public class ConstructorS {
    public static void main(String[] args) {
        bottel b1 = new bottel(001,"milton","steel",4,549);
        // b1.type = "steel";
        // b1.no = 4;

        b1.prin();

        bottel b2 = new bottel();//002,"freeze","iron",9,599);
        b2.type = "iron";
        b2.no = 9;

    //    b2.prin();

        bottel b3 = new bottel(b2);
       b3.prin();
    } 
}
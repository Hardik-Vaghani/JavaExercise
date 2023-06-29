package ApnaCollage.com.io.basic;

public class SubString {
    
    public static void main(String[] args) {
        String sentence = "My Name Is Hari";
        //String name = sentence.substring( 11, sentence.length() ); //11 pachi thi jya line puri thay tya sudhi leshe (0 index) ANS = Hari
        //String name = sentence.substring( 0 , 7); ANS = My Name
        String name = sentence.substring(4); // a case ma 4 (0to3) index chodine baki nu print kare che

        System.out.println(name);
    }
}

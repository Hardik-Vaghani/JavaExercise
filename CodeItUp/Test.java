package CodeItUp;

public class Test {
    public static void main(String[] args) {

//    String s = "/abc/def/ghfj.doc";
//        System.out.println(s.substring(s.lastIndexOf("/") + 1));

        String toSplit = "/abc/def/ghfj.doc";
        String[] result = toSplit.split("/");
        String returnValue = result[result.length - 1]; //equals "ghfj.doc"
        System.out.println(returnValue);
    }
}

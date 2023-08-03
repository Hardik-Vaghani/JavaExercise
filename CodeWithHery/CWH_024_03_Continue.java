package CodeWithHery;
public class CWH_024_03_Continue {
    public static void main(String[] args) {
        for(int i=7;i>0;i--){
            if(i==3){
                continue;//continue skips the rest statement
            }
            System.out.println(i);
        }
    }
}

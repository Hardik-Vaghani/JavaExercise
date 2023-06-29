package ApnaCollage.com.io.basic;

import java.util.Scanner;

public class SolidRectangleLoop {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int m = cs.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

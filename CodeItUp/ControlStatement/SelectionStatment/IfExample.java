package CodeItUp.ControlStatement.SelectionStatment;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IfExample {
    public static void main(String[] args) throws Exception {
        int a, b, c;
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.print("Enter First Number: ");

        a = Integer.parseInt(br.readLine());
        System.out.print("Enter Second Number: ");
        b = Integer.parseInt(br.readLine());
        System.out.print("Enter Third Number: ");
        c = Integer.parseInt(br.readLine());

        if (a > b && a > c) {
            System.out.print(a+" Grater than "+b+" , "+c );
        }else if (b>a && b>c){
            System.out.print(b+" Grater than "+a+" , "+c );
        }else {
            System.out.print(c+" Grater than "+b+" , "+a );
        }

    }
}

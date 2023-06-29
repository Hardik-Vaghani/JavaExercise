package CodeItUp.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.println("Enter your name");
        try {
            String name = br.readLine();
            System.out.println("Welcome " + name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello world!");
    }
}
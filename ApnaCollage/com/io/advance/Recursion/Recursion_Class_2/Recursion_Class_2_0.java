package ApnaCollage.com.io.advance.Recursion.Recursion_Class_2;

public class Recursion_Class_2_0 {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
    if(n == 1) {
    System.out.println("transfer disk " + n + " from " + src + " to " + dest);
    return;
    }
    //transfer top n-1 from src to helper using dest as 'helper'
    towerOfHanoi(n-1, src, dest, helper);
    //transfer nth from src to dest
    System.out.println("transfer disk " + n + " from " + src + " to " + helper);
    //transfer n-1 from helper to dest using src as 'helper'
    towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
    int n = 3;
    towerOfHanoi(n, "A", "B","C");
    }
}
//Q1. Tower of Hanoi - Transfer n disks from source to destination over 3 towers.
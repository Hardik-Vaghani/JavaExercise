package ApnaCollage.com.io.advance.Recursion.Recursion_Class_1;


public class Recursion_Class_1_3 {
    public static void prinSum(int i, int n, int sum){
        if(i == n){
            
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        prinSum(i+1, n, sum);
        System.out.println(i+" = "+n+" = "+"*"+sum+"*");
    }
    public static void main(String[] args) {
        prinSum(1, 5, 0);
    }
}
//Q3. Print the sum of first n natural numbers.

// class Recursion_Class_1_3 {
//     public static void printSum(int n, int sum) {
//         if(n == 0) {
//             System.out.println(sum);
//             return;
//         }
//         sum += n;
//         printSum(n-1, sum);
//     }
//     public static void main(String args[]) {
//         printSum(5, 0);
//     }
// }
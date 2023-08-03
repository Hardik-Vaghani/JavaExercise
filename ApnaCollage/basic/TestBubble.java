package ApnaCollage.basic;

public class TestBubble {

    public static void printArray(int[] arr) {
        for( int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    
    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 8, 9, 0 , 2, 1, 6, 3, 7 };

        //Bubble sort
        //Time complexity O(n^2)
        for( int i = 0; i < arr.length - 1; i ++) {
            for( int j = 0; j < arr.length -1; j ++) {
                if( arr[j] > arr[j+1]) {
                    
                    int tast = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tast;
                }
            }
        }
        printArray(arr);
    }
}

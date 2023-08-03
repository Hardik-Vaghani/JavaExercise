package ApnaCollage.basic;

public class TestInsertion {

    public static void printArray( int [] arr) {
        for( int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = { 5, 8, 3, 2, 1, 6, 7, 9};

        for( int i = 1; i < arr.length; i ++) {
            int current = arr[i];

            int j = i - 1;
            while( j >= 0 && current < arr[j] ) {
                arr[j+1] = arr[j];
                j-- ;
                
            }
            arr[j+1] = current;
        }
        printArray(arr);
    }
}

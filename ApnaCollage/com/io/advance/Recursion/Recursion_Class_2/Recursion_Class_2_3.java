package ApnaCollage.com.io.advance.Recursion.Recursion_Class_2;
// public class Recursion_Class_2_3 {
//     public static boolean checkIfIncreasing(int arr[], int idx) {
        
//         if(idx == arr.length-1) {
//             return true;
//         }
//         if(!checkIfIncreasing(arr, idx+1)) {
//             return false;
//         }
//         return arr[idx] < arr[idx + 1];
//     }
//     public static void main(String args[]) {
//         int arr1[] = {1, 2, 3, 4, 5};
//         int arr2[] = {1, 6, 3, 4, 5};
        
//         if(checkIfIncreasing(arr2, 0)) {
//             System.out.println("Strictly Increasing");
//         } else {
//                 System.out.println("NOT Strictly Increasing");
//         }
//     }
// }
//Q4. Check if an array is sorted (strictly increasing). - O(n)

public class Recursion_Class_2_3 {
    public static boolean isSorted(int arr[],int idx){
        if(arr[idx]==arr.length){  // if(idx==arr.length-1){  //
            return true;
        }
        // if(arr[idx] < arr[idx+1]){
        //     return isSorted(arr, idx+1);
        // }else{
            
        //     return false;
        // }
        if(arr[idx] >= arr[idx+1]){
            return false;
        }else{
            return isSorted(arr, idx+1);
            
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        //int []arr={6,5,4,3,2,1};
        System.out.println(isSorted(arr, 0));
    }
}
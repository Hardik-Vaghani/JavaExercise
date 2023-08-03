package Exercise.basic;

public class Sorting {
    public static void main(String[] args) {
        int [] a = {5,8,2,7,9,3,1,4,6};
        int temp;
        System.out.println("this is a originial array :");
        for(int i=0;i<a.length;i++){
            System.out.print(" "+ a[i] +" ");
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("this is a sorted array :");
        for(int i=0;i<a.length;i++){
            System.out.print(" "+ a[i] +" ");
        }
    }
    
}

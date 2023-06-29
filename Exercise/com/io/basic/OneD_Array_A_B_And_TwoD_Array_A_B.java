package Exercise.com.io.basic;

public class OneD_Array_A_B_And_TwoD_Array_A_B{
    public static void main(String[] args) {

// 1DArray A
    //    int [] number=new int [3];

    //    number[0]=2;
    //    number[1]=3;
    //    number[2]=5;


    //    for (int i : number) {
    //        System.out.println(i);
    //     }

    //     int i=0;
    //    while(i<number.length){
    //        System.out.println(number[i]);
    //        i++;
    //     }

    //    int i=0;
    //    do{
    //         System.out.println(number[i]);
    //         i++;
    //     }while(i<number.length);

    //    for(int i=0;i<number.length;i++){
    //        System.out.println(number[i]);
    //     }

//1D Array B
        // int [] num = {1,2,3,4,5};


        // for (int i : num) {
        //     System.out.println(i);
        // }

        // for(int i=0;i<num.length;i++){
        //     System.out.println(num[i]);
        // }

        // int i=0;
        // while(i<num.length){
        //     System.out.println(num[i]);
        //     i++;
        // }

        // int i=0;
        // do{
        //     System.out.println(num[i]);
        //     i++;
        // }while(i<num.length);



// 2DArray A
        // int [][] number1=new int [3][2];

        // number1[0][0]=11;
        // number1[0][1]=12;
        // number1[1][0]=13;
        // number1[1][1]=14;
        // number1[2][0]=15;
        // number1[2][1]=16;


        // for (int[] i : number1) {
        //     for (int j : i) {
        //         System.out.println(j);
        //     }
        // }

        // for(int i=0;i<number1.length;i++){
        //     for(int j=0;j<number1[i].length;j++){
        //         System.out.println(number1[i][j]);
        //     }
        // }

        // int i=0;
        // while(i<number1.length){
        //     int j=0;
        //     while(j<number1[i].length){
        //         System.out.println(number1[i][j]);
        //         j++;
        //     }
        //     i++;
        // }

        // int i=0;
        // do{
        //     int j=0;
        //     do{
        //         System.out.println(number1[i][j]);
        //         j++;
        //     }while(j<number1[i].length);
        //     i++;
        // }while(i<number1.length);

//2D Array B
        // int [][] num1={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};


        // for (int[] i : num1) {
        //     for (int j : i) {
        //         System.out.println(j);
        //     }
        // }

        // for(int i=0;i<num1.length;i++){
        //     for(int j=0;j<num1[i].length;j++){
        //         System.out.println(num1[i][j]);
        //     }
        // }

        // int i=0;
        // while(i<num1.length){
        //     int j=0;
        //     while(j<num1[i].length){
        //         System.out.println(num1[i][j]);
        //         j++;
        //     }
        //     i++;
        // }
        
        // int i=0;
        // do{
        //     int j=0;
        //     do{
        //         System.out.println(num1[i][j]);
        //         j++;
        //     }while(j<num1[i].length);
        //     i++;
        // }while(i<num1.length);


//different

        int [][] number1=new int [3][2];

        number1[0][0]=11;
        number1[0][1]=12;
        number1[1][0]=13;
        number1[1][1]=14;
        number1[2][0]=15;
        number1[2][1]=16;


        for (int[] i : number1) {
            for(int j=0;j<i.length;j++){
                System.out.println(i[j]);
            }
        }
    }
}
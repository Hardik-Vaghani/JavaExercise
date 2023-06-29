package ApnaCollage.com.io.basic;

public class FibonacciSeries2 {

    public static void main(String[] args) {
        int a=0,b=1,c;
        System.out.print(a+" "+b);
        for(int i=0;i<=10;i++){
            c=a+b;                  //swapping //a ane b ni value plus thay ne c ma jama thay che ,c print thay che
            System.out.print(" "+c);
            a=b;                      //b ni value a ma jay che
            b=c;                      //c ni value b ma jay che
        }
    }
}

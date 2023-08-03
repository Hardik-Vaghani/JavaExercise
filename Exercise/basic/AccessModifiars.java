package Exercise.basic;

class Rohit {
    public int a = 11;
    protected int b = 22;
    int c = 33;
    private int d = 44;

    void vishal(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    public void settar(int a){
        this.d=a;
    }
    public int gettar(){
        return this.d;
    }
    
}

public class AccessModifiars {
    
    public static void main(String[] args) {
        Rohit R = new Rohit();
        // R.vishal();
        System.out.println(R.a);
        System.out.println(R.b);
        System.out.println(R.c);
        
        System.out.println(R.gettar());
    }

}
package BasicJava.This_Static_Final_Keywords;

public class MyClassThis {
    int a;                  //[Globle scope che]

    public void main(String[] args) {
        int a;      //[Only in method scope che]
        a = 11;     //[a method ne refer kare che.]

        this.a = 7; //[a Globle ne refer kare che.]

    }
}
//this(){} --> public void MyClass(){}  [constroctor pan use thay che]
// argument pn pass karvama use thay che.
//current class method is invoke (implicitly)[this keyword no use karya vagar mothod ne call kari shakay che.]
//constructor call.
//return pn pass karvama use che.
//constructor, method ma argument pass karva ma pn use thay che., .....

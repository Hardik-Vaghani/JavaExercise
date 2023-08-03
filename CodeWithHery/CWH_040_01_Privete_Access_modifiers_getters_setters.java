package CodeWithHery;
class MyEmployee {

    private int id;
    private  String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}

public class CWH_040_01_Privete_Access_modifiers_getters_setters {
    public static void main(String[] args) {
        MyEmployee emp1 = new MyEmployee();

        emp1.setName("Shubham");
        System.out.println(emp1.getName());
        emp1.setId(1);
        System.out.println(emp1.getId());

    }
}
/*
==>     Getters and Setters :
           *) Getter ➼   Returns the value  [accessors]
           *) setter ➼    Sets / updates the value  [mutators]


==>
        Access Modifier 	within class	    within package	    outside package by subclass only	    outside package
        public	                Y	                Y	                        Y	                                Y
        protected	            Y	                Y	                        Y	                                N
        Default	                Y	                Y	                        N	                                N
        private             	Y	                N	                        N	                                N




 */

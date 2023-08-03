package ApnaCollage.advance;
 
class Account {
   public String name;
   protected String email;
   private String password;
   String age;                  //Default type
 
   public void setPassword(String password) {
       this.password = password;
    }
   public String getPassword() {
       return this.password;
    }
}
public class AccessModifiers {
   public static void main(String[] args) {
       Account a1 = new Account(); 
       a1.name = "Apna College";
       a1.setPassword("abcd");
       a1.email = "hello@apnacollege.com";
    }
}

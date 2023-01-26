class User{
    private String UserName = new String();
    private String password = new String();

    public void setUserName(String new_name){
        this.UserName = new_name;
    }

    public String getUserName(){
        return this.UserName;
    }

    public void setPassword(String new_pwd){
        this.password = new_pwd;
    }
    public String getPassword(){
        return this.password;
    }

    //Encapsulation is the process of binding data and methods, which restricts the users to access unwanted data, Encapsulation uses Abstraction.
    // we use the getters and setters to access the private variables.

}

public class Encapsulation {
    public static void main(String a[]){
        User obj1 = new User();
        User obj2 = new User();
        obj1.setUserName("Siva");
        obj1.setPassword("Password");
        obj2.setUserName("X");
        obj2.setPassword("Password");
        System.out.println("The object1's UserName : " + obj1.getUserName());
        System.out.println("The object1's Password : "+obj1.getPassword());
        System.out.println("The object2's UserName : "+obj2.getUserName());
        System.out.println("The object2's Password : "+obj2.getPassword());
    }
}

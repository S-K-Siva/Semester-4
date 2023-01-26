/*
 * In Java , By default super() method is will be intialized in all constructor,
 * First the super class/ base class's constructor will be executed and then it's constructor will be executed.
 * 
 * If you wan't to make changes to super() method we can make it explicitly.
 * we don't need to initialize super() method in all constructor if there is no use.
 */
class Base_class{
    public Base_class(){
        System.out.println("Base_class Constructor called!");
    }

    public Base_class(int num){
        this();
        System.out.println("Base_class Parameterized Constructor called!");
    }
}

class Derived_class extends Base_class{
    public Derived_class(){
        System.out.println("Derived_class constructor called!");
    }

    public Derived_class(int num){
        
        super(num); //Here we explicitly intializing the changes to the super method.
        /*
         * If we want to executed the default constructor. we can call using this() method like super method.
         * this and super cannot be intialized at a same time.
         */
        
        
        System.out.println("Derived_class parameterized constructor called!");
    }
}

public class This_and_Super_method {
    public static void main(String a[]){
        Derived_class obj = new Derived_class(34);
    }
}

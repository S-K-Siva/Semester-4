class Rank{
    int rank;
    public static void print(){
        //we can use static variable inside static method
        //we can't use non-static variable inside static method.
        //bcz when we call static method using class_name, the variables inside if it is normal variable, then there will be ambiguity,
        //that the variable belong to which object.

        //if we have object reference, then we can use it.
        System.out.println("Static method called");
    }
    // creating static method with object reference.
    public static void print(Rank obj){
        System.out.println("The rank is "+obj.rank);
    }
}
public class static_method {
    public static void main(String a[]){
        // why main is static?
        // if we remove static we need to create a object for the class, then we should able to execute the main method.
        // To solve this, we just adding static keyword. so that we can access this without any object, hence the problem is solved.

        Rank obj1 = new Rank();
        obj1.rank = 29;
        Rank.print(obj1);
       
    }
}

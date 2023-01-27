// import OuterClass.InnerClass;

abstract class A{
    //abstract class can have abstract functions.
    abstract void display(); 
    //it should be defined by the base class.
    

}
class B extends A{

    //when a class inherits the abstract class, it should have all the abstract function defined within it.
    void display(){
        System.out.println("Class B Called Successfully!");
    }
}

class OuterClass{
    public void display(){
        System.out.println("Outer class display has been called");
    }
    class InnerClass{
        public void display(){
            System.out.println("Inner class display has been called");
        }
    }
}

public class AbstractKeyword {
    public static void main(String a[])
    {
        //The way to create a object for abstract class. Inside the block is determined as Concrete class.
        A obj = new A(){
            void display(){
                System.out.println("Abstract class is called!"); // This is innerclass(which is also called anononymous inner-class)
            } // Usually we can't create a object of Abstract class, we able to create object with concrete class.

        };
        obj.display();

        //The way to create object for outer class
        OuterClass outer_obj = new OuterClass();
        //The way to create object for inner class
        //creating object for inner class using the object of outer_class.
        OuterClass.InnerClass inner_obj = outer_obj.new InnerClass();
        outer_obj.display();
        inner_obj.display();
    }
}

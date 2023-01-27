class A{
    final void display(){
        System.out.println("Hello world");
    }
}
class B extends A{
    // we can't declare a function with display, bcz it is already declared in base class with final(constant) keyword.
    // if we try to change, it would end up with error.

}
public class final_keyword {
    //let's take a example, we have a two classes connected with inheritance.
    //let's assume both class have same method with same name, normally it would override depending on the class_object created with.
    //final_keyword is used to make the varaible/method/class as constant, if we make a base class method as final, then we can't declare a same functionw in derived class.
    //This is the beauty of derived class.
    public static void main(String a[]){
        B obj = new B();
        obj.display();
    }
}

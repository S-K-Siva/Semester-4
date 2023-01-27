class A{
    void show(){
        System.out.println("Class A");
    }
}
class B extends A{
    void show(){
        System.out.println("Class B");
    }
}


public class Polymorphism {
    public static void main(String a[]){
        //Dynamic method dispatch.
        A obj = new A();
        obj.show();
        B obj1 = new B();
        obj1.show();
        A obj2 = new B();
        obj2.show();
        A obj4 = (A) new B(); // This is up stream.
        obj4.show();
    }
}

/*
 * In Interfaces, the methods inside the Interface are by default abstract, and the attributes inside are final and static by default.
 * to User Interface in classes, we need to use 'implements' instead of 'extends';
 * 
 * we able to do inheritance inbetween interface by using 'extends' keyword.
 * 
 * In java, there won't be any memory in heap for attributes of Interface, becuase they are final and static.
 * 
 * In Interface, we don't need to use abstract keyword for the methods, bcz by default it does.
 * 
 * interface is mostly used while building applications.
 * 
 * The class which implements the interface should define the methods of interface.
 * 
 */

interface Employee{
    int id = 19;
    void work();
    void document();
}
interface SubEmployee extends Employee{
    void document();
}
class MyClass implements SubEmployee{
    public void work(){
        System.out.println("Employee working");
    }
    public void document(){
        System.out.println("Making Document of the work");
    }
}
// In case, if we implements the interface in the abstract class, then while creating an object we need to use anonymous inner class and then we can define the method of the interface and work with it.

interface A{
    void feature();
}

class DemoClass implements A{
    public void feature(){
        System.out.println("The DemoClass Feature");
    }
}
class DemoClass1 implements A{
    public void feature(){
        System.out.println("The DemoClass1 Feature");
    }
}

public class Interface {
    public static void main(String a[]){
        // Employee obj = new SubEmployee() {
        //     public void work(){
        //         System.out.println("Employee working");
        //     }
        //     public void document(){
        //         System.out.println("Making Document of the work");
        //     }
        // };
        // MyClass obj = new MyClass();
        // obj.work();
        // obj.document();
        A obj = new DemoClass(); // Interface reference
        A obj1 = new DemoClass1(); // Interface reference
        obj.feature();
        obj1.feature();
    }
}

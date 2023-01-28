
@FunctionalInterface // These are called Annotations in java.
//to overcome the ambiguity and to resolve the errors in compile time(by the user), this annotions is used.
interface Cal{
    void add();
}
@FunctionalInterface
interface Advcal{
    int sub(int num1,int num2);
}
// NOTE : Lambda expressions are used with only Function Interfaces.
// Functional Interface - It is the interface with one abstract method.
// Lambda expression works with Functional Interface,because if a Interface has more than one class then there would be ambiguity that the lambda expression belong to which abstract method.
// The sytax for lambda expression is 
/*
1. If there are one statement
 * Interface_Name Interface_object = () -> statement;
 *
2. If there are multiple statement
 * Interface_Name Interface_object = () -> {
 *      statements
 * }
 * 
3. If the function has return statement, we should not use return keyword. then the syntax would be
Interface_name Interface_object = () -> (return_value)
 */

public class lambda_expression {
    public static void main(String a[]){
        Cal obj = () -> System.out.println("Hello");
        obj.add();
        Advcal obj1 = (num1,num2) -> (Math.abs(num1-num2));
        System.out.println(obj1.sub(3,5));
    }
}

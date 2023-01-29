//Race Condition occurs when one object is called by two threads at a same time.
// It can be explained using Functional Interface easily, bcz it's the interface with only one function.
// NOTE: Thread class is inherited/implemented from the Runnable interface. Where Runnable interface is a Functional Interface;
// To do race condition, we need to intialize two threads seperately and we need to pass our process as the argument to it.
// class A implements Runnable{
//     public void run(){
//         for(int i = 0;i<10;i++){
//             System.out.println("Class A");
//             try{
//             Thread.sleep(10);
//             }
//             catch(InterruptedException e){
//                 System.out.println("Message : "+e);
//             }
//         }
//     }
// }
// class B implements Runnable{
//     public void run(){
//         for(int i = 0;i<10;i++){
//             System.out.println("Class B");
//             try{
//             Thread.sleep(10);
//             }
//             catch(InterruptedException e){
//                 System.out.println("Message : "+e);
//             }
//         }
//     }
// }

public class Race_condition {
    public static void main(String a[]){
        //Here now instead of creating a class objects, we can create a interface objects which refers the class.
        // but to make more efficient, we no need class, we can use lambda expression with anonymous class to get rid of more code structure.
        // Don't forget : lambda expression are used mostly in Functional interface where it has only one method in it.
        // we get rid of using classes by the below method.
        Runnable obj1 = () -> {
                for(int i = 0;i<10;i++){
                    System.out.println("Class A");
                    try{
                    Thread.sleep(10);
                    }
                    catch(InterruptedException e){
                        System.out.println("Message : "+e);
                    }
                }
            
        };
        Runnable obj2 = () -> {
            for(int i = 0;i<10;i++){
                System.out.println("Class B");
                try{
                Thread.sleep(10);
                }
                catch(InterruptedException e){
                    System.out.println("Message : "+e);
                }
            }
        
    };
    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);
    t1.start();
    t2.start();

    }
}

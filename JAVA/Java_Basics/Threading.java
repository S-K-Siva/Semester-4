// Threads are the small unit to work with.
// Threading can be done using Thread module in java.
// There are some thread methods which makes to do threading process.....
// They are start(), run(), sleep().
// if we start our threading using start() method, there should be run() method inside our class to work with.
// Start() method calls run() method.

//we able to set priority to the objects by using setPriority() method. we have MAXPRIORITY,MINPRIORITY and NORMPRIORIRY.

class A extends Thread{
    public void run(){
        for(int i = 0;i<10;i++){
            System.out.println("Class A");
            try{
            Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println("Message : "+e);
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 0;i<10;i++){
            System.out.println("Class B");
            try{
            Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println("Message : "+e);
            }
        }
    }
}
public class Threading {
    public static void main(String a[]) throws InterruptedException{
        A obj1 = new A();
        B obj2 = new B();
        //obj1.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        Thread.sleep(1);
        obj2.start();
        

    }
}

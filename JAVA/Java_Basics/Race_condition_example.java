
import java.io.IOException;

class Iterator{
    int Count;
    public synchronized void Increment(){
        Count++;
    }
}
public class Race_condition_example {
    public static void main(String a[]) throws IOException, InterruptedException
    {
        //READ : Race_condition.java (Prerequistes)
        Iterator i = new Iterator();
        Runnable obj1 = () -> {
            for(int iter = 0;iter<50;iter++){
                i.Increment();
            }
        };
        Runnable obj2 = () -> {
            for(int iter = 0;iter<50;iter++){
                i.Increment();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        t1.join(10);
        t2.join(10);
        System.out.println(i.Count);
    }
}

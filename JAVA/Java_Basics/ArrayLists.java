
import java.util.Collection;
import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String a[]){
        Collection<Integer> obj = new ArrayList();
        Collection<Integer> obj2 = new LinkedList<>();
        obj2.add(344);
        obj2.add(444);
        obj2.add(23);
        obj.add(34);
        obj.add(44);
        obj.add(36);
        Consumer<Integer> obj1 = new Consumer<Integer>() {
            public void accept(Integer i){
                System.out.println(i);
            }
        };
        obj.forEach(obj1);
        
        for( Integer item : obj){
            System.out.print(item +"--->");
        }System.out.println();

        for( Integer item : obj2){
            System.out.println(item);
        }
    }
}

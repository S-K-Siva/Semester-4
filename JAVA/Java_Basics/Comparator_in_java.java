import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
public class Comparator_in_java {
    public static void main(String a[]){
        Comparator<Integer> obj = (Integer i1, Integer i2)-> i1>i2?1:-1 ;

        List<Integer> obj1 = new ArrayList<Integer>();
        obj1.add(34);
        obj1.add(33);
        obj1.add(1);
        obj1.add(5);
        Stream<Integer> result = obj1.stream().sorted(obj);
        result.forEach(n->System.out.println(n));
    }
}

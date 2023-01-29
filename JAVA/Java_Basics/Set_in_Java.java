import java.util.HashSet;
import java.util.Set;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Stream;
public class Set_in_Java {
    public static void main(String a[]){
        Set<Integer> obj = new HashSet<Integer>();
        //HashSet gives a unsequenced output.
        //To get a sequenced output, use Treeset.
        Set<Integer> obj1 = new TreeSet<Integer>();
        obj1.add(1);
        obj1.add(3);
        obj1.add(5);
        obj1.add(0);
        obj.add(34);
        obj.add(44);
        obj.add(52);

        Stream<Integer> result = obj.stream().sorted();

        result.forEach(n->System.out.println(n));
        System.out.println(obj1);
    }
}

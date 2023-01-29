import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class List_in_Java {
    public static void main(String a[]){
        List<Integer> arr = new ArrayList<>();
        arr.add(34);
        arr.add(44);
        arr.add(55);
        Stream<Integer> obj;
        obj =  arr.stream().filter(n-> n % 2==0);
        obj.forEach(n->System.out.println(n));
        System.out.println("The element in the index position 1 of the array is : " + arr.get(1));
        System.out.println(arr);
    }
}

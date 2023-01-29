import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
public class Map_in_java {
    public static void main(String a[]){
        Map<Integer,String> RankList = new  HashMap<Integer,String>();
        RankList.put(1,"Siva S K");
        RankList.put(2,"Person x");
        RankList.put(3,"Person y");
        RankList.put(4,"Person z");
        System.out.println(RankList.get(1));
        System.out.println(RankList);
        //reduce function in stream is used to do some operations like addition or getting total.
        // reduce( start, (e1,e2) -> operation_with_e1_and_e2)
        Stream<Integer> obj = RankList.keySet().stream().filter(n->n<2);
        obj.forEach(n->System.out.println(RankList.get(n)));
        // If we are working with threads, they we would go for HashTable.
    }
}

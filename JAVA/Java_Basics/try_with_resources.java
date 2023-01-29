import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class try_with_resources {
    public static void main(String a[]) throws IOException, NumberFormatException{
        //In java, for exceptional handling we can do the process using try catch.
        // If we don't want to catch, then we can use finally, even we can use finally keyword though using catch.

        //let's take example
        // int number;
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try{
        //     number = Integer.parseInt(br.readLine());
            
        // }
        // //here we don't need to use catch , if the try block won't have error
        // finally{ //finally is mostly used to close the file connection / database connection in real world applications.
        //     br.close();
        // }
        // System.out.println(number);


        //The above code is lengthy and we can reduce this with the concept of try_with_resources.
        //In try_with_resources, we don't want to mention finally!.
        int number;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            number = Integer.parseInt(br.readLine());
            
        }
        
        System.out.println(number);
    }
}

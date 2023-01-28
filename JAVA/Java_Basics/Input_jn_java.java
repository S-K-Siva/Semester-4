import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
public class Input_jn_java {
    public static void main(String a[]) throws IOException{

        //old way
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // System.out.println("Enter any number:");
        // int num = Integer.parseInt(bf.readLine());

        /*
         * we able to use System.out.read() to get input which it return Integer by default, but while printing it will print the ASCII value of it.
         * so while printing final output we tend to print like System.out.println(result - 48).
         * But the above print statement only works for single digit.
         * 
         * To overcome this issue, we have special library called "Scanner" which is imported from utitlities library of java.
         * import java.util.Scanner
         * This Scanner provides a lot of handy function to get the inputs from the user and it reduces the lines of getting input.
         * 
         */
        //new way
        Scanner num = new Scanner(System.in);
        System.out.println("Enter any number:");
        System.out.println("The number you have entered is : " + num.nextInt());
    
    }
}

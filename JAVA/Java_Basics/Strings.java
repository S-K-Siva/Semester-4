public class Strings {
    public static void main(String a[]){
        //String are immutable in nature in Java.
        String name = "Siva";
        //This works, but since the String is a class we can declare the string variable in another way.
        String MyName = new String("Siva S K");
        //we can't change the value of the string, bcz it's immutable in nature.
        //To overcome this, we have StringBuffer or String builder
        //StringBuffer is thread safe and Stringbuilder is not.
        //StringBuffer and Stringbuilder is almost same.
        StringBuffer Myname = new StringBuffer("Siva S K");
        Myname.setCharAt(0, 'H');
        System.out.println(Myname);
    }
}

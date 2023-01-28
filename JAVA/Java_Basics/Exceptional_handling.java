class SivaException extends Exception{ // creating my own exception.
    public SivaException(String message){
        super(message);
    }
}
public class Exceptional_handling {
    public static void main(String a[]){
        int j = 0;
        try{
            j = 100/101;
            System.out.println(j);
            if(j == 0){
                System.out.println("YES");
                throw new SivaException("Number shouldn't be divided by zero!");
            }
        }
        catch(SivaException se){
            System.out.println("YESS");
            System.out.println(se);
        }
        catch(ArithmeticException ae){
            System.out.println("Arithmetic Exception has been triggered!");
        }
        catch(Exception exception){
            System.out.println("Error has been occurred : " + exception);
        }
    }

}

enum Company{
   //below are the objects of the enum and this is the beauty of the  enum, we can't inherit enum, it works like a class.
   // In enum, we can't create a new object though it works like a class, we able to access the predefined objects in the enum
   // we can call enum is also defined as predefined!.
   Microsoft(150),Google(350),Amazon(135), OpenAI;
   private int net_worth_billions;
   private Company(){
      this.net_worth_billions = 100;
   }
   private Company(int net_worth){
      this.net_worth_billions = net_worth;
   }
   public void display(){
      System.out.println(this.name() + " Company's net worth is " + this.net_worth_billions);
   }
}
interface MyCompany{
   void hello();
}
enum base implements MyCompany{
   ;//for objects

   
   public void hello() {
      // TODO Auto-generated method stub
      
   }
   
}
public class Enum_java {
   public static void main(String a[]){
      Company obj = Company.Google;
      obj.display();
      //let's print the object number
      Company allcompanies[] = Company.values();
      for(Company com : allcompanies){
         if(com.ordinal() == allcompanies.length - 1)
            System.out.print(com);
         else
            System.out.print(com + " , ");
      }System.out.println();
   } 
}

class MyRank{
    static int rank;
    public void display(){
        System.out.println("My Rank is "+rank);
    }
    
    //constructor
    public MyRank()
    {
        //we can initialize static variables too.
        //but whenever the objects are created, the constructor will be called, and the static varaible will be assigned each time,which we don't want.
        //To overcome this we have a static block.
        System.out.println("Constructed Called");
    }
    //static block
    static
    {
        //static block is called only once, irrespective of how many objects created.
        //all static variables will be declared inside this block.
        rank = 0;
        System.out.println("Static called");

    }
}
public class Static_Keyword {
    public static void main(String a[]){
        //static keyword makes only single copy for all objects.
        //it is shared by all objects(Common varaible/instance used by all objects).

        //class loads -> objects are initialized.
        //but class loads only once.

        MyRank obj1 = new MyRank();
        MyRank obj2 = new MyRank();
        obj1.display(); //It initialized zero by static block by default.
        obj1.rank = 10;
        obj2.rank = 1; //this will change the rank for all object, bcz it's static variable.
        obj1.display();
        obj2.display();
    }
}

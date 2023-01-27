class A{
    public void display(){
        System.out.println("The Class A.");
    }
    public boolean equals(A obj){
        System.out.println("Called");
        String com1 = this.toString();
        String com2 = obj.toString();
        //System.out.println(com1 + "---" + com2 + "---" + (com1.equals(com2)));
        return com1.equals(com2);
    }
}
public class ToString {
    public static void main(String a[]){
        A obj = new A();
        obj.display();
        System.out.println(obj);
        //when we try to print the object, it would return obj.toString() which is built-in method.
        System.out.println(obj.toString());
        System.out.println(obj.equals(obj));
    }
}

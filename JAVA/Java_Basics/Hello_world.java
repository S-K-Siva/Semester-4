class MyCalculator{
    public int add(int number1,int number2){
        return number1+number2;
    }
    
    public int add(int num1,int num2, int num3){
        return (num1+num2+num3);
    }
    
}

public class Hello_world{
    public static void main(String a[]){
        int num1 = 10,num2 = 20;
        MyCalculator obj = new MyCalculator();
        int result = obj.add(num1, num2,3);
        System.out.println("The addition of "+num1+" and "+num2+" is "+result);
        int arr[] = new int[10];
        for(int i = 0;i<arr.length;i++){
            arr[i] = i+1;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Let's create a Two Dimensional array!");
        int two_dim_arr[][] = new int[3][3];
        for(int i = 0;i<two_dim_arr.length;i++){
            for(int j = 0;j<two_dim_arr.length;j++){
                two_dim_arr[i][j] = (int) (Math.random() * 10);
            }
        }
        for(int i = 0;i<two_dim_arr.length;i++){
            for(int j = 0;j<two_dim_arr.length;j++){
                System.out.print(two_dim_arr[i][j]+" ");
            }System.out.print("\n");
        }
        System.out.println("Printing same matrix with enhanced for-loop!");
        //enhanced for-loop.
        for(int it[] : two_dim_arr){
            for(int iter : it){
                System.out.print(iter + " ");
            }
            System.out.println();
        }
    }
}
public class Mul_arr {
    public static void main(String a[])
    {
        //Let's discuss multidimensional array.
        int arr[][] = new int [3][]; //Jagged array
        //In jagged array we need to specify size for individual row.
        arr[0] = new int [3];
        arr[1] = new int [2];
        arr[2] = new int [3];

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                arr[i][j] = i+j;
            }
        }
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //Three dimensional array structure would be like below.
        int three_dim_arr [] [] [] = new int [3][2][1];
        
    }

}
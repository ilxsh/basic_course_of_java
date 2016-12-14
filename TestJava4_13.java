// The following program show how to use a two demension array as parameter to pass to a method.
public class TestJava4_13
{
    public static void main(String args[])
    {
        int A[][]={{51,38,22,12,34},{72,64,19,31}}; // declare a two demension array
        print_mat(A);
    }
    public static void print_mat(int arr[][]) // receive integer type of two demension array
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" "); // output array
            }
            System.out.println();
        }
    }
}

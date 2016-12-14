// The following program show how to return a value which is index of two demension array
public class TestJava4_14
{
    public static void main(String[] args)
    {
        int A[][]={{51,38,82,12,34},{72,64,19,31}}; // define a two demesion array
        int B[][]=new int[2][5];
        B=add10(A); // invoke add10(), and assign return value to B
        for(int i=0;i<B.length;i++)
        {
            for(int j=0;j<B[i].length;j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] add10(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]+=10;  // all element in the array add 10
            }
        }
        return arr;             // return index of two demension of array
    }
}

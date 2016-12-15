// The following program show how to copy array
public class TestJava4_4
{
    public static void main(String[] args)
    {
        int a1[] = {1,2,3,4,5}; // declare two integer array
        int a2[] = {9,8,7,6,5,4,3};
        System.arraycopy(a1, 0, a2, 0, 3); // execute array copy
        System.out.print("The content of a1 is: ");
        for(int i=0;i<a1.length;i++)
        {
            System.out.print(a1[i]+" ");
        }
        System.out.println();
        System.out.print("The content of a2 is: ");
        for(int i=0;i<a2.length;i++)
        {
            System.out.print(a2[i]+" ");
        }
        System.out.println("\nArray copy is completed.");
    }
}

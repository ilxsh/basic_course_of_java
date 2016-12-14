// The following code show static assignment
public class TestJava4_2
{
    public static void main(String[] args)
    {
        int i;
        int a[] = {5, 6, 8}; // declare a integer array a
        for(i=0;i<a.length;i++)
        {
            System.out.print("a["+i+"] = "+a[i]+",\t");
        }
        System.out.println("\n Length of array is: "+a.length);
    }
}

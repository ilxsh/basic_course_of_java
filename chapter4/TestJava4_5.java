// The following program is to sort array by using sort method
import java.util.*;
public class TestJava4_5
{
    public static void main(String[] args)
    {
        int a[] = {4,32,45,32,65,32,2};
        System.out.print("Before sort array: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        Arrays.sort(a);  // sort array
        System.out.print("\n After sort array: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}

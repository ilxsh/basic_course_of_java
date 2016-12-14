// The following code show how to create and use one demention array
public class TestJava4_1
{
    public static void main(String args[])
    {
        int i;
        int a[]; // delclare one demention array
        a = new int[3]; // get mem space for a
        for(i=0;i<3;i++) // output content of array a
        {
            System.out.print("a["+i+"] = "+a[i]+",\t");
        }
        System.out.println("\n array length is: "+a.length);
    }
}

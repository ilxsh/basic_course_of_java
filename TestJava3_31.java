// The following code show how to use two for loop.
public class TestJava3_31
{
    public static void main(String[] args)
    {
        int i, j;
        // use two for
        for(i=1;i<=9;i++)
        {
            for(j=1;j<=9;j++)
            {
                System.out.print(i+" * "+j+" = "+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}

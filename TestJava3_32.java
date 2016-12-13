// The following program show how to use break
public class TestJava3_32
{
    public static void main(String[] args)
    {
        int i;
        for(i=1;i<=10;i++)
        {
            if(i%3==0)
                break;
            System.out.println("i = "+i);
        }
        System.out.println("Loop break: i = "+i);
    }
}

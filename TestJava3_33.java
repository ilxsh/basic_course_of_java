// The following program show how to use 'continue'
public class TestJava3_33
{
    public static void main(String[] args)
    {
        int i;
        for(i=1;i<=10;i++)
        {
            if(i%3==0)
                continue;
            System.out.println("i = "+i);
        }
        System.out.println("loop break: i = "+i);
    }
}

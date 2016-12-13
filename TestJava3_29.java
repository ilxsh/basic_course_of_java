// The following program show how to use 'do...while'
public class TestJava3_29
{
    public static void main(String[] args)
    {
        int i = 1, sum = 0;
        // do .. while will do first, then if the while statement is true, do it again. Otherwise go through the while.
        do
        {
            sum+=i;
            i++;
        }while(i<=10);
        System.out.println("1+2+...+10="+sum);
    }
}

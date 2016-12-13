// The following program is to show how to use 'and' operator. Return ot this value is boolean.
public class TestJava3_19
{
    public static void main(String[] args)
    {
        int a = 56;
        if((a<0)||(a>100))
        {
            System.out.println("Input data is invalid!");
        }
        if((a<60)&&(a>49))
        {
            System.out.println("Prepare for re-exam");
        }
    }
}

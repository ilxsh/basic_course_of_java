// if the value of integer bigger than its max value, overflow will accur
public class TestJava3_4
{
    public static void main(String[] args)
    {
        int x = java.lang.Integer.MAX_VALUE; // get max value of integer
        System.out.println("x   = "+x);
        System.out.println("x+1 = "+(x+1));
        System.out.println("x+2 = "+(x+2));
    }
}

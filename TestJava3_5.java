// The following use force convertion when overflow
public class TestJava3_5
{
    public static void main(String[] args)
    {
        int x = java.lang.Integer.MAX_VALUE;

        System.out.println("x     = "+x);
        System.out.println("x + 1 = "+(x+1));
        System.out.println("x + 2 = "+(x+2L));
        System.out.println("x + 3 = "+((long)x+3));
    }
}

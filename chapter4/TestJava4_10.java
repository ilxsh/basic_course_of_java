// The following program show how to use method
public class TestJava4_10
{
    public static void main(String[] args)
    {
        double num;
        num = show_length(22,19); // pass 22 and 19 to method show_length()
        System.out.println("length of arc = "+num);
    }

    public static double show_length(int m, int n)
    {
        return Math.sqrt(m*m+n*n);  // return length of arc
    }
}

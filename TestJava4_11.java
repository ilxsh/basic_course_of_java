// The following program show how to override a method
public class TestJava4_11
{
    public static void main(String[] args)
    {
        int int_sum;
        double double_sum;
        int_sum = add(3,5);  // Invoke method add which had two parameter
        System.out.println("The value of int_sum=add(3,5) is: "+int_sum);
        int_sum=add(3,5,6);  // Invoke method add which had three parameter
        System.out.println("The value of int_sum=add(3,5,6) is: "+int_sum);
        double_sum=add(3.2,6.5);  // Invoke method add which had two double parameter
        System.out.println("The value of int_sum=add(3.2,6.5) is: "+double_sum);
    }
    public static int add(int x, int y)
    {
        return x+y;
    }
    public static int add(int x, int y, int z)
    {
        return x+y+z;
    }
    public static double add(double x, double y)
    {
        return x+y;
    }
}

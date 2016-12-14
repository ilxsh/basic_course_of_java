// The following program is about return value of a integer
public class TestJava4_9
{
    public static void main(String[] args)
    {
        int num;
        num = star(7); // pass 7 to start method, the use num to store the return value.
        System.out.println(num+" starts printed");
    }
    public static int star(int n)
    {
        for(int i=1;i<=2*n;i++)
        {
            System.out.print("*"); // output symbol "*" 2*n times
        }
        System.out.println(); // start a new line
        return 2*n;  // return integer 2*n
    }
}

// The following program is to show how to declare and use a method
public class TestJava4_8
{
    public static void main(String[] args)
    {
        start(); // invoke start() method
        System.out.println("I Like Java!");
        start(); // invoke start() method
    }
    public static void start()  // start() method
    {
        for(int i=0;i<19;i++)
        {
            System.out.print("*"); // output * 19 times
        }
        System.out.println();
    }
}

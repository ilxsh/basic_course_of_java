// The following program is about simple writing. Such as "-=<var>++". But this is not use now
public class TestJava3_21
{
    public static void main(String[] args)
    {
        int a = 10, b = 6;
        System.out.println("Before change is: a = "+a+", b = "+b);
        a-=b++; // Will caculate a-b first, then caculate b++
        System.out.println("After change is: a = "+a+", b = "+b);
    }
}

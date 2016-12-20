public class TestSingleDemo1
{
    private TestSingleDemo1()
    {
        System.out.println("private TestSignleDemo1.");
    }
    public static void main(String[] args)
    {
        new TestSingleDemo1();
    }
}

class Person
{
    static int count=0; // declare a static class
    public Person()
    {
        count++;
        System.out.println("Generate: "+count+" object");
    }
}
public class TestStaticDemo3
{
    public static void main(String[] args)
    {
        new Person();
        new Person();
    }
}

class Person
{
    public Person()
    {
        System.out.println("1 public Person()");
    }
    static
    {
        System.out.println("2.Person's static method is been invok!");
}
public class TestStaticDemo5
{
    //run this program, static code is runing.
    static
    {
        System.out.println("3.TestStaticDemo5 is invok");
    }
    public static void main(String[] args)
    {
        System.out.println("4.Program is been call");
        new Person();
        new Person();
    }
}

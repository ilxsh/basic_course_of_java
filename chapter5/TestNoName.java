class Person
{
    private String name="zhangsan";
    private int age=25;
    public String talk()
    {
        return "I am: "+name+", this year is: "+age+" years old";
    }
}
public class TestNoName
{
    public static void main(String[] args)
    {
        System.out.println(new Person().talk());
    }
}

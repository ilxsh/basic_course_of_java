class Person
{
    private String name;
    private int age;
    public Person(String n, int a)
    {
        name=n;
        age=a;
        System.out.println("public Person(String n, int a);
    }
    public String talk()
    {
        return "I am: "+name+"This year is: "+age+"years old.;
    }
}
public class TestConstruct1
{
    public static void main(String[] args)
    {
        Person p=new Peron("zhangsan", 25);
        system.out.println(p.talk());
    }
}

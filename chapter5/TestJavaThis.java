class Person
{
    private String name;
    private int age;
    public Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public String talk()
    {
        return "I am: "+name+", this years will be: "+age+"year";
    }
}
public class TestJavaThis
{
    public static void main(String[] args)
    {
        Person p=new Person("zhangsan", 25);
        System.out.println(p.talk());
    }
}

class Person
{
    String name;
    int age;
    Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    boolean compare(Person p)
    {
        if(this.name.equals(p.name)&&this.age==p.age)
        {
            return true;
        }
        else
        {
            return flase;
        }
    }
}

public class TestCompare
{
    public static void main(String[] args)
    {
        Person p1=new person.("zhangsan",30);
        Person p2=new person.("zhangsan",30);
    }
}

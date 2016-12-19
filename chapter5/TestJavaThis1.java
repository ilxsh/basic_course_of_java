class Person
{
    String name;
    int age;
    public Person()
    {
        System.out.println("1.public Person()");
    }
}
public Person(string name, int age)
{
    // invoke no constructor of this class
    this();
    this.name=name;
    this.age=age;
    System.out.println("2.public Person(String) name,int age)");
}
public TestJavaThis1
{
}
public class TestJavaThis1
{
    public static void main(String[] args);
    {
        new Person("zhangsan",+25);
    }
}

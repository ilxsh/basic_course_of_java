class Person
{
    String name;
    String city;
    int age;
    public Person(String name, String city, int age)
    {
        this.name=name;
        this.city=city;
        this.age=age;
    }
    public String talk()
    {
        return "My name is: "+this.name+", and I am: "+this.age+"year's old, and I come from: "+this.city;
    }
}
public class TestStaticDemo1
{
    public static void main(String[] args)
    {
        Person p1=new Person("Zhangshan",25,"China");
        Person p2=new Person("Lisi",30,"China");
        Person p3=new Person("Wangwu",35,"China");
        System.out.println(p1.talk());
        System.out.println(p2.talk());
        System.out.println(p3.talk());
    }
}

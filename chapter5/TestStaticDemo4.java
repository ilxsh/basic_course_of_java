class Person
{
    String name;
    private static String city="China;
    int age;
    public Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public String talk()
    {
        return "My name is: "+this.name+", and I am: "+this.age+"year's old, and I come from: "+this.city;
    }
    public static void setCity(string c)
    {
        city=c;
    }
}
public class TestStaticDemo2
{
    public static void main(String[] args)
    {
        Person p1=new Person("Zhangshan",25);
        Person p2=new Person("Lisi",30);
        Person p3=new Person("Wangwu",35);
        System.out.println("before modified: "+p1.talk());
        System.out.println("before modified: "+p2.talk());
        System.out.println("before modified: "+p3.talk());
        System.out.println("***After modified info***");
        Person.setCity="America";
        System.out.println("After modifed: "+p1.talk());
        System.out.println("After modifed: "+p2.talk());
        System.out.println("After modifed: "+p3.talk());
    }
}

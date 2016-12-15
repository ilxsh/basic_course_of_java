class Person
{
    String name;
    int age;
    void talk()
    {
        System.out.println("I am: "+name+", and is: "+age+" year old");
    }
}
// The following example show the process of using Person class to invole property and method.
public class TestPersonDemo1
{
    public static void main(String[] args)
    {
        // declare and instance a object of Person P1
        Person p1=new Person();
        // declare and instance a object of Person P2
        Person p2=new Person();

        // set property of person1
        p1.name="Zhang San";
        p1.age=25;
        // set property of person2
        p2.name="Li si";
        p2.age=30;

        // invoke talk of P1 and P2
        p1.talk();
        p2.talk();
    }
}

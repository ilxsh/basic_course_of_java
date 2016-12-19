class Person
{
    String name;
    int age;
}
public class TestRefDemo1
{
    public static void main(String[] args)
    {
        // decalre a object p1 and assign it value to null. because it not intance
        Person p1 = null;
        // decalre a object p2 and assign it value to null. because it not intance
        Person p2 = null;
        // Instant object p1
        p1=new Person();
        // This is the value of object 1
        p1.name="zhangsan";
        p1.age=25;
        // assign p1's ref to p2
        p2=p1;
        // output attribute of p2
        System.out.println("name: "+p2.name);
        System.out.println("age : "+p2.age);
    }
}



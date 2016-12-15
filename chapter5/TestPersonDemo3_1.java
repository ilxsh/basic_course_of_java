class Person
{
    private String name;
    private int age;
    void talk()
    {
        System.out.println("I am: "+name+", and is: "+age+" year old");
    }
}
// The following example show the process of using Person class to invole property and method.
class TestPersonDemo3_1
{
    public static void main(String[] args)
    {
        // declare and instance Person object p
        Person p=new Person();
        p.name="Zhang San";
        // assign -25 to age
        p.age=-25;
        // call method talk() of class Person
        p.talk();
    }
}

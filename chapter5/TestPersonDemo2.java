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
class TestPersonDemo2
{
    public static void main(String[] args)
    {
        Person p=new Person();
        p.name="Zhang San";
        p.age=-25;
        p.talk();
    }
}

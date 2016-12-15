class Person
{
    private String name;
    private int age;
    private void talk()
    {
        System.out.println("I am: "+name+", and is: "+age+" year old");
    }
    public void setName(String str)
    {
        name=str;
    }
    public void setAge(int a)
    {
        if(a>0)
        {
            age=a;
        }
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
// The following example show the process of using Person class to invole property and method.
class TestPersonDemo4
{
    public static void main(String[] args)
    {
        // declare and instance Person object p
        Person p=new Person();
        p.setName("Zhang San");
        // assign -25 to age
        p.setAge(-25);
        // call method talk() of class Person
        p.talk();
    }
}

public class StringDemo
{
    public static void main(String[] args)
    {
        String str1="java";
        String str2=new String("java");
        String str3="java";
        System.out.println("str1==str2?--->"+(str1==str2));
        System.out.println("str1==str3?--->"+(str1==str3));
        System.out.println("str3==str2?--->"+(str3==str2));
    }
}

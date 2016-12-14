// use one demension as parameter to a method.
public class TestJava4_12
{
    public static void main(String[] args)
    {
        int score[]={7,3,8,19,6,22}; // declare a one demesion array
        largest(score);
    }
    public static void largest(int arr[])
    {
        int tmp=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(tmp<arr[i])
            {
                tmp=arr[i];
            }
        }
        System.out.println("The max value is: "+tmp);
    }
}

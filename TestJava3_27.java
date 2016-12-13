// The following program show how to use 'switch'
public class TestJava3_27
{
    public static void main(String[] args)
    {
        int a = 100, b = 7;
        char oper = '/';
        switch(oper)
        {
            case '+':
                System.out.println(a+" + "+b+" = "+(a+b));
                break;
            case '-':
                System.out.println(a+" - "+b+" = "+(a-b));
                break;
            case '*':
                System.out.println(a+" * "+b+" = "+(a*b));
                break;
            case '/':
                System.out.println(a+" / "+b+" = "+(a/b));
                break;
            default:
                System.out.println("Unknow operator!");
                break;
        }
    }
}

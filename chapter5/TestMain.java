public class TestMain
{
    public static void main(String[] args)
    {
        // get input parameter's length
        int j=args.length;
        if(j!=2)
        {
            System.out.println("Number of input parameter is invalid!");
            // exit program
            System.exit(1);
        }
        for(int i=0;i<args.length;i++)
        {
            System.Out.println(args[i]);
        }
    }
}

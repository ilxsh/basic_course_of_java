// show how to use two demention array
public class TestJava4_6
{
    public static void main(String args[])
    {
        int i, j, sum=0;
        int num[][] = {{30, 35, 26, 32}, {33, 34, 30, 29}}; // declare and initial array
        for(i=0;i<num.length;i++)
        {
            System.out.print("Number "+(i+1)+" person's score is: ");
            for(j=0;j<num[i].length;j++)
            {
                System.out.print(num[i][j]+" ");
                sum += num[i][j];
            }
            System.out.println();
        }
        System.out.println("\n total score is: "+sum+" !");
    }
}

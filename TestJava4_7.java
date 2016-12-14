// Show how to use three demetion array.
public class TestJava4_7
{
    public static void main(String args[])
    {
        int i, j, k, sum = 0;
        int A[][][] = {{{5, 1}, {6, 7}}, {{9, 4}, {8, 3}}};
        // Three demesion need three variable to output
        for(i=0;i<A.length;i++)
        {
            for(j=0;j<A[i].length;j++)
            {
                for(k=0;k<A[i][j].length;k++)
                {
                    System.out.print("A["+i+"]["+j+"]["+k+"]=");
                    System.out.println(A[i][j][k]);
                    sum += A[i][j][k];
                }
            }
        }
        System.out.println("sum="+sum);
    }
}

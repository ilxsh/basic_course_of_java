// This program is to determine which is the max or min value
public class TestJava4_3
{
    public static void main(String[] args)
    {
        int i, min, max;
        int A[] = {74, 48, 30, 17, 62}; // declare integer array A
        min = max = A[0];
        System.out.print("array A include: ");
        for(i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
            if(A[i] > max) // find out which is the maximum value.
            {
                max = A[i];
            }
            if(A[i] < min) // find out which is the minmum value.
            {
                max = A[i];
            }
        }
        System.out.println("\n Max value of array is: "+max); // output max value
        System.out.println("\n Min value of array is: "+min); // output min value
    }
}

public class TestJava3_3
{
    public static void main(String[] args)
    {
        long long_max = java.lang.Long.MAX_VALUE; // get max value of long integer
        int int_max = java.lang.Integer.MAX_VALUE; // get max value of integer
//        short short_max = java.lang.Integer.MAX_VALUE; // get max value of integer
        short short_max = Short.MAX_VALUE; // get max value of short integer
        byte byte_max = Byte.MAX_VALUE; // get max value of byte integer
        System.out.println("Max value of LONG is: "+long_max);
        System.out.println("Max value of INT is: "+int_max);
        System.out.println("Max value of SHORT is: "+short_max);
        System.out.println("Max value of BYTE is: "+byte_max);
    }
}

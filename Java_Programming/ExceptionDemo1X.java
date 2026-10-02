import java.util.*;

class ExceptionDemo1X
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int no1=0 , no2=0, ans = 0;

        try
        {
            System.out.println("Enter first number : ");
            no1 = sobj.nextInt();

            System.out.println("Enter second number : ");
            no2 = sobj.nextInt();

            ans = no1 / no2;    // Exception prone code
        }    
        catch(ArithmeticException aobj)
        {
            System.out.println("Exception occurred : " + aobj);
        }  
        finally
        {
            System.out.println("Inside finally block");
        }          

        System.out.println("Division is : " + ans);
    }
}
import java.util.*;

class Selection3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int age = 0;

        System.out.println("Enter age : ");
        age = sobj.nextInt();

        if(age < 18)
        {
            System.out.println("Not Allowed");
        }
        else
        {
            System.out.println("Allowed");
        }

    }
}

import java.util.*;

class ExceptionDemo2{

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int arr[] = {11 , 21 , 51 , 101 , 111};
        int index = 0;

        System.out.println("Enter the index : ");
        index = sobj.nextInt();

        System.out.println("element is : " + arr[index]);

        System.out.println("End of main");
    }
}
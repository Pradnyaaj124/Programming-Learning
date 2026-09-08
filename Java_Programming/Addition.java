import java.util.Scanner;
class Addition
{
    public static void main(String A[])
    {
        int no1=0, no2=0, ans=0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First number : ");
        no1 = sobj.nextInt();

        System.out.println("Enter Second number : ");
        no2 = sobj.nextInt();

        ans = no1 + no2;

        System.out.println("Addition is : " + ans);

    }
}
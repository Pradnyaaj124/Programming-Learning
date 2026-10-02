import java.util.*;

class AgeInvalid extends Exception
{
    public AgeInvalid(String str)
    {
        super(str); 
    }
}

class ExceptionDemo4{

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = 0;
        age = sobj.nextInt();

        try{
            
        if(age < 18)
        {
            throw new AgeInvalid("You are under age");
        }
        else{
            System.out.println("Welcome!");
        }
        }catch(AgeInvalid aboj)
        {
            System.out.println("Exception occured due to age");
        }
        
    }
}
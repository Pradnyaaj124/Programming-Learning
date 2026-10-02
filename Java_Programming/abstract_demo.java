abstract class base
{
    public int i ,j;

    public int addition( int no1, int no2)
    {
        return no1 + no2;
    }

    abstract int subtraction(int no1 , int no2);


}

class derived extends base
{
    public int x;

    public int subtraction(int no1 , int no2)
        {
            return no1 - no2;
        }

    public int multiplication(int no1 , int no2)
        {
            return no1 * no2;
        }
        

}
class abstract_demo{
    public static void main(String A[]){

        derived dobj = new derived();

        int ret = 0;
        ret = dobj.addition(11,10);
        System.out.println("addition is :" + ret);

        ret = dobj.subtraction(11,10);
        System.out.println("subtraction is :" + ret);

        ret = dobj.multiplication(11,10);
        System.out.println("multiplication is :" + ret);

    }

}
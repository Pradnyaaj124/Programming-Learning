class Base
{
        int i , j;

        void fun()      // 1000
        {   System.out.print("Base fun\n"); }

        void gun()      // 2000
        {   System.out.print("Base gun\n"); }

        void sun()  // 3000
        {   System.out.print("Base sun\n"); }

        void run()   // 4000
        {   System.out.print("Base run\n"); }
}  

class Derived extends Base
{
        int x;

        void fun()      // 5000     
        {   System.out.print("Derived fun\n"); }

        void sun()      // 6000
        {   System.out.print("Derived sun\n"); }

        void mun()      // 7000 
        {   System.out.print("Derived mun\n"); }

        void bun()      // 8000
        {   System.out.print("Derived bun\n"); }
}  

class virtualDemo6
{
    public static void main(String A[])
    {
        Base  bp = new Derived();

        bp.fun();
        bp.gun();
        bp.sun();
        bp.run();
        // bp.mun();  // error
        // bp.bun();  // error
    } 
}

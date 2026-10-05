class Demo implements Runnable
{
    public void run()
    {
        System.out.println("Thread is running...");
    }
}

class ThreadDemo3
{

    public static void main(String A[])
    {

        System.out.println("Inside Main thread");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.start();      //ERROR
        dobj2.start();      //ERROR

    }
}
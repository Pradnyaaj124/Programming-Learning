class ThreadDemo1{

    public static void main(String A[]){

        System.out.println("Inside Main");

        Thread t = Thread.currentThread();

        System.out.println("Current thread name is : " + t.getName());

        System.out.println("Current thread TID is : " + t.getId());

        System.out.println("Thread is alive or not : " + t.isAlive());

        System.out.println("Thread Priority is : " + t.getPriority());

    }
}
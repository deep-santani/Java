public class Demo extends Thread {
    public void run() 
    {
        System.out.println("Thread Name : " + Thread.currentThread().getName());
        Thread.currentThread().setName("Demo_Thread");
        System.out.println("Thread Name : " + Thread.currentThread().getName());
    } 
}
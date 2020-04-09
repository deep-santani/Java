public class Demo 
{
    public static void main(String[] args) 
    {
        Thread t = new Thread();
        t.start();
        for (int i = 0; i < 10; i++) 
        {
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + " in control");
        }
     } 
}
public class Main 
{
    public static void main(String[] args) 
    {
        Demo demo = new Demo();
        System.out.println("Thread Demo Class Thread Name : "+Thread.currentThread().getName());
        demo.start();
    } 
}
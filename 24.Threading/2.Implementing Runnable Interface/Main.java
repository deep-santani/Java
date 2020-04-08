public class Main 
{
    public static void main(String[] args) 
    {
        Demo demo = new Demo();
        Thread thread = new Thread(demo);
        thread.start();
    } 
}
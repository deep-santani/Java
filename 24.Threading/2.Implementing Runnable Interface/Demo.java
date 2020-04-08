public class Demo implements Runnable
{
        @Override
        public void run() {
        System.out.println("Demo Class Thread Name : "+Thread.currentThread().getName());
    } 
}
class Demo extends Thread 
{
    public void run() 
    {
      for (int i = 1; i < 10; i++) 
        {
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        System.out.println(i);
        }
   }
 }
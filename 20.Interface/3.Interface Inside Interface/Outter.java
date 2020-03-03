interface Outter
{
    public void m1();

    interface Inner
    {
      public void m2();
    }
}
class Demo implements Outter
{
    public void m1()
    {
        System.out.println("M1 Called...");
    }
}
class MyDemo implements Outter.Inner
{
    public void m2()
    {
        System.out.println("M1 Called...");
    }
}
class Main
{
    public static void main(String[] args) 
    {
      Demo demo=new Demo();
      demo.m1();
      
      MyDemo mydemo=new MyDemo();
      mydemo.m2();
    }
}
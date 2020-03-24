import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    { 
      System.out.println("Main Called");
      m1();
      System.out.println("Post Main. called");
    }
    public static void m1()
    {
        m2();
        System.out.println("M1 Called");
    }
    public static void m2()
    {
        try
        {
            m3();
        }
        catch(Exception c)
        {
            System.out.println("Contant Administration");
        }
        System.out.println("M2 Called");
    }
    public static void m3()
    {
        m4();
        System.out.println("M3 Called");
    }
    public static void m4()
    {
        System.out.println("M4 Called");
        int c=10/0;
        System.out.println("Ans = "+c);
    }
}

import java.util.Scanner;
class Demo
{
    public static void main(String[] args)
    {
      int a;
      int b;
      int c=0;

      Scanner input=new Scanner(System.in);
      a=input.nextInt();
      b=input.nextInt();

      try
      {
          c=(a/b);
      }
      catch(Exception e)
      {
          System.out.println("Can't / By b");
      }
      System.out.println(c);
    }
}
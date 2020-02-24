class Demo2
{
  int i;
  public Demo2(int i)
  {
    i=i;  
    System.out.println("Sum is : "+i);
  }
  public Demo2(int i,int j)
  {
      i=i+j;
      System.out.println("Sum is : "+i);
  }
  public Demo2(int i,int j,int k)
  {
      i=i+j+k;
      System.out.println("Sum is : "+i);
  }
}
class Main
{
    public static void main(String[] args) 
    {
       Demo2 demo1=new Demo2(5);
       Demo2 demo2=new Demo2(5,6);
       Demo2 demo3=new Demo2(5,6,7);
    }
}
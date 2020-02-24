class Demo
{
  public int sum(int i)
  {
      return i;
  }
  public int sum(int i,int j)
  {
      return i+j;
  }
  public int sum(int i,int j,int k)
  {
      return i+j+k;
  }
}
class Main
{
    public static void main(String[] args) 
    {
       Demo demo1=new Demo();
       System.out.println("Sum is : "+demo1.sum(5));
       System.out.println("Sum is : "+demo1.sum(5,6));
       System.out.println("Sum is : "+demo1.sum(5,6,7)); 
    }
}
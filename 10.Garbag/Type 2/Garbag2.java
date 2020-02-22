class Garbag2
{
  public Garbag2()
  {
    System.out.println("My name is<<<<<<");
  }  
}
class A
{
    public static void main(String[] args)
    {
        Garbag2 Type1=new Garbag2();
        Garbag2 Type2;
        Type2=Type1;
    }
}

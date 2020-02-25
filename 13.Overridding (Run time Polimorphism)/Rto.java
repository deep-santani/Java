class Rto
{
  public void toStart()
  {
      System.out.println("Start by Kick...");
  }
}
class Rajdut extends Rto
{

}
class Scooter extends Rto
{
   public void toStart()
   {
      System.out.println("Start by Kick... +  Start by self");
   }
}
class Main
{
    public static void main(String[] args)
    {
        Rajdut Bike=new Rajdut();
        Bike.toStart();
        Scooter Activa=new Scooter();
        Activa.toStart();
    }
}


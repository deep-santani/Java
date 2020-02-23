class Car
{
    public static  void speedMinlimit()
    {
        System.out.println("Minimum Speed : 40 km/h");
    }
}
class Maruti extends Car
{
   public static void speedMaxlimit()
   {
       System.out.println("Maximum Speed : 200 Km/h");
   }
}
class Nexa extends Maruti
{
  public static void Design()
  {
      System.out.println("Design Type : Japanis");
  }
}
class Alto extends Maruti
{
  public static void Design()
  {
      System.out.println("Design Type : Indian");
  }
}
class Swift extends Maruti
{
  public static void Design()
  {
      System.out.println("Design Type : Chaines");
  }
}
class Main
{
    public static void main(String[] args) 
    {

        System.out.println("\nFor the Nexa all function available under");
        Nexa Type1=new Nexa();
        Type1.Design();
        Type1.speedMaxlimit();
        Type1.speedMinlimit();

        System.out.println("\nFor the Alto all function available under");
        Alto Type2=new Alto();
        Type2.Design();
        Type2.speedMaxlimit();
        Type2.speedMinlimit();

        System.out.println("\nFor the Swift all function available under");
        Swift Type3=new Swift();
        Type3.Design();
        Type3.speedMaxlimit();
        Type3.speedMinlimit();

    }
}
class Car
{
    public static  void speedMinlimit()
    {
        System.out.println("40 km/h");
    }
}
class Maruti extends Car
{
    public static void speedmaxlimit()
    {
        System.out.println("200 km/h");
    }
}
class Ertiga extends Maruti
{
    public static void Design()
    {
        System.out.println("Bengali");
    }
}
class Demo
{
    public static void main(String[] args)
    {
        Ertiga a1 = new Ertiga();
        a1.Design();
        a1.speedmaxlimit();
        a1.speedMinlimit();
    }
}

abstract class Popcorn
{
    public abstract void Flavour();
}
class Masalapopcorn extends Popcorn
{
    public void Flavour()
    {
        System.out.println("Masalapopcorn is Served");
    }
}
class Cheesepopcorn extends Popcorn
{
    public void Flavour()
    {
        System.out.println("Cheesepopcorn is Served");
    }
}
class Main
{
    public static void main(String[] args) 
    {
       new Masalapopcorn().Flavour();
       new Cheesepopcorn().Flavour();
    }
}
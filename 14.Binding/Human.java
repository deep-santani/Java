class Human
{
    public void walk()
    {
        System.out.println("human Walk");
    }
}
class Boy extends Human
{
    public void walk()
    {
        System.out.println("Boy Walk");
    }
}
class Main
{
    public static void main(String[] args)
    {
        Human humanboy=new Boy();
        humanboy.walk();
    }
}
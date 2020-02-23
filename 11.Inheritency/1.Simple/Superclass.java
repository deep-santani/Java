class Superclass
{
    public int a;
    public Superclass()
    {
        System.out.println("Constructure is called");
    }
    public void callme()
    {
        System.out.println("Call me is called");
    }
}
class Childclas extends Superclass
{
    public Childclas()
    {
        super();
        super.a=100;
        super.callme();
    }
}
class Main
{
    public static void main(String[] args)
    {
        Childclas child1 =new Childclas();
    }
}

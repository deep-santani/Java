class Outter
{
    interface Inner
    {
        public void m2();
    }
    class InnerDemo implements Inner
    {
        public void m2()
        {
            System.out.println("M2 Called...");
        }
    }
    public void m1()
    {
        System.out.println("M1 Called...");
        InnerDemo ooo=new InnerDemo();
        ooo.m2();
    } 
}
class Main
{
    public static void main(String[] args) 
    {
       //By First Way//

        Outter outter=new Outter();
        outter.m1();

        //By Second Way//

        Outter.InnerDemo oooo=outter.new InnerDemo();
        oooo.m2();

        //By Third Way//

        new Outter().new InnerDemo().m2();

    }
}

//You cannot be create object of ABSTRACT class so here we extends Demo Class//
//If exteds any ABSTRACT class then must be Impliment the unimplimented method of ABSTRACT class//


abstract class Demo
{
    public abstract void m1();
    public void m2()
    {
        System.out.println("M2 is called");
    }
}
class Test extends Demo
{
    public void m1()
    {
        System.out.println("M1 is Called");
    }
}
class Main
{
    public static void main(String[] args) 
    {
        Test Type1=new Test();
        Type1.m1();
        Type1.m2();
        //Also Call M1 as Under//

        new Test().m1();
    }
}
class Demo
{
    public static void main(String[] args) {
        m2();
        Demo demo=new Demo();
        demo.m1();   
    }
    public void m1()
    {
        System.out.println("M1 Called");
    }
    public static void m2()
    {
        System.out.println("M2 Called");
    }
}
class Test
{
    static int a=10;
    public static void main(String[] args) {
        
        Test test1=new Test();
        Test test2=new Test();

        Test.a=20;

        System.out.println("For Object 1: "+test1.a);
        System.out.println("For Object 2: "+test2.a);
    }
}
class Test
{
    static Test t=null;
    private Test()
    {
      System.out.println("My name is Deep");
    } 
    static Test getInstant()
    {
        if(t==null)
        {
            return new Test();
        }
        return t;
    }
}
class Main
{
    public static void main(String[] args)
    {
        Test.getInstant();
    }
}
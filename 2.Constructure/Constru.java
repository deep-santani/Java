class Constru
{
    int value1,value2;
    public Constru()
    {
        this.value1=0;
        this.value2=0;
        System.out.println(value1+value2);
    }
    public Constru(int param)
    {
        this.value1=param;
        this .value2=0;
        System.out.println(value1+value2);
    }
    public Constru(int param1,int param2)
    {
        this.value1=param1;
        this .value2=param2;
        System.out.println(value1+value2);
    }
}
class Main
{
    public static void main(String[] args)
    {
        Constru sun1=new Constru(10);
    }
}
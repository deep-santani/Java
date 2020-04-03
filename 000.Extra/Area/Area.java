class Area
{
	static int area(int i)
	{
		return i*i;
	}
	static int area(int i,int j)
	{
		return i*j;
	}
	static double area(int i)
	{
		return 3.14*i*i;
	}
 public static void main(String[] args)
   {
    System.out.println(area(2));
	System.out.println(area(2,3));
	System.out.println(area(4));
   }
}
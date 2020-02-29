/*
   m1(int... x)   VALID
   m1(int x...)   UNVALID
   m1(int ...x)   VALID

   int[] x        x is singaltun Array
   int[] []x,y    x,y both Multipal Array
   int [] x[]     X is multipal Array

   m1(int x,int... y)     VALID
   m1(int... x,int y)     UNVALID
   m1(int... x,int... y)  UNVALID
*/   

class Demo
{
    public static void main(String... args) {
        int x[]={10,20,30,40,50};
        m1(x);
    }
    public static void m1(int ...x)
    {
       System.out.println(x.length);
    }
}
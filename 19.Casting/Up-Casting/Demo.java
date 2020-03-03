
/*
   ****UP-CASTING****
   Compiler is Respociable for this
   When we assign small value into big palce
   We not lost any Value in Up Casting
*/
class Demo
{
    public static void main(String[] args) {
        
        int a=5;
        float b=a;
        System.out.println(b);
    }
}
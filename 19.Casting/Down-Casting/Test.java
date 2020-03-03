/*
  ****DOWN-CASTING****
  Developer is respociable for down casting
  When we assign big value into samll place
  We lost Actual Value in Down Casting
*/
class Test
{
 public static void main(String[] args) {
     
    double a=3.14;
    int b=(int)a;
    System.out.println(b);
 }
}
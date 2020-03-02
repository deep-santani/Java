public class Demo
{
    public static void main(String... args)
    {
        MyStudent myStudent = new MyStudent();
        if(myStudent instanceof MyStudent)
        {
         System.out.println("True");
        }
    }
}
class MyStudent
{

}
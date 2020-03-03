interface StudentDao
{
    public void n1();
    public void n2();
}
class StudentDaoImpl implements StudentDao
{
    public void n1()
    {
        System.out.println("N1 Called....");
    }
    public void n2()
    {
        System.out.println("N2 Called");
    }
}
class Main
{
    public static void main(String... args)
    {
        StudentDaoImpl student =new StudentDaoImpl();
        student.n1();
        student.n2();
    }
}

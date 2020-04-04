class Student
{
    private int enroll;
    private String name;
    private int marks[];
    private float total=0;
    private float precentage=0;


    public Student(int enroll,String name,int marks[])
    {
     this.enroll=enroll;
     this.name=name;
     this.marks=marks;
    }

    public float getSum()
    {
     for(int i: marks)
     {
         this.total=this.total+i;
     }
     return total;
    }

    public float getPercentage(float sum)
    {
      {
         precentage=(total/marks.length);
      }
     return precentage;
    }
}

class Dumdum
{
    public static void main(String[] args)
    {
        int marks[]={50,60,70,80};
        Student stud1=new Student(1,"Deep",marks);
        float sum=0;
        sum=stud1.getSum();
        float pre=0;
        pre=stud1.getPercentage(sum);
        System.out.println("Total"+ sum+"  percentage"+pre);
    }
} 
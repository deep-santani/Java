// I Make 3 Comment Which is an Error How to Reslove it.....?????

import java.util.*;
import java.lang.*;
import java.io.*;

 class Student
{
    int RollNo;
    String Name,Address;

    public Student(int RollNo,String Name,String Address)
    {
        this.RollNo=RollNo;
        this.Name=Name;
        this.Address=Address;
    }
    public String toString()
    {
        return this.RollNo+" "+this.Name+" "+this.Address;
    }
}
class SortByRoll implements Comparator<Student>
{
    public int compare(Student a,Student b)
    {
        return a.Name.compareTo(b.Name);
    }
}
class Main
{
    public static void main(String[] args) 
    {
        ArrayList<Student> ar=new ArrayList<Student>();
        ar.add(new Student(111,"Deep","Thordi(GIR)"));
        ar.add(new Student(222,"Priyank","Bhakha(GIR)"));
        ar.add(new Student(333,"Meet","Jamvala(GIR)"));

        System.out.println("Unsorted");

        for(int i=0; i<ar.size(); i++)
        {
            System.out.println(ar.get(i));

            Collections.sort(ar,new SortByRoll(RollNo));
            System.out.println("\n Sorted by RollNo");
        }
        for(int i=0; i<ar.size(); i++)
        {
            System.out.println(ar.get(i));
        }
        for(int i=0; i<ar.size(); i++)
        {
            //Collections.sort(ar,new ());
            System.out.println("\n Sorted by Name");
        }
        for(int i=0; i<ar.size(); i++)
        {
            System.out.println(ar.get(i));
        }
        for(int i=0; i<ar.size(); i++)
        {
            //Collections.sort(ar,new SortByAddress());
            System.out.println("\n Sorted by Address");
        }
        for(int i=0; i<ar.size(); i++)
        {
            System.out.println(ar.get(i));
        }
    }
}
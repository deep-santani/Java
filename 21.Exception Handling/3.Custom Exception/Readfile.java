import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.io.IOException;

public class Readfile
{
    public static void main(String[] args) 
    {
      try
      {
          FileReader rd=new FileReader(new File ("E:\\demo.txt"));
          int i;
          while((i=rd.read())!=0)
          {
            System.out.println((char)i);
          }
          FileWriter.fout=new FileWriter(new File ("D=\\demo.txt"));
          fout.Write("By By");
          fout.Close();
      } 
      catch(FileNotFoundException Exception e)
      {
          e.printStackTrac();
      }
      catch(IO Exception e)
      {
        e.printStackTrac();
      }
    }
} 



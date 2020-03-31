/*Error in this like  :::: 
    Note: ArraylistDemo.java uses or overrides a deprecated API.
    Note: Recompile with -Xlint:deprecation for details.
    Note: ArraylistDemo.java uses unchecked or unsafe operations.
    Note: Recompile with -Xlint:unchecked for details.

*/


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo
{
    public static void main(String args[])
    {
        int i;
        ArrayList list=new ArrayList();
        list.add(1);
        list.add(new Integer(2));
        list.add(new String("Deep"));
        list.add(new Float(3.14));
       // list.add(new MyStudent());

        System.out.println(list);

        for(i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        Iterator iter = list.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }

      /*  for(Object.Object:list)
        {
            System.out.println();
        }
     */
    }
}
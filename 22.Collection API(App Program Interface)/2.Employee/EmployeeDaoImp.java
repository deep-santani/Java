import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class EmployeeDaoImp implements EmployeeDao
{
    List<Employee> employeeList=new List<Employee>();

    public boolean Create(Employee employee)
    {
        employeeList.add(employee);
        return true;
    }
    public boolean Remove(int EmpId)
    {
        Iterator<Employee>iter=employeelist.iterator();

        while(iter.hasNext())
        {
            Employee employee=iter.Next();
            if(employee.getEmpId()==empId())
            {
                employeeList.Remove(employee);
                return true;
            }
            return false;
        }
    }
    public boolean Update(int EmpId,Employee employee)
    {
        {
         Employee employee=new Employee();
         return true;
        }
    }
    public Employee getEmployee(int EmpId);
    {
     {
         return employee;
     }   
     return null;
    }
    public List<Employee> getAllEmployee();
    {
        return <employeeList>;     //Error is here how to resolve it.......?????????
    }
}
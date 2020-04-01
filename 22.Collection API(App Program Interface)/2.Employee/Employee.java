public class Employee
{
    int EmpId;
    String FullName;
    String Address;
    Float Salary;
    String Department;

    public String toString()
    {
        return "Employee EmpId= "+ EmpId + "Employee Department= "+ Department;
    }
    public int getEmpId()
    {
        return EmpId;
    }
    public void setEmpId(int EmpId)
    {
        this.EmpId=EmpId;
    }
    public String getFullName()
    {
        return FullName;
    }
    public void setFullName(String  FullName)
    {
        this.FullName=FullName;
    }
    public String getAddress()
    {
        return Address;
    }
    public void setAddress(String Address)
    {
        this.Address=Address;
    }
    public Float getSalary()
    {
        return Salary;
    }
    public void setSalary(Float Salary)
    {
        this.Salary=Salary;
    }
    public String getDepartment()
    {
        return Department;
    }
    public void setDepartment(String Department)
    {
        this.Department=Department;
    }

}
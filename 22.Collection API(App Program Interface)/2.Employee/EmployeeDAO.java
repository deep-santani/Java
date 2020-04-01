import java.util.List;

public interface EmployeeDAO
{
    public boolean Create(Employee employee);
    public boolean Remove(int EmpId);
    public boolean Upadate(int EmpId,Employee employee);
    public Employee getEmployee(int EmpId);
    public List<Employee> getAllEmployee();
}
class Main
{
    public static void main(String[] args) 
    {
      EmployeeDaoImp employeedaoimp=new EmployeeDaoImp();
      
      while(true)
      {
          System.out.println("Enter Option: ");
          Scanner sc=new Scanner(System.in);
          int Option =sc.nextInt();
          Switch(Option);
          {
              case 1:
                        Employee employee=new Employee();

                        System.out.println("Enter EmpId :");
                        employee.setEmpId(sc.nextInt(1));
                        employee.setAddress(sc.nextLine("Thordi(GIR)"));
                        employee.setSallary(sc.nextFloat(2000.53));
                        employee.setFullName(sc.nextLine("SANTANI DIPKUMAR RAMJIBHAI"));
                        employee.setDepartment(sc.nextLine("IT"));
                        
                        EmployeeDaoImp.Create(employee);
                        System.out.println("Employee Saved.....");
                        break;
            
            case 2:
                        System.out.println(EmployeeDaoImp.getAllEmployee());
                        break;
                        
            default:
                        system.exit(0);
                        break;            
          }
      }
    }
}
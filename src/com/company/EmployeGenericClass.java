
import java.lang.String;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;

class Employee
{

    int id;
    String name;
   int salary;
   String department;
    public Employee(int id,String name,int salary,String department)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.department=department;
    }

        @Override
        public String toString()
    {
        return "{"+"name="+name+'\''+",id="+id+'\''+",salary="+salary+'\''+",department="+department+"}";
    }
}
public class EmployeGenericClass
{
    public static void main(String[] args)
    {
        Employee e1=new Employee(1,"sushma",10000,"a");
        Employee e2=new Employee(2,"Chinthala",100000,"b");
        Set<Employee> emp = new HashSet<>();
        emp.add(e1);
        emp.add(e2);
        System.out.println(emp);

    }
}

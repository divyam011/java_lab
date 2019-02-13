class Employees{
String employee_name;
int employee_id;
int year_of_experiance; 
}
class EmployeeDetails{
public static void main(String args[])
{
Employees e1 = new Employees();
Employees e2 = new Employees();
e1.employee_name = "abhi";
e1.employee_id = 123;
e1.year_of_experiance = 2;
e2.employee_name = "divyam";
e2.employee_id = 124;
e2.year_of_experiance = 4;
System.out.println("Details of Employees");
System.out.println("Employee name: "+ e1.employee_name);
System.out.println("Employee id: "+ e1.employee_id);
System.out.println("year of experiance: "+ e1.year_of_experiance);
System.out.println("Employee name: "+ e2.employee_name);
System.out.println("Employee id: "+ e2.employee_id);
System.out.println("year of experiance: "+ e2.year_of_experiance);



}
}
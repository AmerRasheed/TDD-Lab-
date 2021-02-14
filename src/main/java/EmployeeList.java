import java.util.Arrays;

public class EmployeeList {
    private static Employee[] EmployeeList = new Employee[0];

    public void addEmployee(int Id, String First_Name, String Last_Name, int Age, int Salary ) {
        Employee employeeToAdd = new Employee(First_Name,Last_Name,Age,Salary);
        EmployeeList  = Arrays.copyOf(EmployeeList, EmployeeList.length + 1 );
        EmployeeList[EmployeeList.length-1] = employeeToAdd;
    }

    //Check in test how many
    public int countEmployees (){
        return EmployeeList.length;
    }

    public void increaseSalaryInList (int percentage, String first_name){
        EmployeeList[] newarray = new EmployeeList[0];
        EmployeeList send = null;
        for (Employee name : EmployeeList ) {
            if (name.getFirst_name() == first_name)
                name.increaseSalary(percentage);
            System.out.println("New salary is "+ name.getSalary());
        }

    }
}

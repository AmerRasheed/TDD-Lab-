import java.util.ArrayList;
import java.util.Arrays;

    public class EmployeeList {
    ArrayList<Employee> employees = new ArrayList<>();
   /* public void showList(){
        for (Employee name : employees ) {
            System.out.println(name.getID());
            System.out.print(name.getFirst_name());
            System.out.print(name.getLast_name());
            System.out.print(name.getAge());
            System.out.print(name.getSalary());
            System.out.println();
            // System.out.println("New salary is "+ name.getSalary());
        }
    }*/
    public void addListEmployee() {
        Employee employee1 = new Employee("Amer","Rasheed", 33,30000);
        employees.add(employee1);
      /*  Employee employee2 = new Employee("Amer1","Rasheed1", 33,20000);
        employees.add(employee2);
        Employee employee3 = new Employee("Amer2","Rasheed1", 33,150000);
        employees.add(employee3);
*/
    }

    public int checkListSize() {
        return employees.size();
    }

    public void removeListEmployee(String FName) {
     // Employee employee1 = new Employee("Misbah","Iman", 33,30000);
        employees.remove(FName);
    }

    public int increaseSalary_Of_Specific_Employee_in_List (int percentage, String first_name){
        int send = 0;
        for (Employee name : employees ) {
            if (name.getFirst_name() == first_name)
                send = (int) name.increaseSalary(percentage);
            System.out.println("New salary is "+ name.getSalary());
        }
        System.out.println("List is "+employees);
        return send;
    }
    /*
    private static Employee[] EmployeeList = new Employee[0];
        int persize = EmployeeList.length;

    public int size(){
        return persize;
    }

    public void addEmployee() {
        Employee employeeToAdd = new Employee("Munish","Rajpal",34,3300);
        EmployeeList  = Arrays.copyOf(EmployeeList, EmployeeList.length + 1 );
        EmployeeList[EmployeeList.length-1] = employeeToAdd;
        persize++;
    }

   public Employee addEmployee(String First_Name, String Last_Name, int Age, int Salary ) {
        Employee employeeToAdd = new Employee(First_Name,Last_Name,Age,Salary);
        EmployeeList  = Arrays.copyOf(EmployeeList, EmployeeList.length + 1 );
        EmployeeList[EmployeeList.length-1] = employeeToAdd;
        persize++;
        return employeeToAdd;
    }

  public void remove(int id) {
        Boolean flag = false;
        persize=1;
        Employee[] toremovearr = new Employee[0];
        Employee[] before = new Employee[persize];
        Employee[] after = new Employee[persize];
        Employee[] after1 = Arrays.copyOf(after, after.length + 1);
        Employee[] combined = new Employee[persize - 1];
        int index = 0;
        int beforeind = 0;
        int afterind = 0;
        int combindex = 0;
        for (int i = 0; i < EmployeeList.length; i++) {      // Loop to find person (to be removed) index
          if (EmployeeList[i] == null)
              System.out.println("No element found in the array");
          else if (EmployeeList[i].getID() == id)
              index = i;
      }

      for (int i = 0; i < EmployeeList.length; i++) {     // Before and after are two arrays used to remove the person
          if (i < index) {                                //Combined is the final array
              before[i] = EmployeeList[i];
              beforeind++;
              combindex++;
          } else {
              if (i == 2) {
                  after1[i] = EmployeeList[i];

              } else
                  after1[i] = EmployeeList[i + 1];
              afterind++;
              combindex++;
          }
      }
      for (int i = 0; i < combindex - 1; i++) {
          if (i < beforeind)
              combined[i] = before[i];
          else {
              combined[i] = after1[i];
              flag = true;
          }
      }
      persize--;

  }
  public void increaseSalary_Of_Specific_Employee_in_List (int percentage, String first_name){
      EmployeeList[] newarray = new EmployeeList[0];
      EmployeeList send = null;
      for (Employee name : EmployeeList ) {
            if (name.getFirst_name() == first_name)
                name.increaseSalary(percentage);
            System.out.println("New salary is "+ name.getSalary());
      }
    }

     */
}

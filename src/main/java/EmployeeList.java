import java.util.Arrays;

public class EmployeeList {
    private static Employee[] EmployeeList = new Employee[0];
    int persize = EmployeeList.length;

    public int size(){
        return persize;
    }
    
  /*  public Employee addEmployee(String First_Name, String Last_Name, int Age, int Salary ) {
        Employee employeeToAdd = new Employee(First_Name,Last_Name,Age,Salary);
        EmployeeList  = Arrays.copyOf(EmployeeList, EmployeeList.length + 1 );
        EmployeeList[EmployeeList.length-1] = employeeToAdd;
        persize++;
        return employeeToAdd;
    }
    
    
   */

    public boolean remove(int employeeId) {

        Boolean flag = false;

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

                System.out.println("No element found in the People array");
            else if (EmployeeList[i].getID() == employeeId)
                index = i;
        }

        for (int i = 0; i < EmployeeList.length; i++) {     // Before and after are two arrays used to remove the person
            if (i < index) {                           //Combined is the final array
                before[i] = EmployeeList[i];
                beforeind++;
                combindex++;
            } else {
                if (i == 2) {
                    after1[i] = EmployeeList[i];

                } else
                    after1[i] = EmployeeList[i + 1];

                //System.out.println(after1[i].getFirstName());
                // System.out.println(persons[i].getFirstName());
                afterind++;
                combindex++;
            }
        }
        //Person[] combined1 = Arrays.copyOf(combined,combined.length+1);
        for (int i = 0; i < combindex - 1; i++) {
            if (i < beforeind)
                combined[i] = before[i];
            else {
                combined[i] = after1[i];
                flag = true;
            }
        }

        //for(int i=0;i<any.length;i++) //Todo-> Person-> fields
        //  System.out.println((any[i].getAssignee().getFirstName()));
        System.out.println("Persons left in the persons array after removing a person");
        for (int i = 0; i < persize - 1; i++) {
            System.out.print(combined[i].getID() + " ");
            System.out.println(combined[i].getFirst_name());
        }
        persize--;
        return flag;
    }
    public Employee[] showEmployees (){
        return EmployeeList;
    }
    //Check in test how many
    public int countEmployees (){
        return persize;
        //return EmployeeList.length;
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

    public void addEmployee() {
    }
}

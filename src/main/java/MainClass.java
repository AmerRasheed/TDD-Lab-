import java.util.*;

public class MainClass {

    public static void main(String[] args) {

       Employee employee1 = new Employee( "Amer", "Rasheed", 20, 40000);
       Employee employee2 = new Employee( "Habib", "Kaleem", 25, 45000);
       Employee employee3 = new Employee("Misbah ", "Fajjar", 19, 60000);

       System.out.println("Employee name is " + employee1.getFirst_name());


       EmployeeList personnel = new EmployeeList();
        int employeeCount = personnel.countEmployees();

        personnel.addEmployee(1,"Taha","Rana",34,40000);
        employeeCount = personnel.countEmployees();
        System.out.println("Employee count is "+ employeeCount);


                personnel.increaseSalaryInList(50,"Taha");







                //name.increaseSalary(50);

        System.out.println(employee1.getSalary());

        Employee staff[] = new Employee[5];

        staff[0] = employee1;
        staff[1] = employee2;
        staff[2] = employee3;
      /*
        for (int i = 0; i < staff.length; i++) {
            System.out.println(staff[i].ID);
            System.out.println(staff[i].getFirst_name());
            System.out.println(staff[i].getLast_name());
            System.out.println(staff[i].getAge());
            System.out.println(staff[i].getSalary());
        };*/
        System.out.println("Hello");

       //int increase = staff[0].increaseSalary(10);



    // int increment = personnel.increaseSalaryInList(10,employee1.getFirst_name());



        //int increaseSalaryInList = staff[0].increaseSalary(10);
        // increaseSalaryInList (1,10);

   //     employee2.createEmployeeList();

    }




}

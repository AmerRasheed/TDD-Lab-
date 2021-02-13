import java.util.*;

public class MainClass {

    public static void main(String[] args) {

        Employee employee1 = new Employee(incrementEmployeeId.nextEmployeeId(), "Amer", "Rasheed", 20, 40000);
        Employee employee2 = new Employee(incrementEmployeeId.nextEmployeeId(), "Habib", "Kaleem", 25, 45000);
        Employee employee3 = new Employee(incrementEmployeeId.nextEmployeeId(), "Misbah ", "Fajjar", 19, 60000);

        System.out.println("Employee name is " + employee1.getFirst_name());

        //    Employee staffArray[] = new Employee(3, "Amer","Rasheed",20,40000);

        Employee staff[] = new Employee[5];

        staff[0] = employee1;
        staff[1] = employee2;
        staff[2] = employee3;

        for (int i = 0; i < staff.length; i++) {
            System.out.println(staff[i].ID);
            System.out.println(staff[i].getFirst_name());
            System.out.println(staff[i].getLast_name());
            System.out.println(staff[i].getAge());
            System.out.println(staff[i].getSalary());
        }

 employee1.createEmployeeList();
        employee2.createEmployeeList();
    }

}

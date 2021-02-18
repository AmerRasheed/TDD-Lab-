//Each employee must have the following information:
//First name and last name. (String)
//Age. (int)
//A company ID that is unique to each employee. This number must be generated
//automatically when an employee is created in the system. (int)
//A monthly salary. (double / float)
//It must be possible to retrieve and set up all of the above information from an employee.

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
   // private Employee testObjectEmployee;
   @Test
   void testEmployeeFirst_Name() {
       Employee testObjectEmployee = new Employee("Usman", "Iftikhar", 22, 80000);
       String expected = "Usman";                // Test Code
       String actual = testObjectEmployee.getFirst_name(); // CUT
       Assertions.assertEquals(expected, actual);         // Assertions
   }
    @Test
    void testEmployeeLast_Name() {
    Employee testObjectEmployee = new Employee("Test First Name", "Test Last Name", 34, 20000);
        String expected = "Test Last Name";                // Test Code
        String actual = testObjectEmployee.getLast_name(); // CUT
        Assertions.assertEquals(expected, actual);         // Assertions
    }
    @Test
    void testEmployee_Age() {
        Employee testObjectEmployee = new Employee("Test First Name", "Test Last Name", 34, 20000);
        int expected = 34;                // Test Code
        int actual = testObjectEmployee.getAge(); // CUT
        Assertions.assertEquals(expected, actual);         // Assertions
    }
    @Test
    void testEmployee_Salary() {
        Employee testObjectEmployee = new Employee("Test First Name", "Test Last Name", 34, 20000);
        int expected = 20000;                // Test Code
        int actual = testObjectEmployee.getSalary(); // CUT
        Assertions.assertEquals(expected, actual);         // Assertions
    }

    // it will fail
    @Test
    void testEmployee_ID() {
        Employee testObjectEmployee = new Employee("Test First Name", "Test Last Name", 34, 20000);
        int expected = 1;                // Test Code
        int actual = testObjectEmployee.getID(); // CUT
        Assertions.assertEquals(expected, actual);         // Assertions
    }
    @Test
    void autoIncrementEmployeeId() {
        Employee testObjectEmployee = new Employee("Test First Name", "Test Last Name", 34, 20000);
       // testObjectEmployee.autoIncrementID();
  //  testObjectEmployee.autoIncrementID();

    }

    @Test
    void check_salary_increase(){
        Employee testObjectEmployee = new Employee("Test First Name", "Test Last Name", 34, 20000);
        int exptected = 30000;

        //boolean actual = testObjectEmployee.increaseSalary(10);

        int actual = testObjectEmployee.increaseSalary(50);
        Assertions.assertEquals(exptected,actual);
        //Assertions.assertTrue(testObjectEmployee.increaseSalary());
    }

    @Test
    void check_salary_increase_percentage_greater_than_100(){

        Employee testObjectEmployee = new Employee("Test First Name", "Test Last Name", 34, 20000);

        int exptected=testObjectEmployee.salary;

        int actual = testObjectEmployee.increaseSalary(110);

        Assertions.assertEquals(exptected,actual);

    }

    @Test
    void check_salary_increase_percentage_less_than_100(){

        Employee testObjectEmployee = new Employee("Test First Name", "Test Last Name", 34, 20000);

        int exptected=testObjectEmployee.salary;

        int percentage=50;

        exptected = exptected + testObjectEmployee.salary*percentage/100;

        int actual = testObjectEmployee.increaseSalary(percentage); // to CONFIRM

        Assertions.assertEquals(exptected,actual);
    }

}

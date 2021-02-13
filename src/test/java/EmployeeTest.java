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
       Employee testObjectEmployee = new Employee(1,"Test First Name", "Test Last Name", 34, 20000);
       String expected = "Test First Name";                // Test Code
       String actual = testObjectEmployee.getFirst_name(); // CUT
       Assertions.assertEquals(expected, actual);         // Assertions
   }
    @Test
    void testEmployeeLast_Name() {
    Employee testObjectEmployee = new Employee(1,"Test First Name", "Test Last Name", 34, 20000);
        String expected = "Test Last Name";                // Test Code
        String actual = testObjectEmployee.getLast_name(); // CUT
        Assertions.assertEquals(expected, actual);         // Assertions
    }
    @Test
    void testEmployee_Age() {
        Employee testObjectEmployee = new Employee(1,"Test First Name", "Test Last Name", 34, 20000);
        int expected = 34;                // Test Code
        int actual = testObjectEmployee.getAge(); // CUT
        Assertions.assertEquals(expected, actual);         // Assertions
    }
    @Test
    void testEmployee_Salary() {
        Employee testObjectEmployee = new Employee(1,"Test First Name", "Test Last Name", 34, 20000);
        int expected = 20000;                // Test Code
        int actual = testObjectEmployee.getSalary(); // CUT
        Assertions.assertEquals(expected, actual);         // Assertions
    }
    @Test
    void testEmployee_ID() {
        Employee testObjectEmployee = new Employee(1,"Test First Name", "Test Last Name", 34, 20000);
        int expected = 1;                // Test Code
        int actual = testObjectEmployee.getID(); // CUT
        Assertions.assertEquals(expected, actual);         // Assertions
    }
    @Test
    void autoIncrementEmployeeId() {
        Employee testObjectEmployee = new Employee(1,"Test First Name", "Test Last Name", 34, 20000);
     //   testObjectEmployee.autoIncrementID();


    }
}

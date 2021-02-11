//Each employee must have the following information:
//First name and last name. (String)
//Age. (int)
//A company ID that is unique to each employee. This number must be generated
//automatically when an employee is created in the system. (int)
//A monthly salary. (double / float)
//It must be possible to retrieve and set up all of the above information from an employee.

import org.junit.jupiter.api.Test;

public class EmployeeTest {
   // private Employee testObjectEmployee;
    @Test
    void testEmployee() {
    Employee testObjectEmployee = new Employee(1,"Test First Name", "Test Last Name", 34, 20000);

    }

    @Test
    void autoIncrementEmployeeId() {
        Employee testObjectEmployee = new Employee(1,"Test First Name", "Test Last Name", 34, 20000);
     //   testObjectEmployee.autoIncrementID();
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//A personnel system must be developed and be able to save classes of employees in a list.
//It must be possible to add and remove employees to the list in the personnel system.
public class EmployeeListTest {
    @Test
    void testEmployeeList() {
        Employee testObjectEmployeeList = new Employee(1,"Test First Name", "Test Last Name", 34, 20000);
    }
    @Test
    void test_Create_Employee_Function () {
        Employee testObjectEmployeeList = new Employee(1,"Test First Name", "Test Last Name", 34, 20000);
        testObjectEmployeeList.createEmployeeList();
    }

    @Test
    void test_to_check_Employee_Class() {
        Employee testObjectEmployeeList = new Employee(1,"Amer", "Rasheed", 34, 20000);
        Assertions.assertEquals(1,testObjectEmployeeList.getID());
        Assertions.assertEquals("Amer",testObjectEmployeeList.getFirst_name());
        Assertions.assertEquals("Rasheed",testObjectEmployeeList.getLast_name());
        Assertions.assertEquals(34, testObjectEmployeeList.getAge());
        Assertions.assertEquals(20000,testObjectEmployeeList.getSalary());
        }
}

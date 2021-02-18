import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//A personnel system must be developed and be able to save classes of employees in a list.
//It must be possible to add and remove employees to the list in the personnel system.

public class EmployeeListTest {
    @Test
    void testEmployeeList_Add_Employee() {
       EmployeeList testEmployeeObject = new EmployeeList();
       testEmployeeObject.addEmployee(); // Is that OK, if we call ADD procedure
       int expected=1;
       int actaul = testEmployeeObject.size();
       Assertions.assertEquals(expected,actaul);
       }

    @Test
    void testEmployeeList_Remove_Employee(){
       EmployeeList testEmployeeObject = new EmployeeList();
       //testEmployeeObject.removeEmployee();
       testEmployeeObject.remove(3);
       int expected=0;
       int actaul = testEmployeeObject.size();
       Assertions.assertEquals(expected,actaul);
       }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//A personnel system must be developed and be able to save classes of employees in a list.
//It must be possible to add and remove employees to the list in the personnel system.

public class EmployeeListTest {
    @Test
    void addListEmployee(){
        //Employee testEmployee = new Employee("a","b",33,30000);
        EmployeeList testEmp = new EmployeeList();
        testEmp.addListEmployee();
        int expected = 1;
        int actual = testEmp.checkListSize();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void checkEmpListSize(){
        EmployeeList testEmp = new EmployeeList();
        testEmp.checkListSize();
    }

    @Test
    void removelistEmployee(){
        EmployeeList testEmp = new EmployeeList();
        testEmp.removeListEmployee("Amer");
        int expected = 0;
        int actual = testEmp.checkListSize();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void increaseSalary_Of_Specific_Employee_in_List_function(){
        EmployeeList testEmp = new EmployeeList();
        //Employee employee1 = new Employee("Amer","Rasheed", 33,30000);
        testEmp.addListEmployee();
        int expected = 45000;
        int actual = testEmp.increaseSalary_Of_Specific_Employee_in_List(50,"Amer");
        Assertions.assertEquals(expected,actual);
    }
    /*
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
       testEmployeeObject.remove(1);
       int expected=1;
       int actaul = testEmployeeObject.size();
       Assertions.assertEquals(expected,actaul);
       }
*/
}


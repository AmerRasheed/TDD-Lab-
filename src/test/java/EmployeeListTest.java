import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//A personnel system must be developed and be able to save classes of employees in a list.
//It must be possible to add and remove employees to the list in the personnel system.
public class EmployeeListTest {
    @Test
    void testEmployeeList_Add_Employee() {
       EmployeeList testEmployeeObject = new EmployeeList();
       testEmployeeObject.addEmployee();
       int expected=1;
       int actaul = testEmployeeObject.size();
       Assertions.assertEquals(expected,actaul);
       /*
        Employee testObjectEmployeeList = new Employee("Test First Name", "Test Last Name", 34, 20000);
        EmployeeList employeeList = new EmployeeList();
        employeeList.addEmployee();

        int expected = 1;
        int actual = testObjectEmployeeList.getID();
        Assertions.assertEquals(expected,actual);
         */                   }
/*
    @Test
    void testEmployeeList_Add_Second_Record() {
        Employee testObjectEmployeeList = new Employee("Test First Name", "Test Last Name", 34, 20000);
        EmployeeList employeeList = new EmployeeList();
     //   employeeList.addEmployee("Habib","Jaalib",20,40000);
        int expected = 2;
        int actual = testObjectEmployeeList.getID();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void testEmployeeList_Add_Third_Record() {
        Employee testObjectEmployeeList = new Employee("Test First Name", "Test Last Name", 34, 20000);
        EmployeeList employeeList = new EmployeeList();
      //  employeeList.addEmployee("Habib","Jaalib",20,40000);
        int expected = 3;
        int actual = testObjectEmployeeList.getID();
        Assertions.assertEquals(expected,actual);
    }
  */
   /* @Test
    void test_Create_Employee_Function () {

        EmployeeList e;
        Employee testObjectEmployeeList = new Employee("Amer", "Rasheed", 34, 20000);
        //Employee expected = "Amer";

     /*   @Test
                void check_Added_Employee(){

        }
*/


        /*
        int expected=1;

         actual = e.createEmployeeList(testObjectEmployeeList.getID(),
                testObjectEmployeeList.getFirst_name(),
                testObjectEmployeeList.getLast_name(),
                testObjectEmployeeList.getAge(),
                testObjectEmployeeList.getSalary());

        Assertions.assertEquals(expected,actual);
*/

        //testObjectEmployeeList.createEmployeeList(1,"Amer","Rasheed",34, 20000);
/*
    @Test
    void test_to_check_Employee_Class() {
        Employee testObjectEmployeeList = new Employee("Amer", "Rasheed", 34, 20000);
        Assertions.assertEquals(1,testObjectEmployeeList.getID());
        Assertions.assertEquals("Amer",testObjectEmployeeList.getFirst_name());
        Assertions.assertEquals("Rasheed",testObjectEmployeeList.getLast_name());
        Assertions.assertEquals(34, testObjectEmployeeList.getAge());
        Assertions.assertEquals(20000,testObjectEmployeeList.getSalary());
        }
*/
}

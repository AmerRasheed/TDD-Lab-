import java.util.Arrays;

public class Employee {
    int ID;
    String first_name;
    String last_name;
    int Age;
    int salary;

    public Employee( String first_name, String last_name, int Age, int salary) {
        this.ID = autoIncrementID();
        this.first_name = first_name;
        this.last_name = last_name;
        this.Age = Age;
        this.salary = salary;
    }


    public int getID() {
        return ID;
    }
    //TODO should we need to set ID ??


    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static Employee[] employees = new Employee[0];
/*
    public void createEmployeeList() {
        //Employee employee = new Employee(incrementEmployeeId.nextEmployeeId(), getFirst_name(), getLast_name(), getAge(), getSalary());
        Employee employee = new Employee(autoIncrementID(ID), getFirst_name(), getLast_name(), getAge(), getSalary());

        employees = Arrays.copyOf(employees, employees.length + 1);
        employees[employees.length - 1] = employee;
    }
  */
    public int autoIncrementID() {
         return incrementEmployeeId.nextEmployeeId();
             }

    public void increaseSalary(int percentage){
         if(percentage<100)
        salary= salary + getSalary() * percentage/100 ;
            }


}



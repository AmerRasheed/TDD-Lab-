public class Employee {
    int ID;
    String first_name;
    String last_name;
    int Age;
    int salary;

   public Employee(int ID,String first_name, String last_name, int Age, int salary){
    this.ID=ID;
    this.first_name=first_name;
    this.last_name=last_name;
    this.Age=Age;
    this.salary=salary;
    }

    public int getID() {
        return ID;
    }
    //TODO should we need to set ID ??
    public void setID(int ID) {
        this.ID = ID;
    }

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
}


 /*   public Employee(int ID,
                    String first_name,
                    String last_name,
                     int Age,
                    int salary
    )

    {
    }*/


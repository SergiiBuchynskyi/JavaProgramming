package day39_Recap.Person;

public class Employee extends Person {

    public Employee(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    private int employeeID;
    private String jobTitle;
    private double salary;

    public int getEmployeeID() {
        return employeeID;
    }

    public Employee setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
        return this;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public Employee setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }


    public void work(){
        System.out.println(getName() + " is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                "age=" + getAge() +
                "gender=" + getGender() +
                "employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

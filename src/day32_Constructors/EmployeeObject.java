package day32_Constructors;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Aaron");
        System.out.println(employee1);
        Employee employee2 = new Employee("John", 'M', "SDET");
        System.out.println(employee2);
        Employee employee3 = new Employee("123", 'M', "321", 123);
        System.out.println(employee3);


    }
}

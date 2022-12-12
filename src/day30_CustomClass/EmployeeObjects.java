package day30_CustomClass;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();


        employee1.setInfo("John", 'M', 25, 543, "Developer", 100000, true);
        employee1.setInfo("Anna", 'F', 28, 874, "QA", 45000, false);
        employee1.setInfo("David", 'M', 35, 457, "QA", 45000, false);
        employee1.setInfo("Lina", 'F', 75, 327, "Manager", 80000, true);
        employee1.setInfo("Kevin", 'M', 24, 278, "Senior QA", 110000, true);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        int countFullTime = 0;
        int partFullTime = 0;
        double max = employees[0].salary;


        for (Employee employee : employees) {
            if (employee.isFullTime) {
                countFullTime++;
            } else {
                countFullTime++;
            }
            if (employee.salary>max){
                max = employee.salary;
            }
        }


    }
}

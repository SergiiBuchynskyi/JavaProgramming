package day39_Recap.Person;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer = new Developer("Kork", 44, 'M', 421, "SDET", 86000);
        Tester tester = new Tester("Olga", 27, 'F', 2, "Dev", 155000);
        Student student = new Student("Nik", 33, 'M');
        Teacher teacher = new Teacher("Anna", 43, 'F', 42, "Computer Science", 78000);

        developer.work();
        teacher.work();
        student.sleep();
        tester.work();


    }

}

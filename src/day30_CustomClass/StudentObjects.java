package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Aygun", 'F', 2057, 39, 'A');
        Student student2 = new Student();
        student2.setInfo("Hulya", 'F', 2034, 26, 'B');
        Student student3 = new Student();
        student3.setInfo("Elminur", 'F', 2058, 29, 'A');
        Student student4 = new Student();
        student4.setInfo("Ali", 'M', 2096, 28, 'A');
        Student student5 = new Student();
        student5.setInfo("Mert", 'M', 2048, 30, 'C');

        Student[]students = {student1,student2,student3,student4,student5};

        for (Student student : students) {
            System.out.println(student);
        }


        ArrayList<Student>earlyBirds = new ArrayList<>();
        ArrayList<Student>angryBirds = new ArrayList<>();

        for (Student student : students) {
            if (student.grade == 'A'){
                earlyBirds.add(student);
            }else {
                angryBirds.add(student);
            }
        }
        System.out.println(earlyBirds);
        System.out.println(angryBirds);

    }

}

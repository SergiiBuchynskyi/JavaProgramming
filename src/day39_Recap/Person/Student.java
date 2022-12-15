package day39_Recap.Person;

public class Student extends Person{

    public Student(String name, int age, char gender) {
        super(name, age, gender);
    }

    private int studentID;
    private String fieldOfStudy;

    public int getStudentID() {
        return studentID;
    }

    public Student setStudentID(int studentID) {
        this.studentID = studentID;
        return this;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public Student setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
        return this;
    }

    public void study(){
        System.out.println(getName() + " is studding");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + getName() +
                "age=" + getAge() +
                "gender=" + getGender() +
                "studentID=" + studentID +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}

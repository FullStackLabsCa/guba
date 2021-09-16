package school;

public class Student {

    int studentID;
    String name;
    int age;
    GradeType grade;

    public Student() {
    }

    public Student(int studentID, String name, int age, GradeType grade) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GradeType getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }
}

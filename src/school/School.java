package school;

public interface School {

     Student admitStudent(Student student) throws ClassFullException;
     Double chargeFees(Student student);
}

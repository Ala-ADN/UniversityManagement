package People;
import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupName;
    private List<Student> students;

    public Group(String groupName) {
        this.groupName = groupName;
        this.students = new ArrayList<>();
    }
    public String getName() {
        return groupName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    public void displayStudents() {
        System.out.println("Group "+groupName+" students are: ");
        for (Person P : students) {
            System.out.println(P.name);
        }
    } 
}
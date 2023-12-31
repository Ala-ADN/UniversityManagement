package People;
import java.util.ArrayList;
import java.util.List;

import Curriculum.Subject;
public class Teacher extends Person {
    int teacherId;
    List<Subject> subjects;

    public Teacher(String name, int age, int teacherId) {
        super(name, age);
        this.teacherId = teacherId;
        this.subjects = new ArrayList<>();
    }

    public void assignSubject(Subject subject) {
        subjects.add(subject);
    }
}
package People;
import java.util.ArrayList;
import java.util.List;

import Curriculum.Course;
import ExtraCurricular.Club;
import ExtraCurricular.Event;

public class Student extends Person {
    private int studentId;
    private List<Course> courses;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
    }
    public void participateInEvent(Event E) {
        E.addParticipant(this);
    }
    public void joinClub(Club C) {
        C.addMember(this);
    }
    public int getId() {
        return studentId;
    }
    public void courseDisplay() {
        System.out.println("Student "+name+" enrolled in: ");
        for (Course C : courses) {
            System.out.println(C.getName());
        }
    }
}
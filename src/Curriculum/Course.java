package Curriculum;
import java.util.ArrayList;
import java.util.List;

import People.Classroom;
import People.Group;
import People.Teacher;

public class Course {
    private String name;
    private List<Subject> subjects;
    private Teacher teacher;
    private Classroom classroom;
    private Group group;

    public Course(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public Group getGroup() {
        return group;
    }

    public void courseDetails() {
        System.out.println("Course code: " + name);
        System.out.println("Subjects: ");
        for (Subject S : subjects) {
            System.out.println(S.getSubjectName());
        }
        System.out.println("Teacher: " + teacher.getName());
        System.out.println("Classroom: " + classroom.getRoom());
        System.out.println("Group: " + group.getName());
    }
}

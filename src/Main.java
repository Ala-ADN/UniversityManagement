import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Curriculum.*;
import ExtraCurricular.*;
import People.*;

public class Main {
    public static void main(String[] args) {
        // Initiate some students
        Student student0 = new Student("Ala Zawali", 20, 100);
        Student student1 = new Student("Scarlet Johnson", 20, 101);
        Student student2 = new Student("Oliver Biscuit", 19, 102);
        // Initiate some teachers
        Teacher ElectroTeacher = new Teacher("Kaabi", 80, 1);
        Teacher historyTeacher = new Teacher("Abderrahmen", 23, 2);
        // Initiate some subjects
        Subject Electro = new Subject("ELC", "Electrostatics");
        ElectroTeacher.assignSubject(Electro);
        Subject history = new Subject("HIS", "History");
        historyTeacher.assignSubject(history);

        // Initiate some courses
        Course ElectroCourse = new Course("ELC");
        ElectroCourse.addSubject(Electro);
        ElectroCourse.setTeacher(ElectroTeacher);
        Course historyCourse = new Course("HIS");
        historyCourse.addSubject(history);
        historyCourse.setTeacher(historyTeacher);
        // Enroll students in courses
        student0.enrollCourse(ElectroCourse);
        student0.enrollCourse(historyCourse);
        student2.enrollCourse(ElectroCourse);
        student0.courseDisplay();
        System.out.println("-------------------------------");
        student2.courseDisplay();
        System.out.println("-------------------------------");
        // Initiate some groups
        Group ElectroGroup = new Group("Electro Group");
        ElectroGroup.addStudent(student0);
        ElectroGroup.addStudent(student1);
        ElectroGroup.addStudent(student2);
        Group historyGroup = new Group("History Group");
        historyGroup.addStudent(student2);
        ElectroGroup.displayStudents();
        System.out.println("-------------------------------");
        historyGroup.displayStudents();
        System.out.println("-------------------------------");
        
        // Initiate a club
        Club ElectroClub = new Club("Electro Lovers Club");
        ElectroClub.addMember(student0);
        ElectroClub.addMember(student1);
        ElectroClub.addMember(ElectroTeacher);
        // Initiate an event
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date eventDate;
        try {
            eventDate = dateFormat.parse("21-09-2021");
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }
        Event ElectroEvent = new Event("Electro Event", eventDate, 5, ElectroClub);
        ElectroEvent.addParticipant(student0);
        ElectroEvent.addParticipant(student2);
        System.out.println("-------------------------------");
        ElectroEvent.displayParticipants();
    }    
}
    
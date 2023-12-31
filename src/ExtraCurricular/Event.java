package ExtraCurricular;
import java.util.Date;
import java.util.List;

import People.Person;

import java.util.ArrayList;

public class Event {
    private String eventName;
    private Date eventDate;
    private List<Person> participants;
    private Club organizer;
    private double participationFee;

    public Event(String eventName, Date eventDate,double fees,Club organizer) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.participants = new ArrayList<>();
        participationFee=fees;
        this.organizer=organizer;
    }

    public void addParticipant(Person person) {
        System.out.println(person.getName()+" wants to participate in event: "+eventName);
        participants.add(person);
        feesManager(person);
    }
    public void feesManager(Person P) {
        if (organizer.isMember(P)) {
            System.out.println("Since you're a member you only have to pay "+participationFee*0.8+" Dinars");
        } else {
            System.out.println("Participation fees are "+ participationFee);
        }
    }
    public void setParticipationFee(double participationFee) {
        this.participationFee = participationFee;
    }
    public Date getDate() {
        return eventDate;
    }
    public void displayParticipants() {
        System.out.println("Event "+eventName+"by club "+organizer.getName()+" Participants are: ");
        for (Person P : participants) {
            System.out.println(P.getName());
        }
    } 
}
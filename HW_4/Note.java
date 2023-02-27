package HW_4;

import java.sql.Date;
import java.sql.Time;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Note {

    private String id = "";
    private String head;
    private Date dayOfEntry;
    private Time timeOfEntry;
    private Time deadline;
    private String authorsFIO;
    
    public Note(String head, Date dayOfEntry, Time timeOfEntry, Time deadline, String authorsFIO) {
        this("", head, dayOfEntry, timeOfEntry, deadline, authorsFIO);
    }

    public Note(String id, String head, Date dayOfEntry, Time timeOfEntry, Time deadline, String authorsFIO) {
        this.id = id;
        this.head = head;
        this.dayOfEntry = dayOfEntry;
        this. timeOfEntry =  timeOfEntry;
        this.deadline = deadline;
        this.authorsFIO = authorsFIO;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public Date getDayOfEntry() {
        return dayOfEntry;
    }

    public void setDayOfEntry(Date dayOfEntry) {
        this.dayOfEntry = dayOfEntry;
    }

    public Time getTimeOfEntry() {
        return timeOfEntry;
    }

    public void setTimeOfEntry(Time timeOfEntry) {
        this.timeOfEntry = timeOfEntry;
    }

    public Time getDeadline() {
        return deadline;
    }

    public void setDeadline(Time deadline) {
        this.deadline = deadline;
    }

    public String getAuthorsFIO() {
        return authorsFIO;
    }

    public void setAuthorsFIO(String authorsFIO) {
        this.authorsFIO = authorsFIO;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", head='" + head + '\'' +
                ", dayOfEntry='" + dayOfEntry + '\'' +
                ", timeOfEntry='" + timeOfEntry + '\'' +
                ", deadline='" + deadline + '\'' +
                ", authorsFIO='" + authorsFIO;
    }
}
package People;

public class Classroom {
    private String roomNumber;
    private int size;
    public Classroom(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    public int getSize() {
        return size;
    }
    public String getRoom() {
        return roomNumber;
    }
}
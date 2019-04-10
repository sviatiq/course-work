package domain;

public class Runway {

    private String wayName; //europe runway, america rumway, asia runway etc.
    private int wayNumber; //first, second, third etc

    public Runway() {
    }

    public Runway(String wayName, int wayNumber) {
        this.wayName = wayName;
        this.wayNumber = wayNumber;
    }

    public String getWayName() {
        return wayName;
    }

    public void setWayName(String wayName) {
        this.wayName = wayName;
    }

    public int getWayNumber() {
        return wayNumber;
    }

    public void setWayNumber(int wayNumber) {
        this.wayNumber = wayNumber;
    }
}

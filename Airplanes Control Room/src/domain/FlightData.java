package domain;

public class FlightData {

    private int numOfFlight;
    private String direction;
    private double timeOfFlight;
    private int numOfPassenger;

    public FlightData(int numOfFlight, String direction, double timeOfFlight) {
        this.numOfFlight = numOfFlight;
        this.direction = direction;
        this.timeOfFlight = timeOfFlight;
    }

    public int getNumOfPassenger() {
        return numOfPassenger;
    }

    public void setNumOfPassenger(int numOfPassenger) {
        this.numOfPassenger = numOfPassenger;
    }

    public int getNumOfFlight() {
        return numOfFlight;
    }

    public void setNumOfFlight(int numOfFlight) {
        this.numOfFlight = numOfFlight;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public double getTimeOfFlight() {
        return timeOfFlight;
    }

    public void setTimeOfFlight(double timeOfFlight) {
        this.timeOfFlight = timeOfFlight;
    }
}

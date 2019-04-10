package domain;

public class Hangar{
    private int num; //first hangar, second hangar, etc
    private String name; // Hangar with europe airplanes, hangar with america airplanes
    //TODO: what if we set to the flight to EUROPE american vehicle???? Refactor!

    public Hangar() {
    }

    public Hangar(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

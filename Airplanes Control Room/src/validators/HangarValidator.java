package validators;

import domain.FlightPermit;
import domain.HangarAnswer;

public class HangarValidator {

    public HangarAnswer checkHangar(FlightPermit flightPermit){
        System.out.println("Hangar is checking!");
        return new HangarAnswer();
    }
}

package validators;

import domain.FlightPermit;
import domain.RunwayAnswer;

public class EngineersValidator {

    public RunwayAnswer checkEngineers(FlightPermit flightPermit){
        System.out.println("Engineers is checking!");
        return new RunwayAnswer();
    }
}

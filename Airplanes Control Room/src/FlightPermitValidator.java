import domain.FlightPermit;
import response.ControlRoomResponse;
import validators.HangarValidator;
import validators.EngineersValidator;

import java.util.LinkedList;
import java.util.List;

public class FlightPermitValidator {

    private HangarValidator hangarValidator;
    private EngineersValidator engineersValidator;
    private ControlRoomResponse controlRoomResponse;

    public FlightPermitValidator() {
        hangarValidator = new HangarValidator();
        engineersValidator = new EngineersValidator();
        controlRoomResponse = new ControlRoomResponse();
    }

    public static void main(String[] args) {
        FlightPermitValidator fpv = new FlightPermitValidator();
        fpv.checkAll();
    }

    private void checkAll() {
        List<FlightPermit> flightPermitList = readFlightPermit();
        for(FlightPermit fp: flightPermitList){
            checkOnePermit(fp);
        }
    }

    private List<FlightPermit> readFlightPermit() {
        List<FlightPermit> flightPermitList = new LinkedList<>();

        for(int i = 0; i<5; i++){
            FlightPermit flightPermit = SaveFlightPermit.buildFlightPermit(i);
        }
        return flightPermitList;
    }
    private void checkOnePermit(FlightPermit fp) {

    }

}
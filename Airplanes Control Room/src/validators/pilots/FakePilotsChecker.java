package validators.pilots;

import domain.Airplane;
import domain.Vehicle;
import domain.pilots.PilotsResponse;
import exceptions.PilotsException;
import exceptions.TransportPermitException;

public class FakePilotsChecker implements PilotsChecker {

    private static final int TRUE_NUM1 = 150;
    private static final int TRUE_NUM2 = 200;
    private static final int FALSE_NUM1 = 150;
    private static final int FALSE_NUM2 = 200;
    @Override
    public PilotsResponse checkVehicle(Vehicle vehicle) throws PilotsException, TransportPermitException {

        PilotsResponse pilotsResponse = new PilotsResponse();

        if(vehicle instanceof Airplane){
        Airplane airplane= (Airplane)vehicle;
        String num = airplane.getNumOfPlaces();
        if(num.equals(TRUE_NUM1) || num.equals(TRUE_NUM2)){
            pilotsResponse.setTemporal(true);
            pilotsResponse.setExist(false);
            }
        if(num.equals(FALSE_NUM1) || num.equals(FALSE_NUM2)){
            pilotsResponse.setExist(false);
        }
        if
        }


        return null;
    }
}

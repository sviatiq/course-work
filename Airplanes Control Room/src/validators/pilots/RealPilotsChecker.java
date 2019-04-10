package validators.pilots;

import domain.Vehicle;
import domain.pilots.PilotsResponse;
import exceptions.PilotsException;
import exceptions.TransportPermitException;

public class RealPilotsChecker implements  PilotsChecker {
    @Override
    public PilotsResponse checkVehicle(Vehicle vehicle) throws PilotsException, TransportPermitException {
        return null;
    }
}

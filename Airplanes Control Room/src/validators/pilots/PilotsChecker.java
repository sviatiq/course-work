package validators.pilots;

import domain.Vehicle;
import domain.pilots.PilotsResponse;
import exceptions.PilotsException;
import exceptions.TransportPermitException;

public interface PilotsChecker {

    public PilotsResponse checkVehicle(Vehicle vehicle) throws PilotsException, TransportPermitException;
}

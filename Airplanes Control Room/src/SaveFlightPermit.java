import domain.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class SaveFlightPermit {

    public static void main(String[] args) {
        FlightPermit fp = buildFlightPermit(10);

    }
    static int saveFlightPermit(FlightPermit flightPermit){
        int answer = 256;
        System.out.println("Sava flight permit: ");
        return answer;
    }

        public static FlightPermit buildFlightPermit(int id) {
        FlightPermit fp = new FlightPermit();
        fp.setFlightPermitId(id);
        fp.setFlightNumber(""+000+id);
        fp.setFlightPermitDate(LocalDateTime.now());
            Runway runway1 = new Runway("American Line", 1);
            fp.setRunwayLine(runway1);
            FlightData flightData = new FlightData(1221,"Kyiv-New York", 10.29);


        //Airplane
            Airplane airplane1 = new Airplane("Boeing",
                    737 - 800, 39.47,
                    3.76, 189,
                    LocalDate.of(2001, 4, 20));
            airplane1.setAutomaticAvionicExisting("YES");
            airplane1.setNumOfEngines(3);
            airplane1.setTakeOffLength(2408);

            Airplane airplane2 = new Airplane("Boeing",
                    737 - 700, 33.63,
                    3.76, 148,
                    LocalDate.of(1999, 7, 13));
            airplane2.setAutomaticAvionicExisting("YES");
            airplane2.setNumOfEngines(5);
            airplane2.setTakeOffLength(1677);

            //Helicopter
            Helicopter helicopter1 = new Helicopter("MI", 17,  22, 12, 15, LocalDate.of(1996, 2, 5) );
            helicopter1.setNumOfScrew(2);
            helicopter1.setLoadCapacity(20);
            helicopter1.setScrewPower(2000);
            Helicopter helicopter2 = new Helicopter("MI", 8,  26, 15, 7, LocalDate.of(1992, 7, 6) );
            helicopter2.setNumOfScrew(2);
            helicopter2.setLoadCapacity(12);
            helicopter2.setScrewPower(1650);


            fp.setPassengerAirplane(airplane1);
            fp.setCargoAirplane(airplane2);
            fp.addHelicopters(helicopter1);
            fp.addHelicopters(helicopter2);


            return fp;
    }

}

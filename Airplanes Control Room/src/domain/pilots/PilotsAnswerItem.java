package domain.pilots;

import domain.Vehicle;

public class PilotsAnswerItem {

    public enum PilotsStatus{
        READY, BUSY,TROUBLE
    }

    public static class PilotsTrouble {
        private String code;
        private String text;

        public PilotsTrouble(String code, String text) {
            this.code = code;
            this.text = text;
        }

        public String getCode() {
            return code;
        }

        public String getText() {
            return text;
        }
    }
        private PilotsStatus status;
        private Vehicle vehicle;
        private PilotsTrouble trouble;

    public PilotsAnswerItem(PilotsStatus status, Vehicle vehicle) {
        this.status = status;
        this.vehicle = vehicle;
    }

    public PilotsAnswerItem(PilotsStatus status, Vehicle vehicle, PilotsTrouble trouble) {
        this.status = status;
        this.vehicle = vehicle;
        this.trouble = trouble;
    }

    public PilotsStatus getStatus() {
        return status;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public PilotsTrouble getTrouble() {
        return trouble;
    }
}

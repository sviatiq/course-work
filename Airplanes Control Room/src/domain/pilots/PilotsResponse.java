package domain.pilots;

public class PilotsResponse {
    private boolean exist;
    private Boolean temporal;

    public boolean isExist(){
        return exist;
    }
    public void setExist(boolean exist){
        this.exist = exist;
    }

    public Boolean getTemporal() {
        return temporal;
    }

    public void setTemporal(Boolean temporal) {
        this.temporal = temporal;
    }

    @Override
    public String toString() {
        return "PilotsResponse{" +
                "exist=" + exist +
                ", temporal=" + temporal +
                '}';
    }
}

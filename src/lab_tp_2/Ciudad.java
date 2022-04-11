package lab_tp_2;

public class Ciudad {

    private String nombreC;
    private String ruta;
    private double km;

    public Ciudad(String nombreC, String ruta, double km) {
        this.nombreC = nombreC;
        this.ruta = ruta;
        this.km = km;
    }


    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
}

package lab_tp_2;

public class Combustible {

    private String tipoC;
    private double precioC;

    public Combustible(String tipoC, double precioC) {
        this.tipoC = tipoC;
        this.precioC = precioC;
    }

    public String getTipoC() {
        return this.tipoC;
    }

    public void setTipoC(String tipoC) {
        this.tipoC = tipoC;
    }

    public double getPrecioC() {
        return this.precioC;
    }

    public void setPrecioC(double precioC) {
        this.precioC = precioC;
    }


}

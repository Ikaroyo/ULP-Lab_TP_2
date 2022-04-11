package lab_tp_2;

public abstract class Vehiculo {

    private String marca;
    private String patente;
    private Combustible combustible;


    public Vehiculo(String marca, String patente, Combustible combustible) {
        this.marca = marca;
        this.patente = patente;
        this.combustible = combustible;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return this.patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Combustible getCombustible() {
        return this.combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public abstract double calcularCostoCombustible();

}

package lab_tp_2;

public class Camioneta extends Vehiculo {

    public Camioneta(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }


    @Override
    public double calcularCostoCombustible() {
        return this.getCombustible().getPrecioC() * 10 / 100;
    }

}   


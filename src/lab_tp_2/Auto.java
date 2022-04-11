package lab_tp_2;

public class Auto extends Vehiculo {

    public Auto(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }


    @Override
    public double calcularCostoCombustible() {
        return this.getCombustible().getPrecioC() * 7 / 100;
    }

}



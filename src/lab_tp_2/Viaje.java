package lab_tp_2;

public class Viaje {

    private Ciudad cOrigen;
    private Ciudad cDestino;
    private double distancia;
    private int cantPeajes;
    Vehiculo vehiculo;
    private String tipoCombustible;

    public Viaje(Ciudad cOrigen, Ciudad cDestino, String tipoCombustible, Vehiculo vehiculo, int cantPeajes, double distancia) {
        this.cOrigen = cOrigen;
        this.cDestino = cDestino;
        this.distancia = distancia;
        this.cantPeajes = cantPeajes;
        this.vehiculo = vehiculo;
        this.tipoCombustible = tipoCombustible;
    }


    public Viaje(Ciudad cOrigen, Ciudad cDestino, String tipoCombustible, Vehiculo vehiculo, int cantPeajes) {
        this.cOrigen = cOrigen;
        this.cDestino = cDestino;
        this.cantPeajes = cantPeajes;
        this.vehiculo = vehiculo;
        this.distancia = distanciaIdemKM(cOrigen, cDestino);
    }


    public Ciudad getcOrigen() {
        return cOrigen;
    }

    public void setcOrigen(Ciudad cOrigen) {
        this.cOrigen = cOrigen;
    }

    public Ciudad getcDestino() {
        return cDestino;
    }

    public void setcDestino(Ciudad cDestino) {
        this.cDestino = cDestino;
    }

    public double getDistancia(Ciudad cOrigen, Ciudad cDestino) {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getCantPeajes() {
        return cantPeajes;
    }

    public void setCantPeajes(int cantPeajes) {
        this.cantPeajes = cantPeajes;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public double distanciaIdemKM(Ciudad cOrigen, Ciudad cDestino) {
        return Math.abs(cOrigen.getKm() - cDestino.getKm());
    }

    public double costoEnPeajes() {
        double costo;
        if (vehiculo instanceof Camion) {
            costo = 200;
        } else {
            costo = 100;
        }
        return costo * this.cantPeajes;
    }

    public double costoEnCombustibles() {
        return (this.vehiculo.calcularCostoCombustible() * this.distancia);
    }

    public double costoTotal() {
        return (this.costoEnPeajes() + this.costoEnCombustibles());
    }


}

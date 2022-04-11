package lab_tp_2;

public class TestCostoTotalViaje {


    public static void main(String[] args) {

        // Ejemplo con 3 ciudades 2 en la misma ruta y una que no
        Ciudad c1 = new Ciudad("Villa Mercedes", "9", 900);
        Ciudad c2 = new Ciudad("San Luis", "9", 800);
        Ciudad c3 = new Ciudad("San Juan", "10", 700);

        // Dos combustibles distintos con distintos precios
        Combustible cb = new Combustible("Diesel", 100);
        Combustible cb2 = new Combustible("Gasolina", 200);


        // Un auto y un camion para simular dos viajes
        Auto a1 = new Auto("Ford", "AA123BB", cb);
        Camion a2 = new Camion("Mercedes", "AA123BB", cb2);

        // Dos simulaciones de viaje para distintas rutas y vehiculos
        // utilizando 5 parametros
        Viaje v1 = new Viaje(c1, c2, "Diesel", a1, 5);
        // utilizando 6 parametros
        Viaje v2 = new Viaje(c2, c3, "Gasolina", a2, 10, 500);

        // Se calcula el costo total de los viajes
        System.out.println("****************************************************************");
        System.out.println("Viaje 1 en auto, combustible diesel a precio $100 y 5 peajes");
        System.out.println("Costo total peajes: " + v1.costoEnPeajes());
        System.out.println("Costo total combustible: " + v1.costoEnCombustibles());
        System.out.println("Costo total del viaje: " + v1.costoTotal());
        System.out.println("***************************************************************");
        System.out.println("Viaje 2 en camion, combustible diesel a precio $200 y 10 peajes");
        System.out.println("Costo total peajes: " + v2.costoEnPeajes());
        System.out.println("Costo total combustible: " + v2.costoEnCombustibles());
        System.out.println("Costo total del viaje: " + v2.costoTotal());
        System.out.println("*****************************************************************");

    }


}

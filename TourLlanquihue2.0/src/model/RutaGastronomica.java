package model;

/**
 * Representa una ruta gastronómica.
 */
public class RutaGastronomica extends ServicioTuristico {

    private int numeroDeParadas;

    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTipo: Ruta Gastronómica"
                + "\nNúmero de paradas: " + numeroDeParadas;
    }
}
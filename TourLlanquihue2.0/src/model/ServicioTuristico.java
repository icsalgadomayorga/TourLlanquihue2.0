package model;

/**
 * Clase base que representa un servicio turístico.
 * Contiene los atributos comunes para todos los servicios.
 */
public class ServicioTuristico {

    private String nombre;
    private int duracionHoras;

    /**
     * Constructor de la clase ServicioTuristico.
     *
     * @param nombre Nombre del servicio.
     * @param duracionHoras Duración del servicio en horas.
     */
    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    @Override
    public String toString() {
        return "Servicio Turístico\n"
                + "Nombre: " + nombre
                + "\nDuración: " + duracionHoras + " horas";
    }
}

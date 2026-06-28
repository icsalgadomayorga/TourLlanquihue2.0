package model;

/**
 * Representa una excursión cultural.
 */
public class ExcursionCultural extends ServicioTuristico {

    private String lugarHistorico;

    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTipo: Excursión Cultural"
                + "\nLugar histórico: " + lugarHistorico;
    }
}
package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

/**
 * Clase encargada de crear y mostrar servicios turísticos.
 */
public class GestorServicios {

    /**
     * Crea y muestra dos objetos de cada tipo de servicio.
     */
    public void mostrarServicios() {

        RutaGastronomica ruta1 = new RutaGastronomica(
                "Sabores de Llanquihue", 4, 5);

        RutaGastronomica ruta2 = new RutaGastronomica(
                "Ruta cervezera", 3, 3);

        PaseoLacustre paseo1 = new PaseoLacustre(
                "Lago Llanquihue", 2, "Catamarán");

        PaseoLacustre paseo2 = new PaseoLacustre(
                "Navegación Lican Ray", 1, "Lancha");

        ExcursionCultural excursion1 = new ExcursionCultural(
                "Museo Colonial", 2, "Frutillar");

        ExcursionCultural excursion2 = new ExcursionCultural(
                "Iglesias Históricas", 3, "Puerto Varas");

        System.out.println(ruta1);
        System.out.println("------------------------------");

        System.out.println(ruta2);
        System.out.println("------------------------------");

        System.out.println(paseo1);
        System.out.println("------------------------------");

        System.out.println(paseo2);
        System.out.println("------------------------------");

        System.out.println(excursion1);
        System.out.println("------------------------------");

        System.out.println(excursion2);
    }
}
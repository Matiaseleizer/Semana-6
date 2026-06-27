package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

public class GestorServicios {
    public void servicios(){

        RutaGastronomica ruta1 = new RutaGastronomica(3, "Mercado central", 5);
        RutaGastronomica ruta2 = new RutaGastronomica(2, "Doña Tina", 3);

        PaseoLacustre paseo1 = new PaseoLacustre("Bote", "Cruce Andino", 3);
        PaseoLacustre paseo2 = new PaseoLacustre("Velero", "Isla Victoria", 4);

        ExcursionCultural ex1 = new ExcursionCultural("Fantasilandia", "Historia Urbana", 5);
        ExcursionCultural ex2 = new ExcursionCultural("Sewell", "Historia minera", 3);

        System.out.println(ruta1.toString());
        System.out.println(ruta2.toString());
        System.out.println(paseo1.toString());
        System.out.println(paseo2.toString());
        System.out.println(ex1.toString());
        System.out.println(ex2.toString());
    }
}

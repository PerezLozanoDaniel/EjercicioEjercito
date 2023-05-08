package Ejercito;

import ClasesGenerales.CaracteristicasComunes;
import ClasesGenerales.NuevaUnidad;
import ClasesGenerales.TipoUnidad;
import TiposDeUnidad.AtaqueRapido;
import TiposDeUnidad.TransporteTropas;


import java.util.ArrayList;

public class ListaEjercito {

    ArrayList<ListaEjercito> unidadesListaEjercito = new ArrayList<>();

    public void agregarUnidad(CaracteristicasComunes datosUnidad){
            if (datosUnidad.getDescripcion().equalsIgnoreCase(TipoUnidad.valueOf());


                unidadesListaEjercito.add(datosUnidad);

            }else
                System.out.println("No corresponde a un tipo de unidad de Ejercito");


   @Override
    public String toString() {
        String cadena;
         cadena="Unidades del Ejercito= \n";
        for (ListaEjercito unidad : unidadesListaEjercito) {
            cadena+= unidad+
            "\n";
        }
        return cadena;
    }
}


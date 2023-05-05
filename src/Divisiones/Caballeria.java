package Divisiones;

import TiposDeUnidad.AtaqueRapido;
import TiposDeUnidad.TransporteTropas;


import java.util.ArrayList;

public class Caballeria {

    ArrayList<Caballeria> unidadesCaballeria = new ArrayList<>();

    public void agregarUnidad(AtaqueRapido datosUnidad){
            if (datosUnidad.getDescripcion()!="Ataque Rápido") {
                System.out.println("No corresponde a un tipo de unidad de Caballería");
            }else
                unidadesCaballeria.add(datosUnidad);

    }
    public void agregarUnidad(TransporteTropas datosUnidad){
        if (datosUnidad.getDescripcion()!="Transporte Tropas") {
            System.out.println("No corresponde a un tipo de unidad de Caballería");
        }else
            unidadesCaballeria.add(datosUnidad);

    }


    @Override
    public String toString() {
        String cadena;
         cadena="Unidades de Caballería= \n";
        for (Caballeria unidad : unidadesCaballeria) {
            cadena+= unidad+
            "\n";
        }
        return cadena;
    }
}


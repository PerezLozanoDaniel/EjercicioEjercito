package TiposDeUnidad;

import ClasesGenerales.CaracteristicasComunes;
import Ejercito.ListaEjercito;

public class TransporteTropas extends ListaEjercito {

    CaracteristicasComunes caracteristicasComunes;


    public TransporteTropas(CaracteristicasComunes caracteristicasComunes) {
        // this.caracteristicasComunes.setDescripcion("Transporte Tropas");
        this.caracteristicasComunes = caracteristicasComunes;

    }
    public String getDescripcion(){
        return caracteristicasComunes.getDescripcion();
    }

    @Override
    public String toString() {
        return "TransporteTropas{" +
                caracteristicasComunes +
                '}';
    }
}

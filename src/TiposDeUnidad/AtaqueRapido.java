package TiposDeUnidad;

import ClasesGenerales.CaracteristicasComunes;
import Ejercito.ListaEjercito;

public class AtaqueRapido extends ListaEjercito {

    CaracteristicasComunes caracteristicasComunes;


    public AtaqueRapido(CaracteristicasComunes caracteristicasComunes) {
       // this.caracteristicasComunes.setDescripcion("Ataque Rápido");
        this.caracteristicasComunes = caracteristicasComunes;

    }
    public String getDescripcion(){
        return caracteristicasComunes.getDescripcion();
    }

    @Override
    public String toString() {
        return "AtaqueRapido{" +
                caracteristicasComunes +
                '}';
    }
}

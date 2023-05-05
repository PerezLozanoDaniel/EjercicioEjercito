package TiposDeUnidad;

import ClasesGenerales.CaracteristicasComunes;
import Divisiones.Caballeria;

public class AtaqueRapido extends Caballeria {

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

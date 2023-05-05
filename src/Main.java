
import ClasesGenerales.*;
import ClasesGenerales.NuevaUnidad;
import Divisiones.Caballeria;
import TiposDeUnidad.*;

public class Main {
    public static void main(String[] args) {

        NuevaUnidad nuevaUnidad=new NuevaUnidad();

        Caballeria divisionCaballeria =new Caballeria();

       // AtaqueRapido Tanque_Pesado_Trueno = new AtaqueRapido(new CaracteristicasComunes("Tanque Pesado Trueno", "Ataque Rápido", 5.5, 5.5, 9.5, 12800));



        divisionCaballeria.agregarUnidad(nuevaUnidad.nuevoAtaqueRapido());
        divisionCaballeria.agregarUnidad(nuevaUnidad.nuevoTransporteTropas());
        divisionCaballeria.agregarUnidad(nuevaUnidad.nuevoAtaqueRapidoManual());


        System.out.println(divisionCaballeria);
        }

}

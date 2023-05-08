
import ClasesGenerales.NuevaUnidad;
import Ejercito.ListaEjercito;

public class Main {
    public static void main(String[] args) {

        NuevaUnidad nuevaUnidad=new NuevaUnidad();

        ListaEjercito listaEjercito =new ListaEjercito();

       // AtaqueRapido Tanque_Pesado_Trueno = new AtaqueRapido(new CaracteristicasComunes("Tanque Pesado Trueno", "Ataque Rápido", 5.5, 5.5, 9.5, 12800));



        listaEjercito.agregarUnidad(nuevaUnidad.nuevaUnidad());
       /* listaEjercito.agregarUnidad(nuevaUnidad.nuevoTransporteTropas());
        listaEjercito.agregarUnidad(nuevaUnidad.nuevoAtaqueRapidoManual());*/


        System.out.println(listaEjercito);
        }

}

package ClasesGenerales;

import TiposDeUnidad.AtaqueRapido;
import TiposDeUnidad.TransporteTropas;

import java.util.Scanner;

public class NuevaUnidad {

        public AtaqueRapido nuevoAtaqueRapido() {
        AtaqueRapido Tanque_Medio_Jabato = new AtaqueRapido(new CaracteristicasComunes("Tanque Medio Jabato", "Ataque Rápido", 8, 4, 8, 10000));
        return Tanque_Medio_Jabato;
        }
    public TransporteTropas nuevoTransporteTropas() {
        TransporteTropas Blindado_Tropas_Goliat =new TransporteTropas(new CaracteristicasComunes("Blindado Tropas Goliat","Transporte Tropas", 10,2,0,6000));
        return Blindado_Tropas_Goliat;
    }
        public AtaqueRapido nuevoAtaqueRapidoManual(){
            String nombre;
            double velocidad;
            double blindaje;
            double potenciaDeFuego;
            double precio;
            Scanner entradaTeclado = new Scanner(System.in);

            System.out.println("\nNombre de la Unidad");
            nombre= entradaTeclado.nextLine();

            System.out.println("\nVelocidad");
            velocidad= entradaTeclado.nextDouble();

            System.out.println("\nBlindaje");
            blindaje= entradaTeclado.nextDouble();

            System.out.println("\nPotencia de Fuego");
            potenciaDeFuego= entradaTeclado.nextDouble();

            System.out.println("\nPrecio de la Unidad");
            precio=entradaTeclado.nextDouble();

            AtaqueRapido unidadAtaqueRapido =new AtaqueRapido(new CaracteristicasComunes(nombre,"Ataque Rápido",velocidad,blindaje,potenciaDeFuego,precio));

            return unidadAtaqueRapido;
        }

    public TransporteTropas nuevoTransporteTropasManual(){
        String nombre;
        double velocidad;
        double blindaje;
        double potenciaDeFuego;
        double precio;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("\nNombre de la Unidad");
        nombre= entradaTeclado.nextLine();

        System.out.println("\nVelocidad");
        velocidad= entradaTeclado.nextDouble();

        System.out.println("\nBlindaje");
        blindaje= entradaTeclado.nextDouble();

        System.out.println("\nPotencia de Fuego");
        potenciaDeFuego= entradaTeclado.nextDouble();

        System.out.println("\nPrecio de la Unidad");
        precio=entradaTeclado.nextDouble();

        AtaqueRapido unidadAtaqueRapido =new AtaqueRapido(new CaracteristicasComunes(nombre,"Transporte Tropas",velocidad,blindaje,potenciaDeFuego,precio));

        return unidadAtaqueRapido;

}
package ClasesGenerales;

import Interfaces.*;


public class CaracteristicasComunes implements IBlindado, IDestructor, IMovil, IPrecioUnidad {
    private String nombreUnidad;
    private String descripcion;
    private double velocidad;
    private double blindaje;
    private double potenciaDeFuego;
    private double precio;

    public CaracteristicasComunes(String nombreUnidad, String descripcion ,double velocidad, double blindaje, double potenciaDeFuego, double precio) {
        this.nombreUnidad=setNombreUnidad(nombreUnidad);
        this.descripcion=setDescripcion(descripcion);
        this.velocidad=setVelocidad(velocidad);
        this.blindaje=setBlindaje(blindaje);
        this.potenciaDeFuego=setPotenciaDeFuego(potenciaDeFuego);
        this.precio=setPrecio(precio);
    }


    @Override
    public double resistenciaAlAtaque() {
       return this.blindaje;
    }
    public double setBlindaje(double blindaje) {
        if (blindaje < 0) {
            System.out.println("\nEl blindaje no puede ser menor que 0, vuelva a introducir el valor de blindaje\n");
        }
        return blindaje;
    }
    @Override
    public double capacidadDeDestruccion() {
        return this.potenciaDeFuego;

    }
    public double setPotenciaDeFuego(double potenciaDeFuego) {
        if (potenciaDeFuego < 0) {
            System.out.println("\nLa potencia de fuego no puede ser menor que 0, vuelva a introducir el valor de potencia de fuego\n");
        }
        return potenciaDeFuego;
    }
    @Override
    public double capacidadDeMovimiento() {
        return this.velocidad;
    }
    public double setVelocidad(double velocidad) {
        if (velocidad < 0) {
            System.out.println("\nLa velocidad no puede ser menor que 0, vuelva a introducir el valor de velocidad\n");
        }
        return velocidad;
    }
    @Override
    public double precioUnidad() {
        return this.precio;
    }
    public double setPrecio(double precio) {
        if (precio < 0) {
            System.out.println("\nEl precio no puede ser menor que 0, vuelva a introducir el valor de precio\n");
            this.precioUnidad();
        }
        return precio;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public String setDescripcion(String descripcion) {
        if(descripcion==""){
            System.out.println("\nLa descripción no puede estar vacía, vuelva a introducir la descripción\n");
        }
        return descripcion;
    }

    public String setNombreUnidad(String nombreUnidad) {
        if(nombreUnidad==""){
            System.out.println("\nEl nombre de la unidad no puede estar vacío, vuelva a introducir el nombre de unidad\n");
        }
        return nombreUnidad;
    }

    @Override
    public String toString() {
        return  "nombreUnidad='" + nombreUnidad + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", velocidad=" + velocidad +
                ", blindaje=" + blindaje +
                ", potenciaDeFuego=" + potenciaDeFuego +
                ", precio=" + precio;
    }
}


//Vehiculo
class Vehiculo{
    String marca;
    String modelo;
    int anio;
    double velocidad;
    public Vehiculo(String marca, String modelo, int anio, double velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidad = velocidad;
    }
    public void informacion(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Año: "+ anio);
        System.out.println("Velocidad: "+ velocidad +"Km/h");
    }
}






public class Main {
    public static void main(String[] args) {

    }
}
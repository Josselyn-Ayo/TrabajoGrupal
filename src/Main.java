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
        System.out.println("------------------------------");
    }
    public void frenar(){
        velocidad = 90;
        System.out.println("El vehiculo ha frenado. Velocidad actual es de: "+ velocidad+"Km/h");
    }

}

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Toyota","Todo terreno",2019,500);
        Vehiculo vehiculo2 = new Vehiculo("Ford","Deportivo",2023,490);
        Vehiculo vehiculo3 = new Vehiculo("Suzuki","Camioneta",2016,155);

        vehiculo1.informacion();
        vehiculo1.frenar();
        System.out.println();
        vehiculo2.informacion();
        vehiculo2.frenar();
        System.out.println();
        vehiculo3.informacion();
        vehiculo3.frenar();


    }
}
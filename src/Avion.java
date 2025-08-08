public class Avion implements Vehiculo {
    @Override
    public void moverse() {
        System.out.println("El avión vuela en el cielo.");
    }
    
    @Override
    public String toString() {
        return "Avión";
    }
    
   
   
}
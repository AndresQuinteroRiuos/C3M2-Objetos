public class Carro implements Vehiculo {
    @Override
    public void moverse() {
        System.out.println("El carro se mueve rápidamente.");
    }
    
    @Override
    public String toString() {
        return "Carro";
    }
}

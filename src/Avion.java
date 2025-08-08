public class Avion implements Vehiculo, Motorizado {
    @Override
    public void moverse() {
        System.out.println("El avión vuela en el cielo.");
    }
    
    @Override
    public String toString() {
        return "Avión";
    }
    
    @Override
    public int obtenerVelocidad() {
        // Ejemplo: retorna una velocidad fija para un avión
        return 800;
    }
    
    @Override
    public void cambiarMarcha(int marcha) {
        System.out.println("Avión cambia a la marcha " + marcha);
    }
}
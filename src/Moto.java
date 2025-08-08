public class Moto implements Vehiculo, Motorizado {
    @Override
    public void moverse() {
        System.out.println("La moto se desplaza a gran velocidad.");
    }
    
    @Override
    public String toString() {
        return "Moto";
    }
    
    @Override
    public int obtenerVelocidad() {
        // Ejemplo: retorna una velocidad fija
        return 120;
    }
    
    @Override
    public void cambiarMarcha(int marcha) {
        System.out.println("Moto cambia a la marcha " + marcha);
    }
    
    public void hacerCaballito() {
        System.out.println("Se mueve sobre 1 rueda");
    }
}

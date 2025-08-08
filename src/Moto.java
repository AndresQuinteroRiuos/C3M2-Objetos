public class Moto implements Vehiculo {
    @Override
    public void moverse() {
        System.out.println("La moto se desplaza a gran velocidad.");
    }
    
    @Override
    public String toString() {
        return "Moto";
    }
    
    
    public int obtenerVelocidad() {
        // Ejemplo: retorna una velocidad fija
        return 120;
    }
    
   
    }

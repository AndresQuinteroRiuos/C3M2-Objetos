import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = crearVehiculos();
        imprimirVehiculos(vehiculos);
        
        vehiculos.forEach(Vehiculo::moverse);
        
        Nadador.patear();
        
        Pato pato = new Pato();
        pato.nadar();
        pato.volar();
        pato.clavado();
    }
    
    private static List<Vehiculo> crearVehiculos() {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Carro());
        vehiculos.add(new Avion());
        vehiculos.add(new Moto());
        return vehiculos;
    }
    
    private static void imprimirVehiculos(List<Vehiculo> vehiculos) {
        System.out.println("Lista de Vehículos:");
        vehiculos.forEach(System.out::println);
    }
}

// Definición de la interfaz Vehiculo
interface Vehiculo {
    void moverse();
}

// Clase Carro implementando Vehiculo
class Carro implements Vehiculo {
    @Override
    public void moverse() {
        System.out.println("El carro se mueve rápidamente.");
    }
    
    @Override
    public String toString() {
        return "Carro";
    }
}

// Clase Avion implementando Vehiculo
class Avion implements Vehiculo {
    @Override
    public void moverse() {
        System.out.println("El avión vuela en el cielo.");
    }
    
    @Override
    public String toString() {
        return "Avión";
    }
}

// Clase Moto implementando Vehiculo
class Moto implements Vehiculo {
    @Override
    public void moverse() {
        System.out.println("La moto se desplaza a gran velocidad.");
    }
    
    @Override
    public String toString() {
        return "Moto";
    }
}

// Clase Nadador con método estático
class Nadador {
    public static void patear() {
        System.out.println("El nadador realiza un gran pateo.");
    }
}

// Clase Pato con sus métodos correspondientes
class Pato {
    public void nadar() {
        System.out.println("El pato nada en el lago.");
    }
    
    public void volar() {
        System.out.println("El pato vuela en el cielo.");
    }
    
    public void clavado() {
        System.out.println("El pato realiza un clavado espectacular.");
    }
}

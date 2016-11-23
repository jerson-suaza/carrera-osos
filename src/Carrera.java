
import java.util.ArrayList;

public class Carrera {
    
    private ArrayList<Oso> osos;

    public Carrera() {
        osos = new ArrayList<>();
    }
    
    public void startCarrera(){
        osos.add(new Oso("Panda", 3, 0));
        osos.add(new Oso("Grisly", 4, 3));
        osos.add(new Oso("Peresozo", 2, 0));
        osos.add(new Oso("Yogi", 5, 1));
        osos.add(new Oso("Barny", 2, 0));
        
        invitarmeCarrera();
        int totalOsos = cuantosOsosVictorias();
        System.out.println("El total de osos que han ganado carreras es " + totalOsos);
        Oso osoVeloz = osoMasRapido();
        System.out.println("El oso mas rapido es: " + osoVeloz.getNombre());
        Oso osoVelozSinVictorias = osoMasRapidoSinVictoias();
        System.out.println("El oso mas rapido es: " + osoVelozSinVictorias.getNombre());
        
    }
    
    //incluirse usted en la carrera
    //nombre: <SU NOMBRE>, velocidad: <6>, victorias: <2>
    private void invitarmeCarrera() {
        
    }
    
    //retornar el numero de osos que han ganado carreras
    private int cuantosOsosVictorias() {
        return 0;
    }
    
    //retornar el OSO más rápido de la lista
    private Oso osoMasRapido() {
        return null;
    }
    
    //retornar el oso mas rapido de la lista pero que NO
    //haya ganado carreras(victorias) en el pasado
    private Oso osoMasRapidoSinVictoias() {
        return null;
    }
    
    
}

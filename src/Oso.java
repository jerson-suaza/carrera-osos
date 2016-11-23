
class Oso {
       
    private String nombre;
    private int velocidad;
    private int victorias;

    public Oso(String nombre, int velocidad, int victorias) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.victorias = victorias;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getVictorias() {
        return victorias;
    }
    
}

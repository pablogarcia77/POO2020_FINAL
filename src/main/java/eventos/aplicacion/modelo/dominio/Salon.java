package eventos.aplicacion.modelo.dominio;

public class Salon {

    public String direccion;

    public int capacidad;

    public String id_salon;

    public double precio;

    @Override
    public String toString() {
        return "\nSalon: " + id_salon + "\nCapacidad: " + capacidad + "\nDireccion: " + direccion + "\nPrecio: " + precio + "\n***************\n";
    }

    public Salon (String id_salon, String direccion, int capacidad, double precio) {
    	super();
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.id_salon = id_salon;
        this.precio = precio;
    }

    public Salon() {
    }
}

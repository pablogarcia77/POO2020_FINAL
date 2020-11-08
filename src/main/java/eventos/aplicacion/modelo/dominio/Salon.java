package eventos.aplicacion.modelo.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SALONES")
public class Salon {

    @Column
    public String direccion;
    @Column
    public int capacidad;
    @Id
    @Column
    public String id_salon;
    @Column
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

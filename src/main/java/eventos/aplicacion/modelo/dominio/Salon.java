package eventos.aplicacion.modelo.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SALONES")
public class Salon {

    @Id
    @Column(name = "sal_id")
    public String id_salon;
    @Column(name = "sal_direccion")
    public String direccion;
    @Column(name = "sal_capacidad")
    public int capacidad;
    @Column(name = "sal_precio")
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

package eventos.aplicacion.modelo.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTES")
public class Cliente {

    @Id
    @Column(name = "cli_id")
    private String id_cliente;
    @Column(name = "cli_nombre")
    private String nombre;
    @Column(name = "cli_telefono")
    private String telefono;
    @Column(name = "cli_email")
    private String email;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Reserva> reservas = new ArrayList<Reserva> ();

    public Cliente(String id_cliente, String nombre, String telefono, String email) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public Cliente() {
    }

    @Override
    public String toString() {
        return "***************\n" + "Cliente: " + id_cliente + "\nNombre: " + nombre + 
        "\nTelefono: " + telefono + "\nEmail: " + email;
    }

    public void agregarReserva(Reserva reserva) {
    	this.reservas.add(reserva);
    }

    public List<Reserva> verReservas() {
        return reservas;
    }
    
    public String obtenerDatos() {
        return toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
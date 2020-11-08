package eventos.aplicacion.modelo.dominio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String id_cliente;

    private String nombre;

    private String telefono;

    private String email;

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
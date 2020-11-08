package eventos.aplicacion.modelo.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RESERVAS")
public class Reserva {

    @Id
    @Column
    private String id_reserva;
    @Column
    private Date fecha;
    @Column
    private double monto;
    @Column
    private boolean cancelado;
    @Column
    private double saldo;
    @Column
    private boolean reservado = false;
    @Column
    public List<Servicio> servicios = new ArrayList<Servicio> ();
    @Column
    public List<Salon> salon = new ArrayList<Salon> ();

    public Reserva(String id_reserva, Date fecha, double monto, boolean cancelado, double saldo, int hora_inicio,
            int hora_fin, boolean reservado) {
    	super();
        this.id_reserva = id_reserva;
        this.fecha = fecha;
        this.monto = monto;
        this.cancelado = cancelado;
        this.saldo = saldo;
        this.reservado = reservado;
    }

    public Reserva() {
    }

      
    public void reservarSalon(Salon s) {
        this.salon.add(s);
    }

    public double diferencia() {
        return saldo;
    }
    
    public String mostrarServicios() {
        return toString();
    }

    public void agregarServicio(Servicio s) {
    	this.servicios.add(s);
    }
    
    public String getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(String id_reserva) {
        this.id_reserva = id_reserva;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public List<Servicio> getServicio() {
        return servicios;
    }

    public void setServicio(List<Servicio> servicio) {
        this.servicios = servicio;
    }

    public List<Salon> getSalon() {
        return salon;
    }

    public void setSalon(List<Salon> salon) {
        this.salon = salon;
    }

	@Override
    public String toString() {
        return  "\nReserva: " + id_reserva + "\nCancelado: " 
                + cancelado + "\nFecha: " + fecha.getDay() +"/" + fecha.getMonth() + "/" 
                + fecha.getYear() + "\nMonto: " + monto + "\nReservado: " + reservado
                + "\nSaldo: " + saldo + salon.toString();
    }
    
    public Double calcularTotalReserva() {
    	Double total = 0.0;
    	for (Servicio s : servicios) {
            total += s.calcularTotalServicio();
		}
    	return total;
    }

}

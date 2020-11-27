package eventos.aplicacion.modelo.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "RESERVAS")
public class Reserva {

    @Id
    @Column(name = "res_id")
    private String id_reserva;
    @Column(name = "res_fecha")
    private Date fecha;
    @Column(name = "res_monto")
    private double monto;
    @Column(name = "res_cancelado")
    private boolean cancelado;
    @Column(name = "res_saldo")
    private double saldo;
    @Column(name = "res_reservado")
    private boolean reservado = false;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Servicio> servicios = new ArrayList<Servicio>();
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Salon> salon = new ArrayList<Salon>();

    public Reserva(String id_reserva, Date fecha, double monto, int hora_inicio, int hora_fin, boolean reservado) {
        this.id_reserva = id_reserva;
        this.fecha = fecha;
        this.monto = monto;
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
        return "\nReserva: " + id_reserva + "\nCancelado: " + cancelado + "\nFecha: " + fecha.getMinutes() + "/"
                + fecha.getMonth() + "/" + fecha.getYear() + "\nMonto: " + monto + "\nReservado: " + reservado
                + "\nSaldo: " + saldo + salon.toString();
    }

    public Double calcularTotalReserva() {
        Double total = 0.0;
        for (Servicio s : servicios) {
            total += s.calcularTotalServicio();
        }
        return total;
    }

    public Boolean isCanceled() {
        return (this.monto == this.calcularTotalReserva()) ? true : false;
    }

}

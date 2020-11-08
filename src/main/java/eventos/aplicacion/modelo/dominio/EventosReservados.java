package eventos.aplicacion.modelo.dominio;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@MappedSuperclass
@Table(name = "EVENTOS_RESERVADOS")
public class EventosReservados {

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Reserva> reservas = new ArrayList<Reserva> ();
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "res_id")
    Reserva reserva;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sal_id")
    Salon salon;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cli_id")
    Cliente cliente;

    public EventosReservados(Reserva reserva, Salon salon, Cliente cliente) {
        this.reserva = reserva;
        this.salon = salon;
        this.cliente = cliente;
    }
     
    public EventosReservados() {
    }

    public void mostrarReservas() {
        for (Reserva reserva : reservas) {
            System.out.println("***************\n" + cliente.obtenerDatos() + salon.toString() + reserva.mostrarServicios() + "\n***************");
        }
    }
    public double calcularTotal() {
    	Double total = 0.0;
    	for(Reserva reserva: reservas) {
    		total += reserva.calcularTotalReserva();
    	}
    	return total;
    }

    public String estaCancelado() {
        String cancelado;
        if (reserva.getSaldo()==0.0){
            cancelado = "El evento se encuentra pagado";
        }else{
            cancelado = "El evento no se encuentra pagado";
        }
        return cancelado;
    }

    public String modificarFechaReserva(String idReserva, Date fecha) {
    	for(Reserva reserva: reservas) {
    		if(reserva.getId_reserva().equals(idReserva)) {
    			reserva.setFecha(fecha);
    			return "Se actualizó la fecha de la reserva";
    		}
    	}
    	return "No se encontró reserva";
    }

    public void cancelarReserva(){
        reserva.setSaldo(0.0);
        reserva.setCancelado(true);
        reserva.setReservado(true);
    }

}
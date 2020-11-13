package eventos.aplicacion.modelo.dominio;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("M")
@Table(name = "MUSICAS")
public class Musica extends Servicio {

    @Column
    public boolean incluyeAnimador;
    @Column
    public double precioAnimador;
    @Column
    public double precioServicioMusica;

    public Musica(boolean incluyeAnimador, double precioAnimador, double precioServicioMusica) {
        this.incluyeAnimador = incluyeAnimador;
        this.precioAnimador = precioAnimador;
        this.precioServicioMusica = precioServicioMusica;
    }

    @Override
    public double calcularTotalServicio() {
    	if(this.incluyeAnimador) {
    		return this.precioServicioMusica + this.precioAnimador;
    	}else {
    		return this.precioServicioMusica;
    	}
    }

    

}

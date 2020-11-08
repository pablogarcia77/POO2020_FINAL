package eventos.aplicacion.modelo.dominio;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
@Table(name = "CATERINGS")
public class Catering extends Servicio {

    @Column
    public int cantidadComidas;
    @Column
    public double precioPorComida;

    public Catering(int cantidadComidas, double precioPorComida) {
        this.cantidadComidas = cantidadComidas;
        this.precioPorComida = precioPorComida;
    }

    public Catering() {
		super();
	}

	@Override
    public double calcularTotalServicio() {
        return this.cantidadComidas * this.precioPorComida;
    }

    

}

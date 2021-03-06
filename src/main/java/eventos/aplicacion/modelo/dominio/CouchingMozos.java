package eventos.aplicacion.modelo.dominio;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("CM")
@Table(name = "COUCHING_MOZOS")
public class CouchingMozos extends Servicio {
    @Column
    public int cantidadMozos;
    @Column
    public double precioPorMozo;
    
    public CouchingMozos(int cantidadMozos, double precioPorMozo) {
        this.cantidadMozos = cantidadMozos;
        this.precioPorMozo = precioPorMozo;
    }
    
    @Override
    public double calcularTotalServicio() {
        return this.cantidadMozos * this.precioPorMozo;
    }

    

}

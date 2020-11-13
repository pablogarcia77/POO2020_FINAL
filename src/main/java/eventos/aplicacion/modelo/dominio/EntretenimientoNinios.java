package eventos.aplicacion.modelo.dominio;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("E")
@Table(name = "ENTRETENIMIENTO_NINIOS")
public class EntretenimientoNinios extends Servicio {
    
    @Column
	public boolean pelotero;
	@Column
	public double precioPelotero;
    @Column
    public int cantidadNinios;
    @Column
    public double precioPorNinio;

    public EntretenimientoNinios(boolean pelotero, double precioPelotero, int cantidadNinios, double precioPorNinio) {
        this.pelotero = pelotero;
        this.precioPelotero = precioPelotero;
    	this.cantidadNinios = cantidadNinios;
        this.precioPorNinio = precioPorNinio;
    }

    @Override
    public double calcularTotalServicio() {
    	if(this.pelotero) {
    		return (this.cantidadNinios * this.precioPorNinio) + this.precioPelotero;
    	}else {
    		return this.cantidadNinios * this.precioPorNinio;
    	}
    }

    

}

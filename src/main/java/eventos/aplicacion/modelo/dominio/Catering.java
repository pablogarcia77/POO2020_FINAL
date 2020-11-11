package eventos.aplicacion.modelo.dominio;

import javax.persistence.Column;
import javax.persistence.Id;
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
        // this.id_catering = id_catering;
        this.cantidadComidas = cantidadComidas;
        this.precioPorComida = precioPorComida;
    }

    public Catering() {
    }

    @Override
    public double calcularTotalServicio() {
        return this.cantidadComidas * this.precioPorComida;
    }

    /*
     * public String getId_catering() { return id_catering; }
     * 
     * public void setId_catering(String id_catering) { this.id_catering =
     * id_catering; }
     */

    public int getCantidadComidas() {
        return cantidadComidas;
    }

    public void setCantidadComidas(int cantidadComidas) {
        this.cantidadComidas = cantidadComidas;
    }

    public double getPrecioPorComida() {
        return precioPorComida;
    }

    public void setPrecioPorComida(double precioPorComida) {
        this.precioPorComida = precioPorComida;
    }

}

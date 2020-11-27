package eventos.aplicacion.modelo.dominio;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("C")
@Table(name = "CATERINGS")
public class Catering extends Servicio {

    @Column
    private int cantidadComidas;
    @Column
    private double precioPorComida;

    public Catering(int cantidadComidas, double precioPorComida) {
        // this.id_catering = id_catering;
        this.cantidadComidas = cantidadComidas;
        this.precioPorComida = precioPorComida;
    }

    public Catering() {
    }

    public Catering(String id_servicio, String descripcion, double precio, int cantidadComidas,
            double precioPorComida) {
        super(id_servicio, descripcion, precio);
        this.cantidadComidas = cantidadComidas;
        this.precioPorComida = precioPorComida;
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

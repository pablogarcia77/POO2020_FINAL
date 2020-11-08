package eventos.aplicacion.modelo.dominio;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
@Table(name = "ORNAMENTACIONES")
public class Ornamentacion extends Servicio {

    @Column
    public int cantidadSalones;
    @Column
    public double precioPorSalon;

    public Ornamentacion(int cantidadSalones, double precioPorSalon) {
        this.cantidadSalones = cantidadSalones;
        this.precioPorSalon = precioPorSalon;
    }

    @Override
    public double calcularTotalServicio() {
        return this.cantidadSalones * this.precioPorSalon;
    }
}

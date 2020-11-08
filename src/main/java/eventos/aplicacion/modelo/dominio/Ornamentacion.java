package eventos.aplicacion.modelo.dominio;

public class Ornamentacion extends Servicio {
    public int cantidadSalones;

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

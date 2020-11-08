package eventos.aplicacion.modelo.dominio;

public class CouchingMozos extends Servicio {
    public int cantidadMozos;

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

package eventos.aplicacion.modelo.dominio;

public class Musica extends Servicio {
    public boolean incluyeAnimador;
    
    public double precioAnimador;

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

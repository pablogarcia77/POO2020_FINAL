package eventos.aplicacion.modelo.dominio;

public class Catering extends Servicio {
    public int cantidadComidas;

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

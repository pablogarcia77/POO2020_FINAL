package eventos.aplicacion.modelo.dominio;

public class EntretenimientoNinios extends Servicio {
	
	public boolean pelotero;
	
	public double precioPelotero;

    public int cantidadNinios;

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

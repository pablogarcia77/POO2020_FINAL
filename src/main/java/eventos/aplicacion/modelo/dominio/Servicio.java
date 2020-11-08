package eventos.aplicacion.modelo.dominio;

public abstract class Servicio {
    public String descripcion;
  
    public double precio;
  
    public abstract double calcularTotalServicio();
  
  public String getDescripcion() {
    return descripcion;
  }
  
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  
  public double getPrecio() {
    return precio;
  }
  
  public void setPrecio(double precio) {
    this.precio = precio;
  }
  
  }
  
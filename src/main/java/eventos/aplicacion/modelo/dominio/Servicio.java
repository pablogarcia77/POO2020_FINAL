package eventos.aplicacion.modelo.dominio;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
@Table(name = "SERVICIOS")
public abstract class Servicio {

  @Id
  @Column(name = "ser_id")
  public String id_servicio;
  @Column
  public String descripcion;
  @Column
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
  
package eventos.aplicacion.modelo.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "SERVICIOS")
public abstract class Servicio {

  @Id
  @Column(name = "ser_id")
  public String id_servicio;
  @Column
  public String descripcion;
  @Column
  public double precio;

  public Servicio() {
  }

  public Servicio(String id_servicio, String descripcion, double precio) {
    this.id_servicio = id_servicio;
    this.descripcion = descripcion;
    this.precio = precio;
  }

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

  public String getId_servicio() {
    return id_servicio;
  }

  public void setId_servicio(String id_servicio) {
    this.id_servicio = id_servicio;
  }

}

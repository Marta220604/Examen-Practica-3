
package modelo;

import java.time.LocalDate;

/**
 *Clase que representa un coche
 * @author alumno
 */
public class Coche {
    private String matricula;
    private LocalDate fechamatriculacion;
    private float precio;

    public Coche() {
    }
    

    public Coche(String matricula, LocalDate fechamatriculacion, float precio) {
        this.matricula = matricula;
        this.fechamatriculacion = fechamatriculacion;
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getFechamatriculacion() {
        return fechamatriculacion;
    }

    public void setFechamatriculacion(LocalDate fechamatriculacion) {
        this.fechamatriculacion = fechamatriculacion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", fechamatriculacion=" + fechamatriculacion + ", precio=" + precio + '}';
    }
    
}

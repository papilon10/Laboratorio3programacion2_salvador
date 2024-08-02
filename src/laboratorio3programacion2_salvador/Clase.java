/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3programacion2_salvador;

/**
 *
 * @author Apple
 */
public class Clase {

    private String nombre;
    private String seccion;
    private Facultad facultad;

    public enum Facultad {
        INGENIERIA,
        CIENCIAS_ECONOMICAS,
        ARTE,
        CIENCIAS_SALUD
    }

    public Clase() {
    }

    public Clase(String nombre, String seccion, Facultad facultad) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "Clase{" + "nombre de clase: " + nombre + ", numero de seccion" + seccion + ", perteneciente a la facultad de" + facultad + '}';
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3programacion2_salvador;

/**
 *
 * @author Apple
 */
public class clases {

    private String nombre;
    private int seccion;

    private enum facultad {
        Ingenieria("ingenieria"),
        Ciencias_economicas("ciencias economicas"),
        Arte("arte"),
        Ciencias_salud("salud");

        private String nombre_facu;

        private facultad(String nombre_facu) {
            this.nombre_facu = nombre_facu;
        }

        public String nombre_facu() {
            return nombre_facu;
        }

    }

    public clases() {
    }

    public clases(String nombre, int seccion) {
        this.nombre = nombre;
        this.seccion = seccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "clases{" + "nombre=" + nombre + ", seccion=" + seccion + '}';
    }

}

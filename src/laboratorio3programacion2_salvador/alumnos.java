/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3programacion2_salvador;

import java.util.ArrayList;

/**
 *
 * @author Apple
 */
public class alumnos extends usuario {

    private String carrera;
    private int cuenta;
    private ArrayList<Clase> lista_clases = new ArrayList<>();

    public enum facultad {
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

    public alumnos(String nombre, String usuario, String contrasena) {
        super(nombre, usuario, contrasena);
    }
    
    

    public alumnos(String carrera, int cuenta, String nombre, String usuario, String contrasena) {
        super(nombre, usuario, contrasena);
        this.carrera = carrera;
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return super.toString() + "alumnos{" + "carrera=" + carrera + ", cuenta=" + cuenta + ", lista_clases=" + lista_clases + '}';
    }

}

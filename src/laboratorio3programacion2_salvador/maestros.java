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
public class maestros extends usuario {

    private String profesion;
    private ArrayList<clases> lista_impartidas = new ArrayList<>();

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

    public maestros(String nombre, String usuario, String contrasena) {
        super(nombre, usuario, contrasena);
    }

    public maestros(String profesion, String nombre, String usuario, String contrasena) {
        super(nombre, usuario, contrasena);
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return super.toString() + "maestros{" + "profesion=" + profesion + ", lista_impartidas=" + lista_impartidas + '}';
    }

}

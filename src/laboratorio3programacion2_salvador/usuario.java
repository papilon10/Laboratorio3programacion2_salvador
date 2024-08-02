/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3programacion2_salvador;

/**
 *
 * @author Apple
 */
public class usuario {

    private String nombre;
    private String usuario;
    private String contrasena;

    private enum universidad {
        UNAH("UNAH"),
        UNITEC("UNITEC"),
        UNICAH("UNICAH"),
        UJCV("UJCV"),
        UTH("UTH"),
        UMH("UMH");

        private String nombre_uni;

        private universidad(String nombre_uni) {
            this.nombre_uni = nombre_uni;
        }

        public String getNombre_uni() {
            return nombre_uni;
        }

    }

    public usuario(String nombre, String usuario, String contrasena) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "usuario{" + "nombre=" + nombre + ", usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }

}

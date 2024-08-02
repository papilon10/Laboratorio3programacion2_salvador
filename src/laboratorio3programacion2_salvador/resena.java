/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3programacion2_salvador;

/**
 *
 * @author Apple
 */
public class resena {

    private String alumno;
    private String maestro;
    private String clase_asistida;
    private int puntuacion;
    private String comentario;

    public resena() {
    }

    public resena(String alumno, String maestro, String clase_asistida, int puntuacion, String comentario) {
        this.alumno = alumno;
        this.maestro = maestro;
        this.clase_asistida = clase_asistida;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getMaestro() {
        return maestro;
    }

    public void setMaestro(String maestro) {
        this.maestro = maestro;
    }

    public String getClase_asistida() {
        return clase_asistida;
    }

    public void setClase_asistida(String clase_asistida) {
        this.clase_asistida = clase_asistida;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "resena{" + "escrita por el alumno" + alumno + ",cuyo maestro es" + maestro + ",que imparte la clase de" + clase_asistida + ", ha dejado este comentario: " + comentario + '}';
    }

}

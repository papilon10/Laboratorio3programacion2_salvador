/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio3programacion2_salvador;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Apple fila2 asiento2
 */
public class Laboratorio3programacion2_salvador {

    /**
     * @param args the command line arguments
     */
    public static Scanner str = new Scanner(System.in);
    public static Scanner lea = new Scanner(System.in);
    public static ArrayList<resena> lista_resena = new ArrayList<>();
    public static ArrayList lista = new ArrayList();
    public ArrayList<clases> clases = new ArrayList();

    alumnos a = new alumnos("civil", 12212233, "darwin", "darwizzy11", "123456");
    alumnos b = new alumnos("marketing", 12212244, "daniela", "danig_az", "hola09");
    maestros x = new maestros("licenciado historia", "alfredo", "juan1978", "sabiduria");
    maestros y = new maestros("doctor quimico", "ana", "doc_anita", "medicina2000");
    
    
    

    public static void main(String[] args) {
        System.out.println("--bienvenido al menu--");
        System.out.println("1.Iniciar sesion");
        System.out.println("2.Salir");
        System.out.println("\n\nIngrese opcion:");
        int opc_login = lea.nextInt();
        boolean salida = false;
        if (opc_login == 1) {
            do {

            } while (salida != true);

        } else if (opc_login == 2) {
            salida = true;
            System.out.println("se abandonara el menu...");
        } else {
            System.out.println("opcion ingresada es invalida...");
        }
        
        
        clases.add(new Clase("Álgebra", facultad. "FI1234"));
 clases.add(new Clase("Cálculo", Facultad.INGENIERIAS, "FI1235"));
 clases.add(new Clase("Programación", Facultad.INGENIERIAS,
"FI1236"));
 clases.add(new Clase("Física", Facultad.INGENIERIAS, "FI1237"));
 clases.add(new Clase("Química", Facultad.INGENIERIAS, "FI1238"));
 clases.add(new Clase("Electrónica", Facultad.INGENIERIAS,
"FI1239"));
 clases.add(new Clase("Termodinámica", Facultad.INGENIERIAS,
"FI1240"));
 // Ciencias Económicas
 clases.add(new Clase("Microeconomía", Facultad.CIENCIAS_ECONOMICAS,
"CE1234"));
 clases.add(new Clase("Macroeconomía", Facultad.CIENCIAS_ECONOMICAS,
"CE1235"));
 clases.add(new Clase("Contabilidad", Facultad.CIENCIAS_ECONOMICAS,
"CE1236"));
 clases.add(new Clase("Finanzas", Facultad.CIENCIAS_ECONOMICAS,
"CE1237"));
 clases.add(new Clase("Marketing", Facultad.CIENCIAS_ECONOMICAS,
"CE1238"));
 clases.add(new Clase("Gestión Empresarial",
Facultad.CIENCIAS_ECONOMICAS, "CE1239"));
 clases.add(new Clase("Economía Internacional",
Facultad.CIENCIAS_ECONOMICAS, "CE1240"));
 // Arte y Diseño
 clases.add(new Clase("Dibujo", Facultad.ARTE_Y_DISENO, "AD1234"));
 clases.add(new Clase("Pintura", Facultad.ARTE_Y_DISENO, "AD1235"));
 clases.add(new Clase("Escultura", Facultad.ARTE_Y_DISENO,
"AD1236"));
 clases.add(new Clase("Fotografía", Facultad.ARTE_Y_DISENO,
"AD1237"));
 clases.add(new Clase("Diseño Gráfico", Facultad.ARTE_Y_DISENO,
"AD1238"));
 clases.add(new Clase("Historia del Arte", Facultad.ARTE_Y_DISENO,
"AD1239"));
 clases.add(new Clase("Diseño de Interiores",
Facultad.ARTE_Y_DISENO, "AD1240"));
 // Ciencias de la Salud
 clases.add(new Clase("Anatomía", Facultad.CIENCIAS_DE_LA_SALUD,
"CS1234"));
 clases.add(new Clase("Fisiología", Facultad.CIENCIAS_DE_LA_SALUD,
"CS1235"));
 clases.add(new Clase("Bioquímica", Facultad.CIENCIAS_DE_LA_SALUD,
"CS1236"));
 clases.add(new Clase("Farmacología", Facultad.CIENCIAS_DE_LA_SALUD,
"CS1237"));
 clases.add(new Clase("Microbiología",
Facultad.CIENCIAS_DE_LA_SALUD, "CS1238"));
 clases.add(new Clase("Nutrición", Facultad.CIENCIAS_DE_LA_SALUD,
"CS1239"));
 clases.add(new Clase("Salud Pública",
Facultad.CIENCIAS_DE_LA_SALUD, "CS1240"));
        

    }//fin main

    public static void menu_alumnos() {

    }

}//fin clase

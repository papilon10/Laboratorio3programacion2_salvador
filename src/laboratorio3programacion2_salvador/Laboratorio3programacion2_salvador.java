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

    }//fin main

    public static void menu_alumnos() {
        System.out.println("---menu de alumnos---");
        System.out.println("1.agregar clases");
        System.out.println("2.listar clases");
        System.out.println("3.dejar una resena ");
        System.out.println("4.eliminar resena");
        System.out.println("5.salir");
        int opc_alumnos = lea.nextInt();
        boolean salida_alumnos = false;
        do {
            switch (opc_alumnos) {
                case 1: {
                    System.out.println("---agregar una clase---");
                    System.out.println("ingrese el nombre de la clase: ");
                    String clase = str.nextLine();
                    System.out.println("ingrese la seccion de la clase: ");
                    int seccion = lea.nextInt();
                    lista.add(new clases(clase, seccion));
                    System.out.println("clase agregada exitosamente...");

                }

                break;
                case 2: {
                    System.out.println("---lista de clases---");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(
                                lista.indexOf(lista.get(i)) + "-"
                                + lista.get(i)
                        );

                    }

                }

                break;
                case 3: {
                    System.out.println("---dejar una resena---");
                    System.out.println("Ingrese el nombre del alumno: ");
                    String alumno = str.nextLine();
                    System.out.println("Ingrese el nombre del maestro a que dejara la resena: ");
                    String maestro = str.nextLine();
                    System.out.println("Ingrese el nombre de la clase: ");
                    String clase_asistida = str.nextLine();
                    System.out.println("Ingrese la puntuacion: ");
                    int puntuacion = lea.nextInt();
                    System.out.println("Ingrese el comentario de la resena: ");
                    String comentario = str.nextLine();
                    lista_resena.add(new resena(alumno, maestro, clase_asistida, puntuacion, comentario));
                    System.out.println("resena creada exitosamente...");

                }

                break;
                case 4: {
                    System.out.println("---eliminar resena---");
                    for (int i = 0; i < lista_resena.size(); i++) {
                        System.out.println(
                                lista_resena.indexOf(lista_resena.get(i)) + "-"
                                + lista_resena.get(i)
                        );

                    }
                    System.out.println("Ingrese el indice de la resena a eliminar: ");
                    int indice = lea.nextInt();
                    lista_resena.remove(indice);
                    System.out.println("la resena se elimino exitosamente...");

                }

                break;
                case 5: {
                    salida_alumnos = true;
                    System.out.println("se saldra del menu de alumnos...");
                }
                break;
                default: {
                    System.out.println("la opcion ingresada es invalida...");
                }

            }

        } while (salida_alumnos
                != true);

    }//fin menu alumnos

    public static void menu_maestros() {
        System.out.println("---menu de meastros---");
        System.out.println("1.agregar clases");
        System.out.println("2.listar clases");
        System.out.println("3.leer una resena ");
        System.out.println("4.salir");
        int opc_maestros = lea.nextInt();
        boolean salida_maestros = false;
        do {
            switch (opc_maestros) {
                case 1: {
                    System.out.println("---agregar una clase---");
                    System.out.println("ingrese el nombre de la clase: ");
                    String clase = str.nextLine();
                    System.out.println("ingrese la seccion de la clase: ");
                    int seccion = lea.nextInt();
                    lista.add(new clases(clase, seccion));
                    System.out.println("clase agregada exitosamente...");

                }

                break;
                case 2: {
                    System.out.println("---lista de clases---");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(
                                lista.indexOf(lista.get(i)) + "-"
                                + lista.get(i)
                        );

                    }

                }

                break;
                case 3: {
                    System.out.println("---lista de resenas---");
                    for (int i = 0; i < lista_resena.size(); i++) {
                        System.out.println(
                                lista_resena.indexOf(lista_resena.get(i)) + "-"
                                + lista_resena.get(i)
                        );

                    }

                }

                break;
                case 4: {
                    salida_maestros = true;
                    System.out.println("se saldra del menu de maestros...");
                }

                break;

                default: {
                    System.out.println("la opcion ingresada es invalida...");
                }

            }

        } while (salida_maestros != true);

    }//fin menu maestros

}//fin clase

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_de_datos;

import java.util.Scanner;

/**
 *
 * @author lenin
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    static int eleccion;
    static String nombre;
    static int id;
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws Exception {
        Menu1();
        }
    public static void Menu1 () throws Exception {
        System.out.println("Seleccione como quiere ingresar: \nComo alumno (1)\nComo catedrático (2)");
        eleccion = sc.nextInt();
        if (eleccion == 1){
            MenuAlumno();
        } else if (eleccion == 2){
            MenuCatedratico();
        }
}
    
    public static void MenuAlumno(){
        System.out.println("Seleccione que quiere realizar: \nRegistrar (1)\nModificar (2)\nElminar (3)\nListar (4)");
        eleccion = sc.nextInt();
        if (eleccion == 1){
            MenuAlumno.RegistrarAlumno();
        } else if (eleccion == 2){
            MenuAlumno.ModificarAlumno();
        } else if (eleccion == 3){
            MenuAlumno.EliminarAlumno();
        } else if (eleccion == 4){
            MenuAlumno.ListarAlumno();
        }
    }
    public static void MenuCatedratico(){
        System.out.println("Seleccione que quiere realizar: \nRegistrar (1)\nModificar (2)\nElminar (3)\nListar (4)");
        eleccion = sc.nextInt();
        if (eleccion == 1){
            MenuCatedratico.RegistrarCatedratico();
        } else if (eleccion == 2){
            MenuCatedratico.ModificarCatedratico();
        } else if (eleccion == 3){
            MenuCatedratico.EliminarCatedratico();
        } else if (eleccion == 4){
            MenuCatedratico.ListarCatedratico();
        }
    }
    
}
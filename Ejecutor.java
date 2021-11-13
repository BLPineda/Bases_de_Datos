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
            RegistrarAlumno();
        } else if (eleccion == 2){
            ModificarAlumno();
        } else if (eleccion == 3){
            EliminarAlumno();
        } else if (eleccion == 4){
            ListarAlumno();
        }
    }
    public static void MenuCatedratico(){
        System.out.println("Seleccione que quiere realizar: \nRegistrar (1)\nModificar (2)\nElminar (3)\nListar (4)");
    }
    public static void RegistrarAlumno(){
        System.out.println("Ingrese el nombre que desea registrar");
        nombre = sc.next();
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        try {
            InterfazDAO dao = new DAOIMPL();
            dao.registrar(alumno);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("¿Desea realizar otra acción?\nSí (1)\nNo(2)");
        eleccion = sc.nextInt();
        
        if (eleccion == 1){
            MenuAlumno();
        }
            
    }
    public static void ModificarAlumno(){
        System.out.println("Ingrese el id que desea modificar");
        id = sc.nextInt();
        System.out.println("Ingrese el nombre por el que lo desea modificar");
        nombre = sc.next();
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setId(id);
        try {
            InterfazDAO dao = new DAOIMPL();
              dao.modificar(alumno);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("¿Desea realizar otra acción?\nSí (1)\nNo(2)");
        eleccion = sc.nextInt();
        
        if (eleccion == 1){
            MenuAlumno();
        }
    }
    public static void EliminarAlumno(){
        System.out.println("Ingrese el id que desea eliminar");
        id = sc.nextInt();
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setId(id);
        try {
            InterfazDAO dao = new DAOIMPL();
              dao.eliminar(alumno);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("¿Desea realizar otra acción?\nSí (1)\nNo(2)");
        eleccion = sc.nextInt();
        
        if (eleccion == 1){
            MenuAlumno();
        }
    }
    public static void ListarAlumno(){
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setId(id);
        try {
            InterfazDAO dao = new DAOIMPL();
                for(Alumno listado : dao.listar()){
                    System.out.println(listado.getNombre());
                }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("¿Desea realizar otra acción?\nSí (1)\nNo(2)");
        eleccion = sc.nextInt();
        
        if (eleccion == 1){
            MenuAlumno();
        }
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_de_datos;

import static Base_de_datos.Ejecutor.MenuAlumno;
import static Base_de_datos.Ejecutor.eleccion;
import static Base_de_datos.Ejecutor.id;
import static Base_de_datos.Ejecutor.nombre;
import static Base_de_datos.Ejecutor.sc;

/**
 *
 * @author lenin
 */
public class MenuAlumno {
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
            Ejecutor.MenuAlumno();
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
            Ejecutor.MenuAlumno();
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
            Ejecutor.MenuAlumno();
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
           Ejecutor.MenuAlumno();
        }
    }
}

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
public class MenuCatedratico {
 public static void RegistrarCatedratico(){
        System.out.println("Ingrese el nombre que desea registrar");
        nombre = sc.next();
        Catedratico profesor = new Catedratico();
        profesor.setNombre(nombre);
        try {
            InterfazDAO dao = new DAOIMPL();
            dao.registrar(profesor);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("¿Desea realizar otra acción?\nSí (1)\nNo(2)");
        eleccion = sc.nextInt();
        
        if (eleccion == 1){
            Ejecutor.MenuCatedratico();
        }
            
    }
    public static void ModificarCatedratico(){
        System.out.println("Ingrese el id que desea modificar");
        id = sc.nextInt();
        System.out.println("Ingrese el nombre por el que lo desea modificar");
        nombre = sc.next();
        Catedratico profesor = new Catedratico();
        profesor.setNombre(nombre);
        profesor.setId(id);
        try {
            InterfazDAO dao = new DAOIMPL();
              dao.modificar(profesor);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("¿Desea realizar otra acción?\nSí (1)\nNo(2)");
        eleccion = sc.nextInt();
        
        if (eleccion == 1){
            Ejecutor.MenuCatedratico();
        }
    }
    public static void EliminarCatedratico(){
        System.out.println("Ingrese el id que desea eliminar");
        id = sc.nextInt();
        Catedratico profesor = new Catedratico();
        profesor.setNombre(nombre);
        profesor.setId(id);
        try {
            InterfazDAO dao = new DAOIMPL();
              dao.eliminar(profesor);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("¿Desea realizar otra acción?\nSí (1)\nNo(2)");
        eleccion = sc.nextInt();
        
        if (eleccion == 1){
            Ejecutor.MenuCatedratico();
        }
    }
    public static void ListarCatedratico(){
        Catedratico profesor = new Catedratico();
        profesor.setNombre(nombre);
        profesor.setId(id);
        try {
            InterfazDAO dao = new DAOIMPL();
                for(Catedratico listar : dao.listado()){
                    System.out.println(listar.getNombre());
                }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("¿Desea realizar otra acción?\nSí (1)\nNo(2)");
        eleccion = sc.nextInt();
        
        if (eleccion == 1){
            Ejecutor.MenuCatedratico();
        }
    }
}

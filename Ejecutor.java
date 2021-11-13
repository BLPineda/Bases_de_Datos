/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_de_datos;

/**
 *
 * @author lenin
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Alumno alumno = new Alumno();
        alumno.setNombre("Carlos");
        alumno.setId(1);
        try {
            InterfazDAO dao = new DAOIMPL();
//            dao.registrar(alumno);
              dao.modificar(alumno);
        } catch (Exception e){
            System.out.println(e.getMessage());
    }
    
}
}
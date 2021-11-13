/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_de_datos;

import DAO.DAOIMPL;
import DAO.InterfazDAO;
import Modelo.Alumno;

/**
 *
 * @author lenin
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Alumno student = new Alumno();
        student.setId(1);
        student.setNombre("Carlos");
        try {
            InterfazDAO dao = new DAOIMPL();
//            dao.registrar(student);
              dao.modificar(student);
        } catch (Exception e){
            System.out.println(e.getMessage());
    }
    
}
}
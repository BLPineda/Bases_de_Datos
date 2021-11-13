/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_de_datos;

import Base_de_datos.BaseDeDatos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenin
 */
public class DAOIMPL extends BaseDeDatos implements InterfazDAO {

    @Override
    public void registrar(Alumno alumno) throws Exception {
        try{
        this.EstablerConexion();
        PreparedStatement st = this.conectar.prepareStatement("insert into Ejercicio (nombre) values (?);");
        st.setString(1, alumno.getNombre());
        st.executeUpdate();
        } catch (Exception e){
        throw e;
        }finally {
        this.cerrar();
        }
    }

    @Override
    public void modificar(Alumno alumno) throws Exception {
        try{
        this.EstablerConexion();
        PreparedStatement st = this.conectar.prepareStatement("update alumno set nombre = ? where id = ?");
        st.setString(1, alumno.getNombre());
        st.setInt(2, alumno.getId());
        st.executeUpdate();
        } catch (Exception e){
        throw e;
        }finally {
        this.cerrar();
        }
    }

    @Override
    public void eliminar(Alumno alumno) throws Exception {
        try{
        this.EstablerConexion();
        PreparedStatement st = this.conectar.prepareStatement("delete from alumno where id = ? ");
        st.setInt(1, alumno.getId());
        st.executeUpdate();
        } catch (Exception e){
        throw e;
        }finally {
        this.cerrar();
        }
    }

    @Override
    public List<Alumno> listar() throws Exception {
        List <Alumno> lista = new ArrayList();
        try{
        this.EstablerConexion();
        PreparedStatement st = this.conectar.prepareStatement("select * from Ejercicio");
        ResultSet rs = st.executeQuery();
        while (rs.next()){
            Alumno alumn = new Alumno();
            alumn.setId(rs.getInt("id"));
            alumn.setNombre(rs.getString("nombre"));
            lista.add(alumn);
        }
        rs.close();
        st.close();
        st.executeUpdate();
        } catch (Exception e){
        throw e;
        }finally {
        this.cerrar();
        }
        return lista;
    }



}

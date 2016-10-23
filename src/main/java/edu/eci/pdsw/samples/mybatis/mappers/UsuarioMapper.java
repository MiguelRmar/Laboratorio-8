/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.mybatis.mappers;

import edu.eci.pdsw.samples.entities.Usuario;
import java.sql.Date;
import org.apache.ibatis.annotations.Param;
/**
 *
 * @author miguel
 */
public interface UsuarioMapper {
    /**
     * Cargar un usuario
     * @param email del usuario
     * @param nombre del usuario
     * @return 
     */
    public Usuario loadPacienteById(@Param("emailUsuario")String email,@Param("nombreUsuario") String nombre);

    /**
     * Insertar un nuevo usuario
     * @param u el objeto usuario
     */
    public void insertUsuario(@Param("usu")Usuario u);
    
    /**
     * Insertar un comnetario asociado a un usuario
     * @param usu el usuario
     * @param cont contenido del comentario
     * @param fecha fecha del comentario
     */
    public void insertComentario(@Param("autor")Usuario usu,@Param("contenido")String cont,@Param("fecha")Date fecha);
        
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.mybatis;

import edu.eci.pdsw.samples.entities.Usuario;
import edu.eci.pdsw.samples.persistence.DaoUsuario;
import edu.eci.pdsw.samples.persistence.PersistenceException;

/**
 *
 * @author miguel
 */
public class MYBATISDAOUsuario implements DaoUsuario {

    @Override
    public Usuario load(String email, String name) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Usuario u) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Usuario u) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

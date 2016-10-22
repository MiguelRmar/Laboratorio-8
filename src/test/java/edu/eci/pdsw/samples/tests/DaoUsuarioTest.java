/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.tests;

import edu.eci.pdsw.samples.entities.Usuario;
import edu.eci.pdsw.samples.persistence.DaoFactory;
import edu.eci.pdsw.samples.persistence.DaoUsuario;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import junit.framework.Assert;

/**
 *
 * @author miguel
 */
public class DaoUsuarioTest {
    /*
    CLASE DE EQUIVALENCIA 1:Usuario nuevo
    TIPO: NORMAL
    SE ESPERA UN ERROR:SI() NO(X)
    
    CLASE DE EQUIVALENCIA 1:Usuario que fue previamente registrado
    TIPO: NORMAL
    SE ESPERA UN ERROR:SI(X) NO()
    */
    
    public void UsuarioNuevotest() throws IOException, PersistenceException{
        InputStream input = null;
        input = ClassLoader.getSystemResourceAsStream("applicationconfig_test.properties");
        Properties properties=new Properties();
        properties.load(input);
        DaoFactory daof=DaoFactory.getInstance(properties);
        try{
            daof.beginSession();
            Usuario u = new Usuario("david.reina@escuelaing.edu.co", "David Reina");
            DaoUsuario daoU= daof.getDaoUsuario();
            daoU.save(u);
            Usuario u2 = daoU.load("david.reina@escuelaing.edu.co", "David Reina");
            daof.commitTransaction();
            daof.endSession();
            Assert.assertEquals("Los Usuarios no coinciden con la busqueda",u,u2);
        }catch (Exception e){
            daof.commitTransaction();
            daof.endSession();
            Assert.assertFalse("Fallo al momento se hacer la consulta SQL",true);
        }
    }
    
    public void UsuarioExistentetest() throws IOException, PersistenceException{
        InputStream input = null;
        input = ClassLoader.getSystemResourceAsStream("applicationconfig_test.properties");
        Properties properties=new Properties();
        properties.load(input);
        DaoFactory daof=DaoFactory.getInstance(properties);
        try{
            daof.beginSession();
            Usuario u = new Usuario("david.reina@escuelaing.edu.co", "David Reina");
            DaoUsuario daoU= daof.getDaoUsuario();
            daoU.save(u);
            Usuario u2 = new Usuario("david.reina@escuelaing.edu.co", "David Reina");
            daoU.save(u2);
            daof.commitTransaction();
            daof.endSession();
            Assert.assertEquals("El Usuario ya existe",u,u2);
        }catch (Exception e){
            daof.commitTransaction();
            daof.endSession();
            Assert.assertFalse("Fallo al momento se hacer la consulta SQL",true);
        }
    }
}

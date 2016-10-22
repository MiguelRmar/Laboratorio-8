
package edu.eci.pdsw.samples.persistence.jdbcimpl;

//import com.mysql.fabric.proto.xmlrpc.ResultSetParser;
import edu.eci.pdsw.samples.entities.Usuario;
import edu.eci.pdsw.samples.persistence.DaoUsuario;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel
 */
public class JDBCDaoUsuario implements DaoUsuario {

    Connection con;

    public JDBCDaoUsuario(Connection con) {
        this.con = con;
    }
        
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

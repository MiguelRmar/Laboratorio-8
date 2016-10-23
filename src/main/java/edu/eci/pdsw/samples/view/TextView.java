/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.view;

import edu.eci.pdsw.samples.persistence.DaoFactory;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author miguel
 */
public class TextView {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, PersistenceException {
        
        InputStream input = null;
        input = ClassLoader.getSystemResourceAsStream("applicationconfig.properties");
        Properties properties=new Properties();
        properties.load(input);
        
        DaoFactory daof=DaoFactory.getInstance(properties);
        
        /**
         * OPERACIONES CON LOS DAO
         */
        
        
        daof.beginSession();
        daof.commitTransaction();
        daof.endSession();
        
        
    }
    
}

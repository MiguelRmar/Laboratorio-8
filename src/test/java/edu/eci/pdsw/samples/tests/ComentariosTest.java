/*
 * Copyright (C) 2016 hcadavid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.pdsw.samples.tests;


import edu.eci.pdsw.samples.entities.Comentario;
import edu.eci.pdsw.samples.entities.Usuario;
import edu.eci.pdsw.samples.services.ExcepcionServiciosForos;
import edu.eci.pdsw.samples.services.ServiciosForo;
import java.sql.Date;
import static jdk.nashorn.internal.objects.NativeRegExp.test;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hcadavid
 */
public class ComentariosTest {
    
    public ComentariosTest() {

/*
        CLASES DE EQUIVALENCIA:
        
        CLASE DE EQUIVALENCIA1 : CUANDO VAMOS A VERIFICAR QUE AL MOMENTO DE REGISTRAR UNA RESPUESTA 
        EL USUARIO EXISTA
        TIPO: NORMAL
        SE ESPERE UN ERROR: SI() NO(X)
        
        CLASE DE EQUIVALENCIA 2: CUANDO AL MOMENTO DE ESCRIBIR LA RESPUESTA AL FORO  INSTRODUCIMOS UNA FECHA MENOR 
        A LA CUAL ESTA EL FORO CREADO
        TIPO: DE FRONTERA
        SE ESPERA UN ERROR: SI(X) NO(X)
        
        CLASE DE EQUIVALENCIA 3: CUANDO AL MOMENTO DE REGISTRAR LA RESPUESTA AL FORO  INSTRODUCIMOS UN COMENTARIO ERRONEO
        TIPO: NORMAL
        SE ESPERA UN ERROR: SI() NO(X)
        
        CLASE DE EQUIVALENCIA 4:ELUSUARIO QUE AGREGA ELCOMENTARIO TIENE UNA FECHA ACTUAL
        TIPO: NORMAL
        SE ESPERA UN ERROR:SI() NO(X)
         
        */
    }
    private ServiciosForo crear;
    
    @Before
    public void setUp() {
        crear = crear.getInstance();
        
    }
    

    
    @Test
    public void UsuarioTest(){
      int identificador=1;
        try {
            crear.consultarEntradaForo(identificador);
            fail();
        } catch (ExcepcionServiciosForos e) {
            assertTrue("El usuario no coincide con el identificador"+ identificador, true);
        }
                
    }
    
    
}

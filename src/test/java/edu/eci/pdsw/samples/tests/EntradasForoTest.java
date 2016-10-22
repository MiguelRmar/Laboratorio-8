/*
 * Copyright (C) 2015 hcadavid
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

import edu.eci.pdsw.samples.entities.EntradaForo;
import edu.eci.pdsw.samples.entities.Usuario;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hcadavid
 */
public class EntradasForoTest {
    
    /*
    CLASES DE EQUIVALENCIA:
    
    CLASE 1: CUANDO SE INGRESA UN USUARIO INVALIDO
    TIPO: (NORMAL)
    SE ESPERA UN ERROR: SI(X) NO()
    
    CLASE 2: EL IDENTIFICADOR NO ES UN NUMERO
    TIPO: (NORMAL)
    SE ESPERA UN ERROR: SI(X) NO()
    */
    
    public EntradasForoTest() {
    }
    
    @Before
    public void setUp() {
    }
    
       
    
    @Test
    public void EntradaForoTest(){
        Usuario usu = new Usuario("usuario@algo.com","usuario1");
        Date dt = new Date(2016,10,22);
        EntradaForo entF = new EntradaForo(1,usu,"primera entrada","TituloPrueba",dt);
        String comentario = entF.getComentario();
        
        assertEquals("No logro entrar al foro","primera entrada", comentario);
    }
    
}

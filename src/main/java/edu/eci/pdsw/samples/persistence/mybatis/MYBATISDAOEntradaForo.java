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
package edu.eci.pdsw.samples.persistence.mybatis;

import edu.eci.pdsw.samples.entities.Comentario;
import edu.eci.pdsw.samples.entities.EntradaForo;
import edu.eci.pdsw.samples.entities.Usuario;
import edu.eci.pdsw.samples.mybatis.mappers.EntradaForoMapper;
import edu.eci.pdsw.samples.persistence.DaoEntradaForo;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author hcadavid
 */
public class MYBATISDAOEntradaForo implements DaoEntradaForo{

    private EntradaForoMapper currentSession=null;

    public MYBATISDAOEntradaForo(SqlSession session) {
        this.currentSession=session.getMapper(EntradaForoMapper.class);
    }
        
    @Override
    public EntradaForo load(int id) throws PersistenceException {
        return currentSession.getEntradaForo(id);
    }

    @Override
    public List<EntradaForo> loadAll() throws PersistenceException {
        return currentSession.getEntradasForo();
    }

    @Override
    public void save(EntradaForo e) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(EntradaForo e) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addToForo(int idForo, Comentario c) throws PersistenceException {
        currentSession.agregarComentarioAEntradaForo(idForo, c);
    }
    
}

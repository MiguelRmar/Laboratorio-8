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
package edu.eci.pdsw.samples.persistence;

import edu.eci.pdsw.samples.entities.Comentario;
import edu.eci.pdsw.samples.entities.EntradaForo;
import edu.eci.pdsw.samples.entities.Usuario;
import java.util.List;

/**
 *
 * @author hcadavid
 */
public interface DaoEntradaForo {
 
    public EntradaForo load(int id) throws PersistenceException;
    
    public List<EntradaForo> loadAll() throws PersistenceException;
    
    public void save(EntradaForo e) throws PersistenceException;
    
    public void update(EntradaForo e) throws PersistenceException;
    
    public void addToForo(int idForo,Comentario c) throws PersistenceException;
    
}

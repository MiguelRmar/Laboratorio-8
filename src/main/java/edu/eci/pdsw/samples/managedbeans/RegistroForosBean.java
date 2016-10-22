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
package edu.eci.pdsw.samples.managedbeans;


import edu.eci.pdsw.samples.entities.Comentario;
import edu.eci.pdsw.samples.entities.EntradaForo;
import edu.eci.pdsw.samples.entities.Usuario;
import edu.eci.pdsw.samples.services.ExcepcionServiciosForos;
import edu.eci.pdsw.samples.services.ServiciosForo;
import java.util.List;
import java.io.Serializable;
import java.sql.Date;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author hcadavid
 */

@ManagedBean
@SessionScoped
public class RegistroForosBean implements Serializable{
    
    
    private int idForo;
    private String NombreForo;
    private String PreguntaForo;
    private Set<Comentario> respuestas;
    private Usuario usu = new Usuario("david.reina@mail.escuelaing.edu.co","Miguel Rojas");
    private Comentario com;
    private String comentario;
    private EntradaForo Foro;
    private String titulo;
    
    
    public void setForo(EntradaForo Foro){
        this.Foro = Foro;
        
    }
    
    public EntradaForo getForo(){
        return Foro;
    }
    
    public int getIdForo(){
        return this.idForo;
    }
    
    public void setIdForo(int num){
        this.idForo = num;
    }
    
    public List<EntradaForo> getForos() throws ExcepcionServiciosForos{
        return ServiciosForo.getInstance().consultarEntradasForo();
    }
    
    public void newForo() throws ExcepcionServiciosForos{
        ServiciosForo.getInstance().registrarNuevaEntradaForo(new EntradaForo(idForo++, usu, comentario, titulo, java.sql.Date.valueOf("2016-09-27")));
        this.titulo = null;
        this.comentario = null;
    }
    
    public String getTituloForo() throws ExcepcionServiciosForos{
        return ServiciosForo.getInstance().consultarEntradaForo(idForo).getTitulo();
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setTitulo(String tit){
        this.titulo=tit;
    }
    
    public String getPregunta() throws ExcepcionServiciosForos{
        return ServiciosForo.getInstance().consultarEntradaForo(idForo).getComentario();
    }
    
    public void setNombreForo(String nombre){
        this.NombreForo = nombre;
    }
    
    public String getNombreForo(){
        return this.NombreForo;
    }
    
    public void setPreguntaForo(String pregunta){
        this.PreguntaForo = pregunta;
    }
    
    public String getPreguntaForo(){
        return this.PreguntaForo;
    }
    
    public Set<Comentario> getRespuestasForo() throws ExcepcionServiciosForos {
        respuestas = ServiciosForo.getInstance().consultarEntradaForo(idForo).getRespuestas();
        return respuestas;
    }
     
    public String getRespuesta(){
        return this.comentario;
    }
     
    public void setRespuesta(String comentarioI){
        this.comentario = comentarioI;
    }
    
    public void agregarRespuesta() throws ExcepcionServiciosForos{
        com = new Comentario(usu, comentario,java.sql.Date.valueOf("2016-09-27"));
        ServiciosForo.getInstance().agregarRespuestaForo(idForo, com);
        respuestas = ServiciosForo.getInstance().consultarEntradaForo(idForo).getRespuestas();
        comentario = null;
    }
}

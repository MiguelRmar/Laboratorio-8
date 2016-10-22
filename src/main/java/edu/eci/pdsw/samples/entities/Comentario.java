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
package edu.eci.pdsw.samples.entities;

import java.sql.Date;

/**
 *
 * @author hcadavid
 */
public class Comentario  {

    private Usuario autor;
    
    private String contenido;
    
    private Date fechayHora;

    public Comentario() {
    }

    public Comentario(Usuario autor, String contenido, Date fechayHora) {
        this.autor = autor;
        this.contenido = contenido;
        this.fechayHora = fechayHora;
    }

    public Usuario getAutor() {
        return autor;
    }

    public String getContenido() {
        return contenido;
    }

    public Date getFechayHora() {
        return fechayHora;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setFechayHora(Date fechayHora) {
        this.fechayHora = fechayHora;
    }

    @Override
    public String toString() {
        return "Comentario{" + "autor=" + autor + ", contenido=" + contenido + ", fechayHora=" + fechayHora + '}';
    }
 
    
    
    
}

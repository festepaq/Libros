/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author ESTUDIANTE
 */
public class Libro {
    
String  titulo, autor;
int paginas, calificacion;

    public Libro(String titulo, String autor, int paginas, int calificacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.calificacion = calificacion;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
public void CrearLibro(){
 this.autor= autor;
 this.paginas=paginas;
 this.calificacion=calificacion;
 this.titulo=titulo;
         
} 

public void EliminarLibro(){
    
} 


}

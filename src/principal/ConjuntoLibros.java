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
public class ConjuntoLibros {
private Libro libros[];
int contador;

    public ConjuntoLibros() {
        this.libros = new Libro[10];
           this.contador = 0;
            }
    
    
public boolean CrearLibro(String a, String b, int c, int d){
 this.libros[contador]= new Libro(a,b,c,d);
 contador++;
 
}

public boolean BorrarLibroAutor( String autor){

    for(int i=0; i<this.libros.length;i++){
    String a= libros[i].getAutor();
      if(autor.equals(a) ){
    libros[i]= null;      
      }  
    }
    
}
public void BorrarLibroTitulo(String titulo){

    for(int i=0; i<this.libros.length;i++){
    String a= libros[i].getTitulo();
      if(titulo.equals(a)){
    libros[i]= null;      
      }  
    }

}

public void listarClasificacion(){
    
    
    
    
}


}

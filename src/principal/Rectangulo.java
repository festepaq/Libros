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
public class Rectangulo {
    
private float base, altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
        
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }
    

    public void setAltura(float altura) {
        this.altura = altura;
    }

public float calculaArea(){
 float area=  this.altura * this.base;  
 return area;   
}

public float calculaPerimetro(){
 float perimetro=  (this.altura*2)+ ( 2*this.base);  
 return perimetro;   
}





    
}

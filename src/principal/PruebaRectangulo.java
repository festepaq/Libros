package principal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author ESTUDIANTE
 */
public class PruebaRectangulo {
private Rectangulo ci;

    public static void main(String[] args) {
    Scanner lectura= new Scanner(System.in);    
  
 System.out.println("Ingrese base");
 float b= lectura.nextFloat();
  System.out.println("Ingrese altura");
 float c= lectura.nextFloat();
 
 Rectangulo r1=new Rectangulo(b,c);
  
  
 System.out.println("El rectagulo tiene un area "+ r1.calculaArea()+" y perimetro"+r1.calculaPerimetro());
        
        
        
    }
      
    
}

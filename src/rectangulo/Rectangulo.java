/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

/**
 *
 * @author sedelgadog
 */
public class Rectangulo {

private double base;
private double altura;
public Rectangulo(int b, int h){
    this.base = b;
    this.altura = h;
            
}
 public double arearectangulo(){
    double h;
    h = this.base*this.altura;
    return h;  
 }   
  public double perimetrorectangulo(){
    double h;
    h = 2*(this.base)+ 2*(this.altura);
    return h;  
 }
  
  
}


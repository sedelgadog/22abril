/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;


public class PruebaRectangulo {
    public static void main(String[] args) {
        Rectangulo R1 = new Rectangulo(7,5);
        Rectangulo R2 = new Rectangulo(67,20);
        double area = R1.arearectangulo();
        double perimetro = R1.perimetrorectangulo();
        double area1 = R2.arearectangulo();
        double perimetro1 = R2.perimetrorectangulo();
        System.out.println("area " + area);
        System.out.println("perimetro " + perimetro);
         System.out.println("area " + area1);
        System.out.println("perimetro " + perimetro1);
    }
}

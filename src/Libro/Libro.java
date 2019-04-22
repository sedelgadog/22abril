/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

/**
 *
 * @author sedelgadog
 */
public class Libro {
    private String titulo;
    
    private Autor autor;
    private int paginas;
    private int calificacion;
    public Libro(String t, int p, int c, Autor a){
        this.calificacion = c;
        this.paginas = p;
        this.titulo = t;
        this.autor = a;
        
    }

    public Autor getAutor() {
        return autor;
    }
    
    
}

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
public class ConjuntoLibro {
    private Libro[] coleccion ;
    public ConjuntoLibro(){
        this.coleccion = new Libro[10];
    }
    public boolean añadir(Libro libro1){
        
        for(int i = 0; i<10 ; i++){
            if(this.coleccion[i] == null){
                this.coleccion[i] = libro1;
                return true;
            }
        }return false;
    }

     public boolean eliminarautor(String nombre, String apellido ){
        for(int i = 0; i<10 ; i++){             
            if(coleccion[i].getAutor().getNombre()== nombre && coleccion[i].getAutor().getApellido() == apellido ){
                return true;
}}return false;


}}

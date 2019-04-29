/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Familia;

/**
 *
 * @author sedelgadog
 */
public class familia {
      private persona[] coleccion ;
      private int t;
    public familia(int t){
        this.coleccion = new persona[t];
    }
    public void addpersona(String a, String b, String c, int d, String e){
        
         for(int i = 0; i<t ; i++){ 
     persona f = new persona(a,b,c,d,e);
     f = coleccion[i];
        
        
    }


}
     public void consultarfamilia(String apellido){
     
     }





}

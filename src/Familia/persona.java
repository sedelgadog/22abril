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
public class persona {
    String rol;
    String nombre;
    String apellido;
    int edad;
    String sexo;

    public persona(String rol, String nombre, String apellido, int edad, String sexo) {
        this.rol = rol;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getRol() {
        return rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }
    
    
}

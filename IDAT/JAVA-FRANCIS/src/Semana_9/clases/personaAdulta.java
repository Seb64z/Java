/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_9.clases;

/**
 *
 * @author Sebas
 */
public class personaAdulta {
    private String nombre;
    private int edad;

    public personaAdulta(String nombre, int edad) throws Exception {
        this.nombre = nombre;
        this.edad = edad;
        if(edad<18){
            throw new Exception(nombre+"no es una persona adulta");
        }
    }
    
    public String mostrarDatos(){
        String cadena = "Nombre: "+nombre;
        cadena += "\nEdad: "+ edad;
        return cadena;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_5.clases;

/**
 *
 * @author Sebas
 */
public class persona {

    public String nombre,apellido;
    public int edad;
    public double estatura,peso;
    
    public String validarEdad(){
        if(edad<18){
            return "Menor de edad";
        }else {
            return "Mayor de edad";
        }   
    }
    public double calcularMasa(){
        return peso/Math.pow(estatura,2);
    }
    
}

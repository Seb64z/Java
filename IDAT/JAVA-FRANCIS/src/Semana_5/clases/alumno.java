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
public class alumno {
    public int codigo,nota1,nota2;
    public String nombre;
    
    public double calcularPromedio(){
        return (nota1+nota2)/2;
    }
    public String obtenerCondicion(){
        double promedio = calcularPromedio();
        if (promedio>=13){
            return "Aprobado";
        }else {
            return "Desaprobado";
        }
    }
}

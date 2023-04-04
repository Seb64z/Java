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
public class numeros {
    public int numero1, numero2, numero3;
    
    public int calcularMayor(){
        if(numero1>numero2 && numero1>numero3){
            return numero1;
        }else if(numero2>numero1 && numero2>numero3){
            return numero2;
        }else{
            return numero3;
        }
    }
    public int calcularMenor(){
        if(numero1<numero2 && numero1<numero3){
            return numero1;
        }else if(numero2<numero1 && numero2<numero3){
            return numero2;
        }else{
            return numero3;
        }
    }
    public int calcularSuma(){
        return numero1+numero2+numero3;
    }
    public int calcularPromedio(){
        return (numero1*numero2*numero3)/3;
    }
}

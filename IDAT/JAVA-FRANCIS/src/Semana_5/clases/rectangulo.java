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
public class rectangulo {
    public double base,altura;
    
    public double calcularArea(){
        return base*altura;
    }
    public double calcularPerimetro(){
        return (base+altura)*2;
    }
}

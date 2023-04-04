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
public class filmacion {
    public int codigo;
    public String titulo;
    public int minutos;
    public double soles;
    
    public double calcularDolares(){
        return soles/3.90;
    }
}

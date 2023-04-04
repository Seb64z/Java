/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_8.padre;

/**
 *
 * @author Sebas
 */
public abstract class poliedro {
    protected double largo, ancho;

    public poliedro(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    public String mostrarDimensiones(){
        String cadena = "Largo: "+largo;
        cadena += "\nAncho"+ancho;
        return cadena;
    }
    public double calcularAreaB(){
        return largo*ancho;
    }
    public abstract String mostrarTipo();
    public abstract double calcularVolumen();
}

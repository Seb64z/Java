/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_8.hijo;

import Semana_8.padre.poliedro;

/**
 *
 * @author Sebas
 */
public class caja extends poliedro{
    private double alto;

    public caja(double alto, double largo, double ancho) {
        super(largo, ancho);
        this.alto = alto;
    }
    @Override
    public String mostrarDimensiones(){
        String cadena = super.mostrarDimensiones();
        cadena += "\nAlto: "+alto;
        return cadena;
    }

    @Override
    public String mostrarTipo() {
        return "Caja";
        
    }

    @Override
    public double calcularVolumen() {
        return calcularAreaB()*alto;
    }
    
}

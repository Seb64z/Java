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
public class cubo extends poliedro{
    private double lado;

    public cubo(double lado) {
        super(lado, lado);
        this.lado = lado;
    }
    @Override
    public String mostrarDimensiones(){
        return "\nLado"+lado;
    }

    @Override
    public String mostrarTipo() {
        return "<<< CUBO >>>";  
    }

    @Override
    public double calcularVolumen() {
        return calcularAreaB() * lado;
    }
    
}

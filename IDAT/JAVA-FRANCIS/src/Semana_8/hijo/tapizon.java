/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_8.hijo;

import Semana_8.padre.producto;

/**
 *
 * @author Sebas
 */
public class tapizon extends producto{
    public int metros;
    public double precio;

    public tapizon(int metros, double precio, int codigo, String detalle) {
        super(codigo, detalle);
        this.metros = metros;
        this.precio = precio;
    }
    // Setters y getters
    public int getMetros() {
        return metros;
    }
    public void setMetros(int metros) {
        this.metros = metros;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //Proceso
    public double calcularFactura(){
        return metros*precio;
    }
    
}

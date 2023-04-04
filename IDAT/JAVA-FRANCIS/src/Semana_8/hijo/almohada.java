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
public class almohada extends producto{
    private int cantidad;
    private double precio;

    public almohada(int cantidad, double precio, int codigo, String detalle) {
        super(codigo, detalle);
        this.cantidad = cantidad;
        this.precio = precio;
    }
    // Setters y getters
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    // Proceso
    public double calcularPagar(){
        return precio*cantidad;
    }
}

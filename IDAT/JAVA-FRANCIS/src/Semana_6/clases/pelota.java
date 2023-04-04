/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_6.clases;

/**
 *
 * @author Sebas
 */
public class pelota {
    private String marca;
    private double pesoG, presionL,diametroC, precio;
    //Constructor
    public pelota(String marca, double pesoG, double presionL, double diametroC, double precio) {
        this.marca = marca;
        this.pesoG = pesoG;
        this.presionL = presionL;
        this.diametroC = diametroC;
        this.precio = precio;
    }
    //Setters y getters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPesoG() {
        return pesoG;
    }

    public void setPesoG(double pesoG) {
        this.pesoG = pesoG;
    }

    public double getPresionL() {
        return presionL;
    }

    public void setPresionL(double presionL) {
        this.presionL = presionL;
    }

    public double getDiametroC() {
        return diametroC;
    }

    public void setDiametroC(double diametroC) {
        this.diametroC = diametroC;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    // Proceso
    public double calcularRadio(){
        return diametroC/2;
    }
    public double calcularVolumen(){
        return ((4/3)*Math.PI*Math.pow(calcularRadio(),3));
    }
    public double calcularDescuento(){
        return precio*0.10;
    }
    public double calcularPago(){
        return precio - calcularDescuento();
    }
}

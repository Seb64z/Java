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
public class computadora {
    private int codigo;
    private String marca, color;
    private double dolares;
    
    public computadora(int codigo, String marca, String color, double dolares) {
        this.codigo = codigo;
        this.marca = marca;
        this.color = color;
        this.dolares = dolares;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDolares() {
        return dolares;
    }

    public void setDolares(double dolares) {
        this.dolares = dolares;
    }

    public double calcularSoles(){
        return dolares*3.90;
    }
    public double calcularEuros(){
        return dolares*1.14;
    } 
        
}

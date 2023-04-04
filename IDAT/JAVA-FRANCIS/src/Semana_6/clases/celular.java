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
public class celular {
    private String numero,usuario;
    private int segundosConsumidos;
    private double precioSegundo;
    //Método constructor
    public celular(String numero, String usuario, int segundosConsumidos, double precioSegundo) {
        this.numero = numero;
        this.usuario = usuario;
        this.segundosConsumidos = segundosConsumidos;
        this.precioSegundo = precioSegundo;
    }
    //Setters y getters
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNumero() {
        return numero;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setSegundosConsumidos(int segundosConsumidos) {
        this.segundosConsumidos = segundosConsumidos;
    }
    public int getSegundosConsumidos() {
        return segundosConsumidos;
    }
    public void setPrecioSegundo(double precioSegundo) {
        this.precioSegundo = precioSegundo;
    }
    public double getPrecioSegundo() {
        return precioSegundo;
    }
    //PROCESO
    public double calcularConsumo(){
        return segundosConsumidos*precioSegundo;
    }
    public double calcularIGV(){
        return calcularConsumo()*0.18;
    }
    public double calcularTotal(){
        return calcularConsumo()+calcularIGV();
    }
    
}

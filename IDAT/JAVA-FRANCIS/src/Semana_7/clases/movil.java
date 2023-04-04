/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_7.clases;

/**
 *
 * @author Sebas
 */
public class movil {
    private String movil, nombre;
    private int segundos;
    private double precio;
    private static int cantidad;
    private static double pagoT;
    public static final double igv;
    
    static{
        cantidad = 0;
        pagoT = 0;
        igv = 0.18;
    }

    public movil(String movil, String nombre, int segundos, double precio) {
        this.movil = movil;
        this.nombre = nombre;
        this.segundos = segundos;
        this.precio = precio;
        cantidad ++; //contador
        pagoT += calcularImporteP(); //acumulador
    }
    //2do constru 2 parámetros inicialice atri número-nombre,invoco al 1ro con this, 
    //1750 los segundos y con 0.28 el precio x segundo
    public movil(String movil, String nombre) {
        this(movil,nombre,1750,0.28);
    }
    //3er constru sin parámetros-invoque al 2do con "this", 
    //“987656789” el móvil y “Juan” el nombre
    public movil() {
        this("987656789","Juan");
    }
    //Setters y getters solo de ats privados
    public String getMovil() {
        return movil;
    }
    public void setMovil(String movil) {
        this.movil = movil;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getSegundos() {
        return segundos;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //Ahora solo get de los ats de clase, porque no modifico, solo jalo data
    public static int getCantidad() {
        return cantidad;
    }
    public static double getPagoT() {
        return pagoT;
    }
    //Los procesos 
    public double calcularConsumo(){
        return segundos*precio;
    }
    public double calcularImpuesto(){
        return calcularConsumo()*igv;
    }
    public double calcularImporteP(){
        return calcularConsumo() - calcularImpuesto();
    }
    
}

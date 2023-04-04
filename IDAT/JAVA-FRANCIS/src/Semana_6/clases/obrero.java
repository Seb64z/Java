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
public class obrero {
    private int codigo,horasT;
    private String nombre;
    private double tarifa;

    public obrero(int codigo, int horasT, String nombre, double tarifa) {
        this.codigo = codigo;
        this.horasT = horasT;
        this.nombre = nombre;
        this.tarifa = tarifa;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getHorasT() {
        return horasT;
    }

    public void setHorasT(int horasT) {
        this.horasT = horasT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    
    public double calcularBruto(){
        return horasT*tarifa;
    }
    public double calcularAFP(){
        return calcularBruto()*0.10;
    }
    public double calcularEPS(){
        return calcularBruto()*0.05;
    }
    public double calcularNeto(){
        return calcularBruto()-calcularAFP()-calcularEPS();
    }
    
}

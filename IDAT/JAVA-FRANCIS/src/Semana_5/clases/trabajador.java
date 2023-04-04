/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_5.clases;

/**
 *
 * @author Sebas
 */
public class trabajador {
    public int codigo,horasT;
    public String nombre;
    public double tarifa;
    
    public double calcularBruto(){
        return horasT*tarifa;
    }
    public double calcularSALUD(){
        return 0.09*calcularBruto();
    }
    public double calcularAFP(){
        return calcularBruto()*12.5/100;
    }
    public double calcularDescuento(){
        return calcularSALUD()+calcularAFP();
    }
    public double calcularNeto(){
        return calcularBruto()-calcularDescuento();
    }
}

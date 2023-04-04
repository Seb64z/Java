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
public class Empleado {
    private int codigo;
    private String nombre, numero;
    private double sueldo;
    
    public Empleado(int codigo, String nombre, String numero, double sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numero = numero;
        this.sueldo = sueldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String validarS(){
       
        if (sueldo < 3500) {
            return "Sueldo menor a 3500";
        }else if (sueldo == 3500) {
            return "Sueldo igual a 3500";
        }else {
            return "Sueldo mayor a 3500";
        }
        
    }

}

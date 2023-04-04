/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_8.clases;

import Semana_8.interfaz.promedio;

/**
 *
 * @author Sebas
 */
public class promedioA implements promedio{
    private String codigo,nombre;
    private double ec1,ec2,ec3,ep,ef;

    public promedioA(String codigo, String nombre, double ec1, double ec2, double ec3, double ep, double ef) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ec1 = ec1;
        this.ec2 = ec2;
        this.ec3 = ec3;
        this.ep = ep;
        this.ef = ef;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getEc1() {
        return ec1;
    }
    public void setEc1(double ec1) {
        this.ec1 = ec1;
    }
    public double getEc2() {
        return ec2;
    }
    public void setEc2(double ec2) {
        this.ec2 = ec2;
    }
    public double getEc3() {
        return ec3;
    }
    public void setEc3(double ec3) {
        this.ec3 = ec3;
    }
    public double getEp() {
        return ep;
    }
    public void setEp(double ep) {
        this.ep = ep;
    }
    public double getEf() {
        return ef;
    }
    public void setEf(double ef) {
        this.ef = ef;
    }
    @Override
    public double calcularPromedio() {
        return (ec1*0.05)+(ec2*0.15)+(ec3*0.2)+(ep*0.25)+(ef*0.35);
    }
    
}

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
public class promedioB implements promedio{
    private String codigo,nombre;
    private double ec1,ec2,ep,ef,pro;

    public promedioB(String codigo, String nombre, double ec1, double ec2, double ep, double ef, double pro) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ec1 = ec1;
        this.ec2 = ec2;
        this.ep = ep;
        this.ef = ef;
        this.pro = pro;
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
    public double getPro() {
        return pro;
    }
    public void setPro(double pro) {
        this.pro = pro;
    }
    @Override
    public double calcularPromedio() {
       return (ec1*0.1)+(ec2*0.1)+(ep*0.2)+(ef*0.3)+(pro*0.3); 
    }
    
}

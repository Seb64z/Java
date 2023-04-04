/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_8.hijo;

import Semana_8.padre.persona;

/**
 *
 * @author Sebas
 */
public class docente extends persona{
    private int horas;
    private double tarifa;

    public docente(int horas, double tarifa, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.horas = horas;
        this.tarifa = tarifa;
    }

    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public double getTarifa() {
        return tarifa;
    }
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }//Calcular sueldo
    public double calcularSueldo(){
        return horas*tarifa;
    }
    @Override
    public String mostrarDatos(){ // De esa manera lo sobreescribe en lugar de crear otro
        String  cadena = super.mostrarDatos();
            cadena+= "\nHoras :"+ horas;
            cadena+= "\nTarifa :"+ tarifa;
        return cadena;
    }

    @Override
    public String identificacion() {
        return "<<DOCENTE>>";
    }
}

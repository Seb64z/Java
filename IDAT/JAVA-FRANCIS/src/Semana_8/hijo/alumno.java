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
public class alumno extends persona{
     private int nota1,nota2,nota3;
    //Cosntructor
    public alumno(int nota1, int nota2, int nota3, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad); //Esto invoca al constructor de la clase persona con todo
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    //Setters y getters
    public int getNota1() {
        return nota1;
    }
    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }
    public int getNota2() {
        return nota2;
    }
    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    public int getNota3() {
        return nota3;
    }
    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }//Calcular prom
    public double calcularPromedio(){
        return (nota1+nota2+nota3)/3.0;
    }
    @Override //Me ayuda a confirmar q el método de abajo es el mismo del clase padre
    public String mostrarDatos(){ // De esa manera lo sobreescribe en lugar de crear otro
        String  cadena = super.mostrarDatos();//Esto me trae todos los datos de persona
            cadena+= "\nNota1 :"+ nota1;
            cadena+= "\nNota2 :"+ nota2;
            cadena+= "\nNota3 :"+ nota3;
            cadena+= "\nPromedio :"+ calcularPromedio();
        return cadena;
    }

    @Override
    public String identificacion() {
        return "<<ALUMNO>>";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_8.clases;

import Semana_8.interfaz.operaciones;

/**
 *
 * @author Sebas
 */
public class arreglosNumeros implements operaciones{
    private double[]valor;
    //Se crea constructor como siempre
    public arreglosNumeros(double[] valor) {
        this.valor = valor;
    }
    //automático man uu, por que son abstractos
    @Override
    public double maximo() {
        double mayor = valor[0];
        for(int i=1;i<valor.length;i++){
            if(valor[i] > mayor){
                mayor = valor[i];
            }
        }
        return mayor;
    }

    @Override
    public double minimo() {
       double menor = valor[0];
        for(int i=1;i<valor.length;i++){
            if(valor[i] < menor){
                menor = valor[i];
            }
        }
        return menor; 
    }

    @Override
    public double suma() {
        double suma = 0;
        for(int i=1;i<valor.length;i++){
            suma += valor[i];
        }
        return suma;
    }
    
}

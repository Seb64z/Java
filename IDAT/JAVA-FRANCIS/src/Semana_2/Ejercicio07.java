/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_2;
//Realizar ejercicio para calcular porcentaje de alumnos que son hombres y mujeres de un lonsa

/**
 *
 * @author Sebas
 */
import java.util.Scanner;   

public class Ejercicio07 {
    public static void main(String [] arg){
        int hombres, mujeres;
        double porcentajeH, porcentajeM, total;
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.print("Ingresa número de hombres: ");
        hombres = ingreso.nextInt();
        System.out.print("Ingresa número de mujeres: ");
        mujeres = ingreso.nextInt();
        
        total = (hombres*1.0)+mujeres;
        
        porcentajeH = (hombres*100.0) /total;
        porcentajeM = (mujeres*100.0) /total;
        
        System.out.println("El porcentaje de Hombres es: %"+Math.round(porcentajeH*100.0)/100.0+"\n"+
                           "El porcentaje de Mujeres es: %"+Math.round(porcentajeM*100.0)/100.0);
        
        
    }
}

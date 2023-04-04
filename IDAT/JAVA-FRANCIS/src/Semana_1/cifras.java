/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_1;

/**
 *
 * @author Sebas
 */
public class cifras {
    public static void main(String[] arg){
        int numero = 2345 ,unidad,decena,centena,millar,suma;
        millar = 2345 / 1000;
        unidad = 2345 % 10;
        centena = 2345 % 1000 / 100; 
        decena = 2345 % 100 / 10;  
        
        suma = unidad+decena+centena+millar;         
        
        
        System.out.println("Millar: "+millar+"\n"+"Centena: "+centena+"\n"+
                            "Decena: "+decena+"\n"+"Unidad: "+unidad+"\n"+
                            "-----------------------"+"\n"+"Suma Total: "+suma);
    }

}

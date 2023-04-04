/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EC02.clases;

/**
 *
 * @author Sebas
 */
public class desarrollador {
    public int horas,lenguaje;
    public String dni, nombre;
    public double sueldo;
    
    
    public double calcularSueldo(){
        switch(lenguaje){
            case 0:
                return 100.0*horas;
                
            case 1:
                return 80.0*horas;
                
            case 2:
                return 75.0*horas;
                
            default:  return  50.0*horas;
        }
        }//return sueldo;
    public double calcularSeguro(){
        return (calcularSueldo()*11.75)/100;
    }
    public double calcularFondos(){
        return (calcularSueldo()*10.25)/100;
    }
    public double calcularDescuento(){
        return calcularSeguro()+calcularFondos();
    }
    public double calcularNeto(){
        return calcularSueldo()-calcularDescuento();
    }
}

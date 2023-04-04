/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_8.padre;

/**
 *
 * @author Sebas
 */
public abstract class mamifero {
    protected String nombre;
    //Constructor
    public mamifero(String nombre) {
        this.nombre = nombre;
    }
    public String mostrarMensaje(){
        return "Soy mamífero, mi nombre es : "+nombre;
    }
    // vacío siempre para que cuando lo invoque le ponga el mensaeje
    public abstract String hacerRuido(); 
    
}

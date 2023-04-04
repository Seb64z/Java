/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_8.hijo;

import Semana_8.padre.mamifero;

/**
 *
 * @author Sebas
 */
public class gato extends mamifero{

    public gato(String nombre) {
        super(nombre);
    }
    //Siempre esto recuerda para validar el método nemu
    @Override
    public String mostrarMensaje(){
        return "Soy felino mi nombre es: "+nombre;
    }

    @Override
    public String hacerRuido() {
        return "miau";
    }
    
}

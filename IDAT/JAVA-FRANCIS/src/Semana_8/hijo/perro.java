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
public class perro extends mamifero{

    public perro(String nombre) {
        super(nombre);
    }
// para asegurar que tiene que tener el mismo nombre el método abstract, acuerdate igual que antes
    @Override 
    public String hacerRuido() {
        return "guau";
    }
}

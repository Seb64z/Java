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
public class producto {
    protected int codigo;
    protected String detalle;

    public producto(int codigo, String detalle) {
        this.codigo = codigo;
        this.detalle = detalle;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDetalle() {
        return detalle;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
   
    
}

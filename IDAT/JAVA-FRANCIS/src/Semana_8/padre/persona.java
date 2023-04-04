/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_8.padre;

/**
 *
 * @author Sebas
 */ //Le meto abstract para que se vea que pasa
public abstract class persona {
    //Atrinutos protegidos
    protected String nombre, apellido;
    protected int edad;
    //Constructor.
    public persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    //Setters y getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    //Método generar correo
    public String generarCorreo(){
        return nombre+"."+apellido+"@idat.edu.pe";
    }
    //Mostrar
    public String mostrarDatos(){
        String cadena = "Nombre: "+nombre;
            cadena+= "\nApellido: "+apellido;
            cadena+= "\nEdad: "+edad;
            cadena+= "\nCorreo: "+generarCorreo();
            return cadena;
    }
    //Método abstraco esto para que sea ya que no lo pide
    public abstract String identificacion();
}

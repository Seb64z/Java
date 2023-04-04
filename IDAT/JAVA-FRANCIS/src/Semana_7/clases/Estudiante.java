/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_7.clases;

/**
 *
 * @author Sebas
 */
public class Estudiante {
    private int codigo,nota1,nota2;
    private String nombre;
    private static int cantidad; //por que me dice que privada y "DE CLASE"
    private static double sumaP; // igual me pide 
    public static final String INSTITUCION; //constante los "final",
    // inicializo variables privadas DE CLASE y constantes
    static{
        cantidad = 0;
        sumaP = 0;
        INSTITUCION = "IDAT";
    }
    // CONSTRUCTOR QUE INICIALICE Y CUENTE PERO SOLO LOS NORMALES NO DE CLASE.
    public Estudiante(int codigo, int nota1, int nota2, String nombre) {
        this.codigo = codigo;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nombre = nombre;
        cantidad++;
        sumaP +=calcularPromedio();
    }
    //2 Constructor con parámetros e invoca al 1ro, por eso en THIS()PONGO 4 DATOS
    public Estudiante(int codigo, String nombre) {
        this(codigo,0,0,nombre);
    }
    // 3 constructor sin nada pero e invoca al 2do por eso lleno 2 datos en el THIS
    public Estudiante() {
        this(8888,"ninguno");
    }
    //set y get para at privados o sea NO los de CLASE.
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
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
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //ahora me pide get de ats de clase.
    //El string no va por que ese no va a cambiar nunca.
    public static int getCantidad() {
        return cantidad;
    }
    public static double getSumaP() {
        return sumaP;
    }
    
    public double calcularPromedio(){
        return(nota1+nota2)/2.0;
    }
    
}

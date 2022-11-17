/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia2;

/**
 *
 * @author SENA
 */
public class Alumno extends Personas{

    public Alumno(int matricula, String tipo_persona, String nombre, String apelldio, String correo, int telefono, int num_libros, double adeudo) {
        super(tipo_persona, nombre, apelldio, correo, telefono, num_libros, adeudo);
    }

    @Override
    public void llevar_material() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void dejar_material() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    
}

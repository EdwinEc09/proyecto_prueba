/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia2;

/**
 *
 * @author SENA
 */
public class Profesor extends Personas{

    public Profesor(int num_empleado, String tipo_persona, String nombre, String apelldio, String correo, int telefono, int num_libros, double adeudo) {
        super(tipo_persona, nombre, apelldio, correo, telefono, num_libros, adeudo);
    }

    @Override
    public void llevar_material() {
        
    }

    @Override
    public void dejar_material() {
        
    }
    
}

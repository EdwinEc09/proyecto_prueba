/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author SENA
 */
public class libro extends Material{
    

    public libro(String editoria) {
    }

    public libro(String tipo_material, String codigo, String autor, String titulo, String año) {
        super(tipo_material, codigo, autor, titulo, año);
    }

    @Override
    public void alta_material() {
        System.out.println("tipo de materia es: "+getTipo_material());
        
    }

    @Override
    public void baja_material() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cambio_material() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    
    
}
/*public class Subclass extends Superclass{
    String usuario, contraseña;
    public Subclass(int id, String nombre, String apellido,String direccion){
        super(id, nombre, apellido, direccion);
    }
    public void saludar(){
        System.out.println("Hola "+getNombre()+ " "+getApellido());
    }
    public void despedida(){
        System.out.println("adios "+getNombre());
    }
}*/

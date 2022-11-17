/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package conexion;

/**
 *
 * @author APRENDIZ SENA
 */
public interface Interfaz {

    public boolean mostrar(int id, String correo, String usuario, String contraseña);

    public boolean registrar_usuario(int id, String correo, String usuario, String contraseña);

    public boolean ingresar(String usuario, String contraseña);
}

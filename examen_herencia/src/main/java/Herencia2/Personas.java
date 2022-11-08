/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia2;

import Interfax_mate.inter_personas;

/**
 *
 * @author SENA
 */
public abstract class Personas implements inter_personas{
    private String tipo_persona;
    private String nombre;
    private String apelldio;
    private String correo;
    private int telefono;
    private int num_libros;
    private double adeudo;

    public Personas(String tipo_persona, String nombre, String apelldio, String correo, int telefono, int num_libros, double adeudo) {
        this.tipo_persona = tipo_persona;
        this.nombre = nombre;
        this.apelldio = apelldio;
        this.correo = correo;
        this.telefono = telefono;
        this.num_libros = num_libros;
        this.adeudo = adeudo;
    }

    public String getTipo_persona() {
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona) {
        this.tipo_persona = tipo_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelldio() {
        return apelldio;
    }

    public void setApelldio(String apelldio) {
        this.apelldio = apelldio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNum_libros() {
        return num_libros;
    }

    public void setNum_libros(int num_libros) {
        this.num_libros = num_libros;
    }

    public double getAdeudo() {
        return adeudo;
    }

    public void setAdeudo(double adeudo) {
        this.adeudo = adeudo;
    }
    
    
}

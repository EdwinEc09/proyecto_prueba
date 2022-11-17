/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

import Interfax_mate.inter_meterial;

/**
 *
 * @author SENA
 */
public abstract class Material implements inter_meterial{
    
    private String tipo_material;
    private String codigo;
    private String autor ;
    private String titulo;
    private String año;
    
    public Material(){
        
    }
    
    public Material(String tipo_material, String codigo, String autor, String titulo, String año) {
        this.tipo_material = tipo_material;
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.año = año;
    }

    public String getTipo_material() {
        return tipo_material;
    }

    public void setTipo_material(String tipo_material) {
        this.tipo_material = tipo_material;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }
    


}



    
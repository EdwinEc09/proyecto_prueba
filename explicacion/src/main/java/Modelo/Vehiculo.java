/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Interfax.IneterVehiculo;
/**
 *
 * @author SENA
 */
abstract public class Vehiculo implements IneterVehiculo{
    private String dueno;
    private int puertas;
    private int ruedas;

    public Vehiculo() {
    }
    
    

    public Vehiculo(String dueno, int puertas, int ruedas) {
        this.dueno = dueno;
        this.puertas = puertas;
        this.ruedas = ruedas;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    
    
    @Override
    public void caraceristicas() {
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package expo.proyec_final;

import Controller.control;
import View.primera_inicio;

/**
 *
 * @author SENA
 */
public class pricipal {

    public static void main(String[] args) {
          primera_inicio primeras = new primera_inicio();
          control con = new control(primeras); 
           con.iniciar();
    }
    }


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Herencia.Material;
import Herencia.libro;
import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class biblioteca {
        public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
            libro sc= new libro("nose ","el codigo pailas mijo", "gabriel garcia marquez", "avengers","2000");
            
        sc.alta_material();
        
    }
}
    


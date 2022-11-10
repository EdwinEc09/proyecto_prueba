/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import View.*;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class control implements ActionListener {

    primera_inicio primeras;
    segunda_registro segunda = new segunda_registro();
    ArrayList<primera_lista> lista1 = new ArrayList<>();
    ArrayList<segunda_lista> lista2 = new ArrayList<>();

    /**
     * *
     * se declara el arrays de la lista 1
     */
    private String usuario = null;
    private String contraseña = null;
    /**
     * *
     * se declara el arrays de la lista 2
     */
    private int id2 = 0;
    private String nombre2 = null;
    private String apellido2 = null;
    private String usuario2 = null;
    private String contraseña2 = null;

    public control(primera_inicio primeras) {
        this.primeras = primeras;
        this.primeras.ingresar.addActionListener(this);
        this.primeras.registrarse.addActionListener(this);
        this.segunda.registrarse.addActionListener(this);
        this.segunda.ya_tengo.addActionListener(this);

    }

    /*ArrayList<listas> listatienda = new ArrayList<listas>();
    ArrayList<lista_vendedores> listavende = new ArrayList<lista_vendedores>();
    ArrayList<lista_cliente> listaclien = new ArrayList<lista_cliente>();
    adminis administrador = new adminis();
    clientes1 cliadmin = new clientes1();
    vendedor1 vendadmi = new vendedor1();
    productos1 prodadmi = new productos1();
    crudpersona xd = new crudpersona();
//vamos a crear e inicializar las variables ArrayList<modelpersonas>();
    private int id = 0;
    private String nombre = null;

    private String usuario = null;
    private String contrasena = null;
    private String precio = null;
    private String categoria = null;
//cojemos la lista de vendedores
    private int idv = 0;
    private String nombrev = null;
    private String apellidov = null;
    //lista cliente
    private int idc = 0;
    private String nombrec = null;
    private String apelldidoc = null;*/
    public void iniciar() {
        this.primeras.setVisible(true);
        this.primeras.setLocationRelativeTo(null);
        this.segunda.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.primeras.ingresar) {
            usuario = this.primeras.usuario.getText();
            contraseña = this.primeras.contraseña.getText();
            limpiar();
            if (usuario.equals("1") && contraseña.equals("1")) {
                JOptionPane.showMessageDialog(null, "si");
            } else if (usuario.equals("2") && contraseña.equals("2")) {
                JOptionPane.showMessageDialog(null, "si2");
            } else {
                JOptionPane.showMessageDialog(null, "no esta registrado");
            }
        }else if (e.getSource() == this.primeras.registrarse) {
            segunda.setVisible(true);
            primeras.dispose();

        }else if (e.getSource()==this.segunda.ya_tengo) {
            primeras.setVisible(true);
            segunda.dispose();
        }
        if (e.getSource() == this.segunda.registrarse) {
            id2 = Integer.parseInt(this.segunda.id.getText());
            nombre2 = this.segunda.nombre.getText();
            apellido2 = this.segunda.apelldio.getText();
            usuario = this.segunda.usuario.getText();
            contraseña = this.segunda.contraseña.getText();
            limpiar();
            lista2.add(new segunda_lista(id2, nombre2, apellido2, usuario, contraseña));
            JOptionPane.showMessageDialog(null, "se ha registrado con exito");
            primeras.setVisible(true);
            segunda.dispose();
        }
    }

    private void limpiar() {
        this.primeras.usuario.setText("");
        this.primeras.contraseña.setText("");
        this.segunda.id.setText("");
        this.segunda.nombre.setText("");
        this.segunda.apelldio.setText("");
        this.segunda.usuario.setText("");
        this.segunda.contraseña.setText("");

    }

}

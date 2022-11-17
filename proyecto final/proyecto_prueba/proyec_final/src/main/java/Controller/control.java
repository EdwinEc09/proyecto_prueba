/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import View.*;
import com.mysql.cj.CoreSession;
import conexion.Cruplogin;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.text.html.CSS;
import view.agendar1;
import view.clientes;
import view.consultarcita;
import view.medicamentoss;

public class control implements ActionListener {

    primera_inicio principal;

    clientes cliente = new clientes();
    agendar1 agendas = new agendar1();
    consultarcita consulta = new consultarcita();
    medicamentoss medicamento = new medicamentoss();
    segunda_registro registro = new segunda_registro();
    Cruplogin login = new Cruplogin();

    private int id = 0;
    private String usuario = null;
    private String contraseña = null;
    private String correo = null;

    public control(primera_inicio principal) {
        this.principal = principal;
        this.iniciar();
        this.cliente.agendarcitas.addActionListener(this);
        this.cliente.consultarcitas.addActionListener(this);
        this.consulta.volverconsul.addActionListener(this);
        this.consulta.volverconsul.addActionListener(this);

        this.principal.registrarse.addActionListener(this);
        this.registro.ya_tengo.addActionListener(this);
        this.principal.mostrar.addActionListener(this);
        this.cliente.medicamentos.addActionListener(this);
        this.cliente.volvercliente.addActionListener(this);
        this.agendas.conectarbase.addActionListener(this);
        this.principal.ingresar.addActionListener(this);
        this.registro.registrarse.addActionListener(this);

    }

    public void iniciar() {
        this.principal.setVisible(true);
        this.principal.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.principal.registrarse) {
            registro.setVisible(true);
            principal.dispose();

        }

        if (e.getSource() == this.registro.ya_tengo) {
            principal.setVisible(true);
            registro.dispose();
        }

        /* if (e.getSource()== this.principal.mostrar) {
            
            use=this.principal.usuario.getText();
            pass=this.principal.contraseña.getText();
           
            if (use.equals("1" )&& pass.equals("12")){
                cliente.setVisible(true);
                principal.dispose();
            }
            
        }*/
        if (this.cliente.agendarcitas == e.getSource()) {
            this.cliente.tablacliente.add(agendas);
            agendas.show();

        }
        if (this.cliente.consultarcitas == e.getSource()) {
            this.cliente.tablacliente.add(consulta);
            consulta.show();
        }

        if (e.getSource() == this.cliente.medicamentos) {
            this.cliente.tablacliente.add(medicamento);
            medicamento.show();
//        }

            // if (e.getSource() == this.cliente.volvercliente){
            //   principal.setVisible(true);
            // cliente.dispose();
            /*
          if (this.cliente.volvercliente == e.getSource()){
            boolean respoder = login.mostrar();
            if (respoder == true){
                JOptionPane.showMessageDialog(null,"");
                
          // }else {
            //    JOptionPane.showMessageDialog(null, "NOT , NO HAY DATOS");
        
        
        }
             */
        } else if (principal.mostrar == e.getSource()) {
            boolean respuesta = login.mostrar(id, correo, usuario, contraseña);
            if (respuesta == true) {
                JOptionPane.showMessageDialog(null, "si");
            } else {
                JOptionPane.showMessageDialog(null, "no");
            }
        } else if (e.getSource() == this.registro.registrarse) {
            id = Integer.parseInt(this.registro.identificacion.getText());
            correo = this.registro.correo.getText();
            usuario = this.registro.usuario.getText();
            contraseña = this.registro.contrasena.getText();
            login.registrar_usuario(id, correo, usuario, contraseña);

        }
        if (e.getSource() == this.principal.ingresar) {
            usuario = this.principal.usuario.getText();
            contraseña = this.principal.contraseña.getText();
            boolean respuesta = login.ingresar(usuario, contraseña);
            if (respuesta == true) {
                cliente.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "no esta registrado");
            }
        }
    }
}

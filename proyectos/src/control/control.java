/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import View.primera_inicio;
import View.segunda_registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import view.*;


/**
 *
 * @author APRENDIZ SENA
 */
public class control  implements ActionListener{
    
    primera_inicio principal;
    
    clientes cliente = new clientes();
    agendar1 agendas = new agendar1();
    consultarcita consulta = new consultarcita();
    medicamentoss medicamento = new medicamentoss();
    segunda_registro registro= new segunda_registro();
  
    
    
    
    
    private String use;
    private String pass;
    
    
    public control (primera_inicio principal){
        this.principal=principal;
        this.iniciar();
        this.cliente.agendarcitas.addActionListener(this);
        this.cliente.consultarcitas.addActionListener(this);
        this.consulta.volverconsul.addActionListener(this);
        this.consulta.volverconsul.addActionListener(this);
   
        this.principal.registrarse.addActionListener(this);
        this.registro.ya_tengo.addActionListener(this);
        this.principal.ingresar.addActionListener(this);
        this.cliente.medicamentos.addActionListener(this);
        this.cliente.volvercliente.addActionListener(this);
        this.agendas.conectarbase.addActionListener(this);
    
    }

   
    public void iniciar(){   
        this.principal.setVisible(true);
        this.principal.setLocationRelativeTo(null);
       
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.principal.registrarse){
            registro.setVisible(true);
            principal.dispose();
        }
        if (e.getSource() == this.registro.ya_tengo){
            principal.setVisible(true);
            registro.dispose();
        }
        
        if (e.getSource()== this.principal.ingresar) {
            
            use=this.principal.usuario.getText();
            pass=this.principal.contraseña.getText();
           
            if (use.equals("1" )&& pass.equals("12")){
                cliente.setVisible(true);
                principal.dispose();
            }
            
        }
        
        if (this.cliente.agendarcitas == e.getSource()) {
            this.cliente.tablacliente.add(agendas);
            agendas.show();
                 
        }
        if (this.cliente.consultarcitas == e.getSource()){
            this.cliente.tablacliente.add(consulta);
            consulta.show();
        }
        
        if(e.getSource() == this.cliente.medicamentos){
            this.cliente.tablacliente.add(medicamento);
            medicamento.show();
        }
       
         if (e.getSource() == this.cliente.volvercliente){
             principal.setVisible(true);
             cliente.dispose();
         }
         /*
          if (this.cliente.consultarcitas == e.getSource()){
            boolean respuestas = clientecx.ingresar();
            if (respuestas == true){
                JOptionPane.showMessageDialog(null," YES , SI HAT DATOS");
                
            }else {
                JOptionPane.showMessageDialog(null, "NOT , NO HAY DATOS");
        
        
        }
*/
        
        }
     
    }
     
    
    


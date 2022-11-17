/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conecion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author APRENDIZ SENA
 */
public class CRUDLOGIN  extends  conect{
    
    
    public boolean ingresar (){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
       
        
        String sql ="Select * from usuario";
        try {
            ps=con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()){
                return true;
            }else{
                return false;
            }
        }catch (SQLException e){
            System.out.println(e);
            return false;
            
        }finally {
            try{
                con.close();
            }catch (SQLException e){
                
                System.out.println(e.toString());
            }
        }
    
}
}

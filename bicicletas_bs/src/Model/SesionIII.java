/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.Inicio_Usuario;
import View.Inicio_Sesion;

/**
 *
 * @author Usuario
 */
public class SesionIII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion inst_Con=new Conexion();
        Inicio_Usuario inst_Frame = new Inicio_Usuario();
        
        
        inst_Con.getConnection();
                
                
        inst_Con.getConnection();
        inst_Frame.setVisible(true);
      
    }
    
}

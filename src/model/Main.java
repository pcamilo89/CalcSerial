/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.CalculatorView;
/**
 *
 * @author Camilo
 */

public class Main {
    public static boolean start = false;
    
    public static void startApp(){
        //Iniciando SerialComm
        try {
            SerialComm.connect(Utils.PORT_NAME);
            
            if(SerialComm.getSerialPort()!=null && start == false){
                //Iniciando Hilo de Entrada por Serial
                SerialReader reader = new SerialReader(SerialComm.getIn());
                new Thread(reader).start();
                OperationListener listener = new OperationListener();
                new Thread(listener).start();
                
                System.out.println("Serial Comm Iniciado.");
                start = true;
            }
                
            
        } catch (Exception ex) {
            Logger.getLogger(SerialComm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void main(String[] args) throws IOException, InterruptedException{
        
        //Codigo de iniciacion de interfaz
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        CalculatorView calculator =  new CalculatorView();
        calculator.setVisible(true);
        
        while(start == false){
            if(Utils.textDialog(calculator)){
                Main.startApp();
            }
        }
        
    }
}

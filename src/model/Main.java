/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import view.MainView;
/**
 *
 * @author Camilo
 */
public class Main {
       public static SerialReader reader = null;

    public static void main(String[] args) throws IOException, InterruptedException{
        //Iniciando SerialComm
      /*  try {
            SerialComm.connect("COM3");
        } catch (Exception ex) {
            Logger.getLogger(SerialComm.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        //Iniciando Hilo de Entrada por Serial
       /* SerialReader reader = new SerialReader(SerialComm.getIn());
        new Thread(reader).start();
*/
// JFrame frame = new JFrame("FrameDemo");
       // frame.setVisible(true);
MainView principal = new MainView();
principal.setVisible(true);

//principal.setBackground(Color.WHITE);
        
  //      System.out.println("Serial Comm Iniciado.");
        
        
//        //test de envio de informacion.
//        int y=65;
//        for(int i=0;i<5;i++){
//            Thread.sleep(2000);
//            SerialComm.sendMsg(i+y,y);
//        }





        
        //SerialComm.close();
    }
    
       public static void startApp(){
        try {
            if(SerialComm.getSerialPort() == null&&reader==null){
                //Iniciando conneccion serial
                SerialComm.connect(Utils.comPort);
                System.out.println("Serial Comm Iniciado en: "+Utils.comPort);
                //Iniciando Hilo de Entrada por Serial
                reader = new SerialReader(SerialComm.getIn());
                new Thread(reader).start();
            }
        } catch (Exception ex) {
            Logger.getLogger(SerialComm.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        }
    
           public static void stopApp(){
       if(SerialComm.getSerialPort() != null&&reader!=null){
           //Primero cerrar hilo de esucha
           reader.setLive(false);

           reader = null;
           
           //Luego se cierra puerto
           SerialComm.close();
           System.out.println("Serial Comm Finalizado");
       }
    }
    
}

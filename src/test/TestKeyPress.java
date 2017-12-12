/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import javax.swing.JFrame;

/**
 *
 * @author Camilo
 */
public class TestKeyPress {
    
    
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        frame.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                //System.out.println("Se presiono una tecla");
                
                //si se presiona una tecla y es una de las teclas permitidas
                char c = evt.getKeyChar();
                if(c == '0' || c == '1' || c == '2' || c == '3' ||c == '4' ||
                   c == '5' || c == '6' || c == '7' || c == '8' || c == '9' ||
                   c == '#' || c == '*' || c == '.' ){
                    
                    //se agrega caracter al final de la trama y se activa interfaz
                    System.out.println("Se Presiono: "+c);
                }
                
            }
        });
        
        
        frame.setVisible(true);
        
    }
}

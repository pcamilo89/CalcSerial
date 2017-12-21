/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import model.ButtonAnimation;
import model.Message;
import model.Utils;
import view.CalculatorView;

public class CalculatorViewController {
    private static CalculatorView calculator;
    
    public static void load(CalculatorView from){
        calculator = from;
        calculator.setLocationRelativeTo(null);
        calculator.getjTFPantalla().setEditable(false);
        calculator.setTitle(Utils.APP_TITTLE);
        CalculatorViewController.charFromKeyboard();
    }
    
    public static void fillString(String text){
        calculator.getjTFPantalla().setText(text);
    }
    
    public static JButton getButton(int i){
        return calculator.getButton(i);
    }
    
    public static JButton getButton(char c){
        for (JButton button : calculator.getButtonArray()) {
            if(button.getText().charAt(0) == c)
                return button;
        }
        return null;
    }
    
    public static void pressButton(char c){
        JButton button =  getButton(c);
        if(button != null){
            ButtonAnimation animation = new ButtonAnimation(button);
            new Thread(animation).start();
        }
    }
    
    public static void charFromKeyboard(){
        KeyListener keylistener = new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                //System.out.println("Se presiono una tecla");
                
                //si se presiona una tecla y es una de las teclas permitidas
                char c = evt.getKeyChar();
                if(c == '0' || c == '1' || c == '2' || c == '3' ||c == '4' ||
                   c == '5' || c == '6' || c == '7' || c == '8' || c == '9' ||
                   c == '#' || c == '*' || c == '.' ){
                    
                    //se agrega caracter al final de la trama y se activa interfaz
                
                    Message.fillMsg(c);
                    CalculatorViewController.pressButton(c);
                    
                    System.out.println(Message.getMsg());
                    CalculatorViewController.fillString(Message.getMsg());
                    
                }                
            }
        };
        calculator.addKeyListener(keylistener);
        calculator.getjTFPantalla().addKeyListener(keylistener);
        
        JButton buttons[] = calculator.getButtonArray();
        for(JButton button: buttons){
            button.addKeyListener(keylistener);
        }
        
    }
}

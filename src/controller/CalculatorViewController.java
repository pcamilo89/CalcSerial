/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.Utils;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import view.CalculatorView;

public class CalculatorViewController {
    private static CalculatorView calculator;
    
    public static void load(CalculatorView from){
        calculator = from;
        calculator.setLocationRelativeTo(null);
        calculator.getjTFPantalla().setEditable(false);
        calculator.setTitle(Utils.APP_TITTLE);
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
            button.getModel().setArmed(true);
            button.getModel().setPressed(true);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(CalculatorViewController.class.getName()).log(Level.SEVERE, null, ex);
            }
            button.getModel().setArmed(false);
            button.getModel().setPressed(false);
        }
    }
}

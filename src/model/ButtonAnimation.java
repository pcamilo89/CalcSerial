/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import controller.CalculatorViewController;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Camilo
 */
public class ButtonAnimation implements Runnable{
    JButton button;
    
    public ButtonAnimation(JButton from){
        this.button =  from;
    }

    @Override
    public void run() {
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

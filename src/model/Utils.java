package model;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Camilo
 */
public class Utils {
    public static final String APP_TITTLE = "CalcSerial";
    
    public static final String PORT_TEXT = "Indique Puerto COM:";
    public static final String MSG_ESPECIAL = "Biagio ponme 20 puntos";
            
    public static String PORT_NAME = "COM1";
    
    
    public static boolean textDialog(JFrame father){
        JPanel panel = new JPanel();
        JLabel label = new JLabel(Utils.PORT_TEXT);
        JTextField field =  new JTextField();
        field.setText(Utils.PORT_NAME);
        panel.add(label);
        panel.add(field);
        String[] options = new String[]{"Yes"};
        int option = JOptionPane.showOptionDialog(father, panel, Utils.APP_TITTLE,
        JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options, options[0]);
        if(option == 0) // pressing OK button
        {
            Utils.PORT_NAME = field.getText();
            return true;
        }
        return false;
    }
}

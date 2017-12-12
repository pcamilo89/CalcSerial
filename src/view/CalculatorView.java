/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.CalculatorViewController;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Message;

/**
 *
 * @author Camilo
 */
public class CalculatorView extends javax.swing.JFrame {
    private final JButton[] botones = new JButton[12];
    /**
     * Creates new form SerialCalc
     */
    public CalculatorView() {
        initComponents();        
        GridLayout experimentLayout = new GridLayout(0,3);
        jPCentral.setLayout(experimentLayout);
        setButtons();
        CalculatorViewController.load(this);
    }

    
    public JPanel getjPCentral() {
        return jPCentral;
    }

    public void setjPCentral(JPanel jPCentral) {
        this.jPCentral = jPCentral;
    }

    public void setButtons(){
        
        for(int i = 0; i < 9;i++){
            botones[i] = new JButton();
            botones[i].setText(String.valueOf(i+1));
            jPCentral.add(botones[i]);
        }
        
        botones[9] = new JButton();
        botones[9].setText("#");
        jPCentral.add(botones[9]);
        
        botones[10] = new JButton();
        botones[10].setText("0");
        jPCentral.add(botones[10]);
        
        botones[11] = new JButton();
        botones[11].setText("*");
        jPCentral.add(botones[11]);
        
        botones[0].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //Message.fillMsg(CalculatorViewController.getButton(i));
                char charAt;
                charAt = (char) CalculatorViewController.getButton(0).getText().charAt(0);
                Message.fillMsg(charAt);
                System.out.println(Message.getMsg());
                CalculatorViewController.fillString(Message.getMsg());
            }
        });
        
        botones[1].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //Message.fillMsg(CalculatorViewController.getButton(i));
                char charAt;
                charAt = (char) CalculatorViewController.getButton(1).getText().charAt(0);
                Message.fillMsg(charAt);
                System.out.println(Message.getMsg());
                CalculatorViewController.fillString(Message.getMsg());
            }
        });
        
        botones[2].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //Message.fillMsg(CalculatorViewController.getButton(i));
                char charAt;
                charAt = (char) CalculatorViewController.getButton(2).getText().charAt(0);
                Message.fillMsg(charAt);
                System.out.println(Message.getMsg());
                CalculatorViewController.fillString(Message.getMsg());
            }
        });
        
        botones[3].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //Message.fillMsg(CalculatorViewController.getButton(i));
                char charAt;
                charAt = (char) CalculatorViewController.getButton(3).getText().charAt(0);
                Message.fillMsg(charAt);
                System.out.println(Message.getMsg());
                CalculatorViewController.fillString(Message.getMsg());
            }
        });
        
        botones[4].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //Message.fillMsg(CalculatorViewController.getButton(i));
                char charAt;
                charAt = (char) CalculatorViewController.getButton(4).getText().charAt(0);
                Message.fillMsg(charAt);
                System.out.println(Message.getMsg());
                CalculatorViewController.fillString(Message.getMsg());
            }
        });
        
        botones[5].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //Message.fillMsg(CalculatorViewController.getButton(i));
                char charAt;
                charAt = (char) CalculatorViewController.getButton(5).getText().charAt(0);
                Message.fillMsg(charAt);
                System.out.println(Message.getMsg());
                CalculatorViewController.fillString(Message.getMsg());
            }
        });
        
        botones[6].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //Message.fillMsg(CalculatorViewController.getButton(i));
                char charAt;
                charAt = (char) CalculatorViewController.getButton(6).getText().charAt(0);
                Message.fillMsg(charAt);
                System.out.println(Message.getMsg());
                CalculatorViewController.fillString(Message.getMsg());
            }
        });
        
        botones[7].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //Message.fillMsg(CalculatorViewController.getButton(i));
                char charAt;
                charAt = (char) CalculatorViewController.getButton(7).getText().charAt(0);
                Message.fillMsg(charAt);
                System.out.println(Message.getMsg());
                CalculatorViewController.fillString(Message.getMsg());
            }
        });
        
        botones[8].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //Message.fillMsg(CalculatorViewController.getButton(i));
                char charAt;
                charAt = (char) CalculatorViewController.getButton(8).getText().charAt(0);
                Message.fillMsg(charAt);
                System.out.println(Message.getMsg());
                CalculatorViewController.fillString(Message.getMsg());
            }
        });
        
        botones[9].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //Message.fillMsg(CalculatorViewController.getButton(i));
                char charAt;
                charAt = (char) CalculatorViewController.getButton(9).getText().charAt(0);
                Message.fillMsg(charAt);
                System.out.println(Message.getMsg());
                CalculatorViewController.fillString(Message.getMsg());
            }
        });
        
        botones[10].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //Message.fillMsg(CalculatorViewController.getButton(i));
                char charAt;
                charAt = (char) CalculatorViewController.getButton(10).getText().charAt(0);
                Message.fillMsg(charAt);
                System.out.println(Message.getMsg());
                CalculatorViewController.fillString(Message.getMsg());
            }
        });
        
        botones[11].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //Message.fillMsg(CalculatorViewController.getButton(i));
                char charAt;
                charAt = (char) CalculatorViewController.getButton(11).getText().charAt(0);
                Message.fillMsg(charAt);
                System.out.println(Message.getMsg());
                CalculatorViewController.fillString(Message.getMsg());
            }
        });
    }
    
    public JButton getButton(int i){
        return botones[i];
    }

    public JButton[] getButtonArray(){
        return botones;
    }
    
    public JTextField getjTFPantalla() {
        return jTFPantalla;
    }

    public void setjTFPantalla(JTextField jTFPantalla) {
        this.jTFPantalla = jTFPantalla;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPCentral = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTFPantalla = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(200, 250));
        setResizable(false);

        jPCentral.setBackground(new java.awt.Color(153, 153, 153));
        jPCentral.setPreferredSize(new java.awt.Dimension(200, 300));

        javax.swing.GroupLayout jPCentralLayout = new javax.swing.GroupLayout(jPCentral);
        jPCentral.setLayout(jPCentralLayout);
        jPCentralLayout.setHorizontalGroup(
            jPCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPCentralLayout.setVerticalGroup(
            jPCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        getContentPane().add(jPCentral, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jTFPantalla.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTFPantalla.setPreferredSize(new java.awt.Dimension(59, 40));
        jPanel1.add(jTFPantalla);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPCentral;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFPantalla;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

//import model.Protocol;
//import model.Utils;
//import view.GameView;
import static java.lang.System.in;
import model.Main;
import model.SerialComm;
import model.Utils;
import view.MainView;
import model.Message;

/**
 * Clase de control de la ventana inicial de la aplicacion
 * @author Camilo
 */
public class MainViewController {
    /**
     * Variable mainView que hace referencia a la interfaz
     */
    private static MainView mainView;
    
    /**
     * Metodo de carga inicial de la interfaz
     * @param from referencia a la interfaz
     */
    public static void load(MainView from){
       mainView = from;
       mainView.setTitle(Utils.APP_NAME);
       mainView.setLocationRelativeTo(null);
       mainView.setResizable(false);
       mainView.getjTFPort().setText(Utils.comPort);
       mainView.getjTFInput().setText(Utils.vacio);
       mainView.getjTFResult().setText(Utils.vacio);
     //  mainView.getjBGameStart().setEnabled(false);
    }
    
    /**
     * Metodo que desabilita la interfaz luego del inicio del juego
     */
    public static void disableButtons(){
  //      mainView.getjBGameStart().setEnabled(false);
    //    mainView.getjBPortStart().setEnabled(false);
        //mainView.getjBPortStop().setEnabled(false);
      //  mainView.getjTFPort().setEnabled(false);
    }
    
    /**
     * Metodo que inicializa la comunicacion
     */
    public static void startComm(){
       Utils.comPort = mainView.getjTFPort().getText();
       Main.startApp();
       mainView.getjBPortStart().setEnabled(false);
       
    }
    
    /**
     * Metodo que detiene la comunicacion
     */
    public static void stopComm(){
        Main.stopApp();
        mainView.getjBPortStart().setEnabled(true);
        //mainView.getjBGameStart().setEnabled(false);
    }
    
    /**
     * Metodo de inicio de partida
     */
    public static void startGame(){
        //Protocol.startGame();
        //disableButtons();
    }
    
    /**
     * Metodo para asignar informacion a la Label de informacion
     * @param text texto a mostrar
     */

    

    
    
    /**
     * Metodo para asignar informaicon a Label Cartas
     * @param text texto a mostrar
     */
    public static void setear(String input){
mainView.getjTFInput().setText(input);       
    }
    
        public static void setearResultado(int resultado){
mainView.getjTFResult().setText(Integer.toString(resultado));       
    }
    /**
     * Metodo para limpiar Label Cartas
     */
    public static void VaciarInpiut(String inputVacio){
       mainView.getjTFInput().setText(inputVacio);
    }

    public static void VaciarResultado(){
       mainView.getjTFResult().setText("");
    }    
    
    
    /**
     * Metodo para asignar informaicon a Label Players
     * @param text texto a mostrar
     */
    public static void setPlayerLabel(String text){
        //mainView.getjLPlayer().setText(text);
    }
    
    /**
     * Metodo para limpiar Label Players
     */
    public static void clearPlayerLabel(){
        //mainView.getjLPlayer().setText("");
    }
    
    /**
     * Metodo para asignar informacion a label Turn
     * @param text texto a mostrar
     */
    public static void setTurnLabel(String text){
        //mainView.getjLTurn().setText(text);
    }
    
    /**
     * Metodo para limpiar Label Turn
     */
    public static void clearTurnLabel(){
        //mainView.getjLTurn().setText("");
    }
    
    public static void showGameView(){
       // GameView gameView = new GameView(mainView);
       // gameView.setVisible(true);
    }
}

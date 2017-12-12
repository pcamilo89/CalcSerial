/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import controller.CalculatorViewController;
import java.io.IOException;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Hilo de escucha al canal de entrada RX del puerto serial
 * @author Camilo
 */
public class OperationListener implements Runnable{
        private static Boolean activo=true;
    /**
     * Constructor del hilo.
     * @param in Canal de entrada del puerto serial.
     */
    public OperationListener ( )
    {
        super();
    }

    /**
     * Metodo que se ejecuta al iniciar el hilo.
     */
    public void run ()
    { 
            while ( activo )
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(OperationListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                String mensaje = Message.getMsg();//captura la trama en un string
                String operadores[] = mensaje.split("[0-9]+");//array que contiene solo operadores
                if (operadores.length > 0){  
                char[] ultimo=operadores[operadores.length-1].toCharArray();
                int contador=0;
                //System.out.println(mensaje);
                if (mensaje.equals("#*#*")){
                    System.out.println("Ponme 20 puntos");
                    Message.setMsg("Ponme 20 puntos");
                    
                    CalculatorViewController.fillString(Message.getMsg());
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(OperationListener.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (mensaje.equals("*")){
                    Message.clearMsg();
                    CalculatorViewController.fillString(Message.getMsg());
                }
                for (int i=0; i<ultimo.length;i++){
                    
                    if (ultimo[i] == '*'){
                       contador++;
                               }
                 
                    if (contador>1){
                        Message.clearMsg();
                        CalculatorViewController.fillString(Message.getMsg());
                    }else if (contador == 1  && operadores.length >= 2) {                 
                        
                            calculos(mensaje);
                    }
                }
                }
            }
            
    }    
    private static String removeLastChar(String str) {  //función que elimina el ultimo char de un string
    return str.substring(0, str.length() - 1);
}
 public static String[] removeNull(String[] firstArray) {
  
     List<String> list = new ArrayList<String>();

    for(String s : firstArray) {
       if(s != null && s.length() > 0) {
          list.add(s);
       }
    }

    firstArray = list.toArray(new String[list.size()]);
    return firstArray;

}

    public void calculos(String tramaEntrante){
         tramaEntrante = removeLastChar(tramaEntrante);//quita el asterisco al final
          String operadores[] = tramaEntrante.split("[0-9*.]+");//array de operadores
          String numeros[] = tramaEntrante.split("[#*]");//array de numeros
             numeros=removeNull(numeros);     //quita casillas en blanco del arreglo
                    System.out.println("operadores="+Arrays.toString(operadores));
                    Double resultado = Double.parseDouble(numeros[0]);
                    System.out.println("numeros="+Arrays.toString(numeros));

                    if(operadores.length != 0){
                        for (int i = 0; i < numeros.length; i++) {
                           //System.out.println("Estoy en for");
                            if (operadores[i].equals("#")) { //suma
                               resultado += Double.parseDouble(numeros[i]);
                            } //else
                              if (operadores[i].equals("##")){  //resta
                            resultado -= Double.parseDouble(numeros[i]);
                           }//else
                             if (operadores[i].equals("###")){  //mult
                            resultado = resultado * Double.parseDouble(numeros[i]);
                           }//else
                             if (operadores[i].equals("####")){  //div
                            resultado = resultado / Double.parseDouble(numeros[i]);
                           }//else
                             if (operadores[i].equals("#####")){  //potencia
                             resultado = Math.pow(resultado, Double.parseDouble(numeros[i]));
                           }//else
    //                       
                        }
                        if(numeros.length==1 && operadores[1].equals("######")){ //sin
                        resultado = Math.sin(Math.toRadians(resultado));                       
                        }
                         if(numeros.length==1 && operadores[1].equals("#######")){ //cos
                          resultado = Math.cos(Math.toRadians(resultado));                       
                        }
                        
                        resultado = (double) Math.round(resultado * 1000d) / 1000d;
                        System.out.println(resultado);
                        Message.setMsg(String.valueOf(resultado));
                        CalculatorViewController.fillString(Message.getMsg());
                            
                        
                        
                        
                    }
                    
                   
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import controller.CalculatorViewController;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;


/**
 * Hilo de escucha al canal de entrada RX del puerto serial
 * @author Camilo
 */
public class SerialReader implements Runnable{
    //Canal de entrada RX
    private InputStream in;
    
    /**
     * Constructor del hilo.
     * @param in Canal de entrada del puerto serial.
     */
    public SerialReader ( InputStream in )
    {
        this.in = in;
    }

    /**
     * Metodo que se ejecuta al iniciar el hilo.
     */
    public void run ()
    {
        byte[] buffer = new byte[1];
        int len = -1;
        String msg;
        String trama=new String();
        char[] arr;
        char c;
               
        try
        {
            //ciclo de lectura del buffer de entrada
            while ( ( len = this.in.read(buffer)) > -1 )
            {

                msg = new String(buffer,0,len);
                arr = msg.toCharArray();
                

                //Segmento donde se maneja cuando se recibe cualquier caracter.
                if(arr.length > 0){
                    
                    c = (char) arr[0];
                  
                    /* Se llena el mensaje actual con los caracteres que van llegando del buffer
                    */
                   Message.fillMsg(c);
                   System.out.println(Message.getMsg());
                   CalculatorViewController.fillString(Message.getMsg());
                   
                   CalculatorViewController.pressButton(c);
                   
                }

            }
        }
        catch ( IOException e )
        {
            e.printStackTrace();
        }            
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Hilo de escucha al canal de entrada RX del puerto serial
 * @author Camilo
 */
public class SerialReader implements Runnable{
    //Canal de entrada RX
        private static ArrayList<Character> Entrada = new ArrayList<Character>();


    private InputStream in;

    /**
     * Constructor del hilo.
     * @param in Canal de entrada del puerto serial.
     */
    public SerialReader ( InputStream in )
    {
        this.in = in;
    }
    
    
    public static void showArrayList(ArrayList<Character> Entrada){
              System.out.println(Entrada.size());
      //  for (Character d: Entrada){
       //         System.out.println(d);
        //}
    
    }

        
    public static void llenarArrayList(ArrayList<Character> Entrada, char digito){
    Entrada.add(digito);
      //  for (Character d: Entrada){
       //         System.out.println(d);
        //}
    
    }
    
    public static void verificarAsterisco(ArrayList<Character>Entrada){

            for (int i = 0; i < Entrada.size(); i ++) {
                    if (i>0){
                        if(((Entrada.get(i-1))=='*')&&((Entrada.get(i))=='*')){
                           
                        Entrada.clear(); //Se borra el arrayList
                        
                        System.out.println(Entrada);
                        
                        
                        }
                    //    System.out.println("vacialo");
                        
                    }

                }
    }

    
    public static void verificar(ArrayList<Character> Entrada){
        int resultado;
        
        
        if ((Entrada.size()>2)){
        if ((Entrada.get(1)=='#')&&((Entrada.get(2)!='#'))){
              resultado=Character.getNumericValue(Entrada.get(0))+(Character.getNumericValue(Entrada.get(2)));
              System.out.println("esto es suma");
              System.out.println(resultado);       
        }
        if(Entrada.size()>3){
              if ((Entrada.get(1)=='#')&&((Entrada.get(2)=='#'))&&((Entrada.get(3)!='#'))){
              resultado=Character.getNumericValue(Entrada.get(0))-(Character.getNumericValue(Entrada.get(3)));
              System.out.println("esto es resta");
              System.out.println(resultado);
              }
                    if(Entrada.size()>4){
                    if ((Entrada.get(1)=='#')&&((Entrada.get(2)=='#'))&&((Entrada.get(3)=='#'))&&((Entrada.get(4)!='#'))){
                    resultado=Character.getNumericValue(Entrada.get(0))*(Character.getNumericValue(Entrada.get(4)));
                    System.out.println("esto es multiplicacion");
                    System.out.println(resultado);
                    }
                    
                    
                                        if(Entrada.size()>5)
                                        {
                                            if ((Entrada.get(1)=='#')&&((Entrada.get(2)=='#'))&&((Entrada.get(3)=='#'))&&((Entrada.get(4)=='#'))&&((Entrada.get(5)!='#'))){
                                            resultado=Character.getNumericValue(Entrada.get(0))/(Character.getNumericValue(Entrada.get(5)));
                                            System.out.println("esto es division");
                                            System.out.println(resultado);
                                            }
                                            if(Entrada.size()>6)
                                        {
                                            if ((Entrada.get(1)=='#')&&((Entrada.get(2)=='#'))&&((Entrada.get(3)=='#'))&&((Entrada.get(4)=='#'))&&((Entrada.get(5)=='#'))&&((Entrada.get(6)!='#'))){
                                            resultado=(int) Math.pow(Character.getNumericValue(Entrada.get(0)),Character.getNumericValue(Entrada.get(6)));
                                            System.out.println("esto es potenciacion");
                                            System.out.println(resultado);
                                            }
                                        }
                                        else
                                        {
                                          
                                            
                                        }
                                                                    
                                        }
                                        else
                                        {
                                        }
                    }else
                    {
                    }
        
        }
        else
        {
        }

        }
        else
        {
        }
      //  for (Character d: Entrada){
       //         System.out.println(d);
        //}
    
    }

    /**
     * Metodo que se ejecuta al iniciar el hilo.
     */
    public void run ()
    {
    
        byte[] buffer = new byte[1];
        int len = -1;
        String msg;
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
                    //Utils.printMSG(c);

                    /* Se llena el mensaje actual con los caracteres que van llegando del buffer
                    */
                    Message.fillMsg(c);
                    //Entrada.add(c);
                   // System.out.println(Entrada.get(0));
                    llenarArrayList(Entrada,c);
                    
                    showArrayList(Entrada);
                   verificar(Entrada);
                   verificarAsterisco(Entrada);
                   //System.out.println(Entrada);
         
                    //System.out.println(c);
                    // System.out.println(Message.getMsg());
           
                                                  
                }
            }
        }
                    
        catch ( IOException e )
        {
            e.printStackTrace();
        }
        
    }

    
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Francisco
 */
public class Pruebas {

    public Pruebas() {
        super();
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
 public static String removeAst( String operadores[]){
   String salida=new String();
     if (operadores.length > 0){  
                char[] ultimo=operadores[operadores.length-1].toCharArray();        
                for (int i=0; i<ultimo.length;i++){
                    
                    if (ultimo[i] == '#'){
                       salida+=ultimo[i];
                               } 
                }
                }
   return salida;
 }
 public static String [] removeA( String operadores[]){
  String salida[] = new String[operadores.length];//operadores:[,###,####*,##*,##]
     if (operadores.length > 0){  
                String temp = new String();
                for (int i=0; i<operadores.length;i++){//recorre operadores
                    if(operadores[i].contains("*")){ //operadores[i]:###*
                        temp="";//limpia temp
                        char[] seccion = operadores[i].toCharArray();//seccion:[#,#,#,*]
                        for (int j=0; j<seccion.length;j++){//recorre seccion
                            if(seccion[j] == '#'){
                                temp +=seccion[j];
                            }
                        }//entra: seccion:###* sale temp:###
                    }else temp = operadores[i];//si no contiene * se copia igual
                    salida[i]=temp;
                     }
                }
   return salida;//salida: [,###,####,##,##]
 }
 public static String [] moveA( String operadores[]){
  String salida[] = new String[operadores.length];//operadores:[,###,####*,##*,##]
     if (operadores.length > 0){  
                String temp = new String();
                for (int i=0; i<operadores.length;i++){//recorre operadores
                    if(operadores[i].contains("*")){ //operadores[i]:###*
                        temp="";//limpia temp
                        char[] seccion = operadores[i].toCharArray();//seccion:[#,#,#,*]
                        for (int j=0; j<seccion.length;j++){//recorre seccion
                            if(seccion[j] == '#'){
                                temp +=seccion[j];
                            }
                        }//entra: seccion:###* sale temp:###
                    }else temp = operadores[i];//si no contiene * se copia igual
                    salida[i]=temp;
                     }
                }
   return salida;//salida: [,###,####,##,##]
 }
    
     public static void main(String[] args){
//        String trama = "6##3###4";
//        String entrante[]=trama.split("[#*]");
//        System.out.println(Arrays.toString(entrante));
//        String saliente[]= removeNull(entrante);
//        System.out.println(Arrays.toString(saliente));
        //String patronEspecial [] = "#*1#1*".split("[0-9]+");
        //String patronEspecial [] = "#*#*".split("");
        //System.out.println(Arrays.toString(patronEspecial));
//        String prueba = "90";
//        double print = java.lang.Math.sin(java.lang.Math.toRadians(Double.parseDouble(prueba)));
//        System.out.println(print);
//          String trama="90######*";
//          String operadores[] = trama.split("[0-9]+");
//          System.out.println(Arrays.toString(operadores));
//          System.out.println(removeAst(operadores));
         String trama = "1##2###3***";
         String operadores[] = trama.split("[0-9*]+");
         System.out.println("operadores:"+Arrays.toString(operadores));
        // System.out.println("RemoveAst:"+Arrays.toString(removeA(operadores)));
        
    }
}



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
    
    
     public static void main(String[] args){
//        String trama = "6##3###4";
//        String entrante[]=trama.split("[#*]");
//        System.out.println(Arrays.toString(entrante));
//        String saliente[]= removeNull(entrante);
//        System.out.println(Arrays.toString(saliente));
        //String patronEspecial [] = "#*1#1*".split("[0-9]+");
        //String patronEspecial [] = "#*#*".split("");
        //System.out.println(Arrays.toString(patronEspecial));
        String prueba = "45";
        
        System.out.println(java.lang.Math.sin(java.lang.Math.toRadians(Double.parseDouble(prueba))));
        
    }
}



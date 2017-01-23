/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.util.Scanner;

/**
 *
 * @author VOSORNIOM
 */
public class Tarea {

    

    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);  //declara entrada
      System.out.println("ingrese cadena");
      String cadena=leer.nextLine(),suma = "";  //guarda la cadena
      
      
      int largo=cadena.length(), sum=0;  //guarda largo de cadena
      
      for(int i=0; i<largo; i++){  //recorre la cadena
         if (Character.isDigit(cadena.charAt(i)))
         {  //si el caracter es digito             
                suma+= cadena.charAt(i);                 
         }else if(cadena.charAt(i) == '+' )
         {
                  sum=sum+Integer.parseInt(suma);
                  suma="";
         }else
                 System.out.println("Error"); 
         
       }
      
      System.out.println(" Cadena es: " +  cadena);  //imprime cadena
      System.out.println(" suma es: " +  sum);  //imprime suma
    }  
    
}

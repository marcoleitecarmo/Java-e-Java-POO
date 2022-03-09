/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Exerc09 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
             
        boolean notaValida = false;
       
        
       System.out.println("Entre com uma nota ");
     
     double nota = scan.nextDouble();
      
     if (nota >= 0 && nota <= 10){
          notaValida = true;      
     System.out.println ("Você digitou: " + nota );
      }  else {
      
     System.out.println("Nota inválida, digite novamente. ");
     }
    }     }
               
     
   

      
   
        


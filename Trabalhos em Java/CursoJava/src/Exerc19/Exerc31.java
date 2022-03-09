/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exerc19;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Exerc31 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int [] vetorA = new int [5];
        
        for(int i=0; i< vetorA.length;i++){
            System.out.println("Entre com os valor do vetor A " + i);
            vetorA[i] = scan.nextInt();
       }
      for(int i = 0; i < vetorA.length; i++){
        System.out.println("Tabuada de " + vetorA[i]);
        for( int  j = 1; j <=10; j ++){
        
            System.out.println(j + " X " + vetorA[i] + " = " +(vetorA[i]*j) );
    }  
          System.out.println();
      }
    
}
}
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
public class Exerc02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int [] vetorA = new int [8];
        int [] vetorB = new int[vetorA.length];
        
        for(int i =0; i < vetorA.length; i++){
            
            System.out.println(" Entre com o valor da posição: " + i);
            
            vetorA[i]= scan.nextInt();
            
            vetorB [i] = vetorA [i] * 2;
            
        }
        System.out.println("Vetor A = ");
        for(int i = 0; i< vetorA.length; i++){
            System.out.println(vetorA [i] + " ");
            
        }
        System.out.println();
        
        System.out.println("Vetor B = ");
        for(int i = 0; i < vetorB.length; i++){
            System.out.println(vetorB[i] + " ");
            
        }
        System.out.println();
    }
    
}

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
public class Exerc23 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int [] vetorA = new int [10];
        
        for (int i = 0; i < vetorA.length;i ++){
            System.out.println("Entre com um numero para posição " + i);
            vetorA[i] = scan.nextInt();
       }
    boolean palindromo = true;
    
    for ( int i = 0; i < vetorA.length; i ++){
        if (vetorA [i] != vetorA[vetorA.length - 1 - i]){
            palindromo = false;
            break;
       
        }
    }
    
        System.out.print("Vetor A = ");
        for(int i = 0; i < vetorA.length; i ++){
            System.out.print(vetorA [i] + "  ");
        }
        System.out.println();
        
        
        if(palindromo){
            System.out.println("Palindromo");
        }else{
            System.out.println("Não é palindromo ");
        }
            
    }
    
}

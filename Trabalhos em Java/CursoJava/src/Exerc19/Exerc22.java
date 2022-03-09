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
public class Exerc22 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int [] vetorA = new int [10];
        
        for( int i = 0; i < vetorA.length; i++){
        
        System.out.println("Entre com um numeor para posição " + i);
        vetorA [i] = scan.nextInt();
    if(vetorA[i] % 2 !=0){
        break;
    }
    }
        
    }
}

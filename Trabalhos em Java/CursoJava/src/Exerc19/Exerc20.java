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
public class Exerc20 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double [] vetorA = new double [20];
        double cotacao;
        
        
        System.out.println("Entre com a cotação do Dolar: ");
        cotacao = scan.nextDouble();
        
        for(int i = 0; i < vetorA.length; i ++ ){
            vetorA [i] = cotacao * (i + 1);
        }
        
        System.out.print("Vetor A = ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA [i] + "  ");
        }
    
        System.out.println();
    }
    
}

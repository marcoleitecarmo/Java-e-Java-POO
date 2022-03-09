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
public class Exerc18 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
    
    int [] idades = new int [10];
    
    for ( int i = 0; i < idades.length; i ++){
        System.out.println("Entre com a idade das Pessoas " + (i +1));
        idades[i] = scan.nextInt();
   }
    
    int menor = idades [0];
    int indexMenor = 0;
    int maior = idades [0];
    int indexMaior = 0;
    
    for ( int i = 0; i < idades.length; i++){
        if(idades[i] > maior){
            indexMaior = i;
        } else if (idades [i] < menor ){
            menor = idades [i];
            indexMenor = i;
            
        }
    }
            System.out.print("Vetor de idades = ");
            for ( int i = 0;i < idades.length; i++){
                System.out.print(idades[i] + "   ");
            }
        
            System.out.println();
        
            System.out.println("Menor idade = " + menor);
            System.out.println(" Indice menor idade: " + indexMenor);
            System.out.println("Maior idade = " + maior);
            System.out.println(" Indice manior idade: " + indexMaior);
         
    
    
    }
    
}

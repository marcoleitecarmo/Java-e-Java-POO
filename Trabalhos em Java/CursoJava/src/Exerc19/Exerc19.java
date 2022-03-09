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
public class Exerc19 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
    
    double [] nota1 = new double [10];
    double [] nota2 = new double [nota1.length];
    double [] resultado = new double [nota1.length];
    
    for (int i = 0; i < nota1.length; i++){
        System.out.println("Entre com a nota 1 " + (i + 1));
        nota1 [i] = scan.nextDouble();
        
        System.out.println("Entre com a nota 2 " + (i + 1));
        nota2 [i] = scan.nextDouble();
    
    resultado [i] = (nota1 [i] + nota2 [i]) / 2;
    }
    
        System.out.print(" Nota 1 = ");
        for ( int i = 0; i < nota1.length; i ++){
            System.out.print(nota1 [i] + "  ");
        }
    
     System.out.println();
     
        System.out.print(" Nota 2 = ");
        for ( int i = 0; i < nota2.length; i++){
            System.out.print(nota2 [i] +  "  ");
        }
     
        System.out.println();
    
        System.out.println(" Resultado: ");
        for(int i =0 ; i < resultado.length; i ++){
            if (resultado [i] >= 7){
                System.out.println(resultado [i] + " Aprovado ");
            } else {
                System.out.println(resultado [i] + " Reprovado ");
            }
        }
    
    
    }
    
}

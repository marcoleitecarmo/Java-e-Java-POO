/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

/**
 *
 * @author marco
 */
public class Exerc04 {
      public static void main(String [] arg){
         
          for( int i = 1; i<=100; i++){
          if( i % 3 == 0){
              System.out.println("É multiplo de 3= " + i);
          } else {
              System.out.println("Não é multiplo de 3= " + (i % 3 !=0));
          }
      }
      }
}



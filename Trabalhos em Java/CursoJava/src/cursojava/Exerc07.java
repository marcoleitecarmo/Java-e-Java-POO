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
public class Exerc07 {
      public static void main(String [] arg){
         
      int primeiro = 1;
      int segundo = 1 ;
      int proximo = 0;
      
      System.out.println(primeiro);
      System.out.println(segundo);
      
      while (proximo <=100){
              proximo = primeiro + segundo;
              primeiro = segundo;
              segundo = proximo;
                      
       System.out.println(proximo);
       
       
       
                     
                      
         
          
          
          
                      
          }
      }
}

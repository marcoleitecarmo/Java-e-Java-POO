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
public class BalancoTrimestral {
    
    public static void main(String [] args){
        
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        
        int gastosTrimestral = gastosJaneiro + gastosFevereiro + gastosMarco;
        
        System.out.println("O Balanço Trimestral foi de:  " + gastosTrimestral);
                
    }
    }

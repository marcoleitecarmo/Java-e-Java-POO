/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Exerc08 {
    
    public static void main(String []args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o valor por hora: ");
        double valorHora = scan.nextDouble();
        
        System.out.println("Entre com as horas trabalhadas: ");
        double qtdHoras = scan.nextDouble();
        
        double salarioBruto = valorHora * qtdHoras;
        
        int percetualIR = 0;
        if (salarioBruto <= 900) {
            percetualIR = 0;
            
        } else if (salarioBruto > 900 && salarioBruto <= 1500){
            percetualIR = 5;
        }else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            percetualIR = 10;
        } else if (salarioBruto> 2500){
            percetualIR = 20 ;
        }
        double ir = (salarioBruto / 100) * percetualIR;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double despesas = ir + inss;
        double salarioLiquido = salarioBruto - despesas;
        
        System.out.println(" Salario Bruto: (" +valorHora+ " * " +qtdHoras+ "): " + salarioBruto);
        System.out.println(" (-) IR (" + percetualIR + "%) :" + ir);
        System.out.println("(-) INSS (10%):"  + inss);
        System.out.println(" (-)FGTS (11%):"  + fgts);
        System.out.println("Total de Descontos: " + despesas);
        System.out.println("Salario Liquido: " + salarioLiquido);
        
        } 
     
        
        
        
        
        
        
        
    }

     
    


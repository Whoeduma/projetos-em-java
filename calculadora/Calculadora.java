/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class Calculadora {

   public int som(int num1, int num2) {
        return num1 + num2;
    }  
    public int sub(int num1, int num2){
        return num1 - num2;
    }  
    public int div(int num1,int num2){
        return num1 / num2;
    }  
    public int mult(int num1, int num2){
        return num1 * num2;
    }  
    
    // --------------- Metodo principal
    
    public static void main (String args[]){ 
        //criando um objeto c a apartir do metodo calc  
        Calculadora c = new Calculadora();  
          
        //declarando as varíaveis  
        int opcao = 5;  
        int num1;  
        int num2;  
          
		Scanner input = new Scanner(System.in);
        System.out.println("-Escolha uma opcao-");  
        System.out.println("1. Soma");    
        System.out.println("2. Subtracao");    
        System.out.println("3. Multiplicacao");    
        System.out.println("4. Divisao");    
        System.out.println("0. Sair");    
        System.out.println("Operacao: ");    
          
        opcao = input.nextInt();  
          
        while (opcao != 0) {
			Scanner input1 = new Scanner(System.in);    
			
			System.out.println("Qual o primeiro numero: ");  
			num1 = input1.nextInt();  
			System.out.println("Qual o segundo numero: ");  
			num2 = input1.nextInt();
			
			if ( opcao == 1 ) {
				int operacao = c.som(num1, num2);
                System.out.printf("\nO resultado da soma e: %d\n", operacao);  
                break;  
            }  
            else if (opcao == 2) { 
				int operacao = c.sub(num1, num2);
				System.out.printf("\nO resultado da subtracao e: %d\n", operacao);  
				break;  
			}  
			else if (opcao == 3) {
				int operacao = c.mult(num1, num2); 
				System.out.printf("\nO resultado da multiplicacao é: %d\n", operacao);    
				break;  
			}  
			else if (opcao == 4) {  
				int operacao = c.div(num1, num2);  
				System.out.printf("\nO resultado da divisão e: %d\n", operacao);   
				break;  
			}  
			else{  
				System.out.println("????");  
				break;  
			}      
        }
    }  
}

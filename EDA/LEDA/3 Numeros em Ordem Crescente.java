/*
 
 * 2 - 3 Numeros em Ordem Crescente

 * Descrição
    Faça um programa que leia 3 números inteiros e os imprima em ordem crescente.
 * Formato de entrada
    03 números inteiros separados por um final de linha.
 * Formato de saída
    Os 03 números lidos impressos em ordem crescente, cada um em uma linha.
 */
import java.io.*;
import java.util.*;

public class HuxleyCode {
    public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in); 
	    
	    int n1 = sc.nextInt();
	    int n2 = sc.nextInt();
	    int n3 = sc.nextInt();
	    
		if (n1 < n2)                                           
            if (n2 < n3) 
                System.out.printf("%d\n%d\n%d\n", n1, n2, n3);       
            else                                             
                if (n1 < n3) 	
                    System.out.printf("%d\n%d\n%d\n", n1, n3, n2);   
                else 	
                    System.out.printf("%d\n%d\n%d\n", n3, n1, n2);        
        else                                                
            if (n2 < n3)                                       
                if (n1 < n3) 	
                    System.out.printf("%d\n%d\n%d\n", n2, n1, n3);   
                else 	
                    System.out.printf("%d\n%d\n%d\n", n2, n3, n1);         
            else 
                System.out.printf("%d\n%d\n%d\n", n3 ,n2, n1);          
  }
}
/*
 * 77 - Ordenação Ingênua
 * 
 * Descrição
    Dado um conjunto de n valores inteiros, ordene-os em ordem crescente.

 * Formato de entrada
    Um inteiro n indicando quantos números serão fornecidos, seguidos de n inteiros separados por um final de linha

 *  Formato de saída
    A sequência de n números ordenada em ordem crescente, obedecendo ao seguinte formato:
    [numero][numero][numero][numero]
    Onde depois do último número existe um final de linha.
 */
import java.util.Scanner;
import java.util.Arrays;

public class HuxleyCode {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();  
        
        int[] num = new int[n];
        
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            sc.nextLine();  
        }
        
        Arrays.sort(num);
        
        for (int i = 0; i < n; i++) {
            System.out.print("["+num[i]+"]");
        }
        System.out.println();  
        
        sc.close();
    }
}
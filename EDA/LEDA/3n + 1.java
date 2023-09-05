/*

 * 407 - 3n + 1
 
 * Descrição
    Considere o seguinte algoritmo para gerar uma sequência de números. Comece com um inteiro n. Se n for par, divida por 2. Se n for ímpar, multiplique por 3 e some 1. Repita esse processo com o novo valor de n, terminando quando n = 1. Por exemplo, a seguinte sequência de números será gerada quando n é 22:
    22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
    Embora ainda não exista uma prova, os matemáticos acreditam que esse algoritmo sempre termina com n=1, para qualquer inteiro n. Bem, para este problema aqui no Huxley, essa propriedade se mantém para qualquer inteiro menor que 1.000.000.
    Para uma entrada n, o "tamanho do ciclo" de n é a quantidade de números gerados até o 1 (incluindo o próprio 1). No exemplo acima, o "tamanho do ciclo" de 22 é 16. 
    Dado dois números i e j, determine o máximo "tamanho do ciclo" dentre todos os números entre i e j, incluindo tanto i quanto j.
    
 * Formato de entrada
    A entrada consiste de uma série de pares de inteiros i e j, um par de inteiros por linha. Todos os inteiros serão menores que 1.000.000 e maiores que 0.
    Perceba que a entrada só termina quando não houveram mais números. Descubra como fazer o seu programa funcionar nesse caso. Cada linguagem tem uma forma diferente de ler enquanto ainda houver entrada a ser lida.

 * Formato de saída
    Para cada par de inteiros i e j, imprima i e j na mesma ordem na qual eles aparecem na entrada e então imprima o máximo "tamanho de ciclo" encontrado. Esses 3 números devem ser separados por um espaço, com todos os 3 números em uma linha e sendo uma linha de saída para cada linha da entrada.
    Veja o arquivo de exemplo para entender melhor o formato da entrada e da saída.
*/
import java.io.*;
import java.util.*;

public class HuxleyCode {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        
	    int i, j, k, n, maior, menor, auxK=0;
	    
	    while (true && sc.hasNextInt()) {
	        i = sc.nextInt();
	        j = sc.nextInt();
	        
		    if ((i < 1) || (j < 1) || (i > 1000000) || (j > 1000000))
		        break;
            if(i >= j){
                maior = i;
                menor = j;
            }else{
                maior = j;
                menor = i;
            }
            
            for(n = menor; n <= maior; n++){
                int aux=n;
                for(k = 1; aux != 1;k++){
                    
                    if(aux%2 == 0){
                        aux = aux / 2;
                    }else{
                        aux = 3* aux + 1;
                    }
                }
                if(k > auxK){
                    auxK = k;
                }
            } 
            System.out.printf("%d %d %d\n", i, j, auxK);
            auxK = 0;
        }
    }
}
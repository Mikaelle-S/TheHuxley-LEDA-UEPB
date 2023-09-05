/*
 * 868 - 5 maiores do sorteio

 * Descrição
    Dado um quantidade de números N,  um dígito sorteado D e N números, sua tarefa é informar os 5 maiores números sorteados que possuem o ultimo dígito igual a D, caso não exista números suficientes você deve substitui-los por -1.
    Os números devem ser impressos em ordem crescente.

 * Formato de entrada
    Dois inteiros N e D, seguidos de N números não negativos.

    5 <= N <= 1000.

    0 <= D <= 9.

 * Formato de saída
    Os 5 maiores números sorteados , 1 por linha, ou -1 quando necessário.
 */
import java.io.*;
import java.util.*;

public class HuxleyCode {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int D = sc.nextInt();
        
        ArrayList<Integer> numComD = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num % 10 == D) {
                numComD.add(num);
            }
        }
        
        Collections.sort(numComD, Collections.reverseOrder());
        
        ArrayList<Integer> resultado = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (i < numComD.size()) {
                resultado.add(numComD.get(i));
            } else {
                resultado.add(-1);
            }
        }
        Collections.sort(resultado);
        
        for (int num : resultado) {
            System.out.println(num);
        } 
        
        sc.close();
    }
}
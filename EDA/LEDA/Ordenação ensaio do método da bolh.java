/*
 * 3584 - Ordenação ensaio do método da bolha
 
 * Descrição
    Implemente a estratégia de bubble sort para ordenar os n maiores números de uma sequência de inteiros passada como parâmetro.

 * Formato de entrada
    A entrada consiste de duas linhas de valores. Na primeira linha, o valor correspondente ao tamanho do vetor a ser passado e o valor de n. Na segunda linha a sequência a ser usada para ordenação.
    O valor de m - Você deve passar um inteiro que corresponde ao tamanho da sequência de valores a ser informada na linha a seguir.
    O valor de n - Você deve informar quantos números o algoritmo deve ordenar, ou seja, os n maiores números a serem ordenados. Onde n deve ser menor do que a quantidade de números passada como parâmetro.
    Em seguida deve informar uma sequência de valores inteiros separados por espaço.

 * Formato de saída
    Deve ser impresso os arrays correspondentes a cada passo do processo de ordenação pelo método da bolha. Desta forma, ao final deve ser impresso o conjunto de números correspondentes ao array de entrada com os n maiores números ordenados.

 */
import java.io.*;
import java.util.*;

public class HuxleyCode {
     public static void bubbleSort(int[] array, int n) {
        int len = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt(); 
        int n = sc.nextInt();
        
        int[] array = new int[m];
        
        for(int i = 0; i < m; i++) {
            array[i] = sc.nextInt();
        }

        bubbleSort(array, n);
    }
}
/*
 * 531 - Selection Sort

 * Descrição
    O algoritmo Selection Sort é um algoritmo de ordenação que funciona da seguinte forma: dada uma sequência de elementos em um array A (neste exercício, consideramos apenas números), procuramos inicialmente o menor elemento de A e o colocamos na primeira posição de A (trocando de lugar com a posição onde ele estava anteriormente). Em seguida, procuramos pelo segundo menor elemento de A, e o colocamos na segunda posição do array. Continuamos repetindo esta tarefa para os primeiros n-1 elementos de A.
    Neste exercício, deve ser implementado o algoritmo Selection Sort, ilustrando o passo a passo de execução do algoritmo, conforme detalhado no formato de entrada e saída abaixo.

 * Formato de entrada
    A entrada é constituída por uma linha contendo uma sequência de números a serem ordenados. 

 * Formato de saída
    Para cada chave, a saída deve imprimir o passo-a-passo de cada modificação efetuada pelo algoritmo, imprimindo o conteúdo do vetor entre barras verticais e o menor elemento encontrado naquele passo. Entre uma passada e outra deve ser impressa uma linha em branco. 
    Ao final da ordenação, deve ser impresso o resultado final da execução do algoritmo. 

 */
import java.io.*;
import java.util.*;

public class HuxleyCode {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }

            System.out.println("Menor elemento neste passo: " + array[minIdx]);

            int temp = array[i];
            array[i] = array[minIdx];
            array[minIdx] = temp;

            System.out.print("Estado Atual: ");
            for (int k = 0; k < array.length; k++) {
                System.out.print(array[k]);
                if (k < array.length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] input = sc.nextLine().split(" ");
        int[] array = new int[input.length];
        
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        selectionSort(array);

        System.out.print("Resultado Final: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" | ");
            }
        }
    }
}
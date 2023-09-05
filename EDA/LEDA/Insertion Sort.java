/*
 * 527 - Insertion Sort
 
 * Descrição
    O algoritmo Insertion Sort é um algoritmo eficiente para ordenar quantidades pequenas de elementos. A intuição do seu funcionamento é semelhante à maneira como organizamos uma mão de cartas progressivamente. Partindo de uma pilha de cartas na mesa, e com a mão esquerda vazia, puxamos uma carta de cada vez com a mão direita e inserimos a mesma na posição correta correspondente na mão esquerda. Para definir a posição correta de uma carta, é necessário compará-la com cada uma das cartas na mão esquerda, começando da carta mais à direita até, no máximo, a carta mais à esquerda. Desta forma, sempre que buscamos uma carta da pilha da mesa, a mão esquerda tem uma sequência ordenada de cartas. 

    Neste exercício, devemos implementar o algoritmo Insertion Sort, ilustrando o passo a passo de execução do algoritmo, conforme detalhado no formato de entrada e saída abaixo.

 * Formato de entrada
    A entrada é constituída por uma linha contendo uma sequência de números a serem ordenados. 

 * Formato de saída
    Para cada chave, a saída deve imprimir o passo-a-passo de cada troca efetuada pelo algoritmo, imprimindo o conteúdo do vetor entre barras verticais. Entre uma chave e outra deve ser impressa uma linha em branco. 

    Ao final da ordenação, deve ser impresso o resultado final da execução do algoritmo
 */
import java.io.*;
import java.util.*;

public class HuxleyCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] input = sc.nextLine().split(" ");
        
        int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        insertionSort(arr);

        sc.close();
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            int chave = arr[i];
            System.out.println("Chave: " + chave);
            imprimir("Estado Atual", arr);

            int j = i - 1;

            while (j >= 0 && arr[j] > chave) {
                arr[j + 1] = arr[j];
                j--;
                if (j >= 0 && arr[j] <= chave) {
                    arr[j + 1] = chave;
                }
                arr[j + 1] = chave;
                imprimir("", arr);
                
            }
            System.out.println();
        }

        System.out.println("Resultado Final: " + arrayToString(arr));
    }

    private static void imprimir(String label, int[] arr) {
        if (!label.isEmpty()) {
            System.out.print(label + ": ");
        }
        System.out.println(arrayToString(arr));
    }

    private static String arrayToString(int[] arr) {
        return Arrays.toString(arr).replaceAll(", ", " | ").replaceAll("[\\[\\]]", "");
    }
}
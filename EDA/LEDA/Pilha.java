/*
 * 2499 - Pilha

 * Descrição
    Pilha é uma estrutura de dados linear capaz de armazenar uma coleção de elementos que somente são acessados a partir do seu lado superior, denominado topo. Assim, os elementos da pilha são manipulados, sempre, pelo topo da pilha.
    Considerando uma estrutura de dados do tipo Pilha, então, implemente as seguintes operações:
    Empilhar: essa operação adiciona um novo elemento da pilha, ela receberá o valor do novo elemento como parâmetro.
    Desempilhar: essa operação remove o elemento que está no topo da pilha.
    Imprimir: essa operação imprime o valor de todos os elementos presentes na pilha, a impressão deve começar a partir do topo.
    A última linha da entrada contém o seguinte texto Finalizar

 * Formato de entrada
    A entrada será composta por várias linhas, sendo que em cada linha haverá um comando.
    Os comandos possíveis são:

    1. Empilhar
    Esse comando será seguido pelo valor do novo elemento que está sendo adicionado na pilha.

    2. Desempilhar
    Esse comando remove o elemento que está no topo da pilha. 

    3. Imprimir
    Esse comando imprime o valor de todos elementos presentes na pilha, a impressão deve ser feita em uma mesma linha, separando os valores por espaço.

    4. Finalizar
    Esse indica a última linha da entrada

    Exemplo de uma entrada:

    Empilhar 4

    Empilhar 5
    Imprimir
    Empilhar 2
    Imprimir
    Desempilhar
    Imprimir
    Empilhar 8
    Empilhar 12
    Imprimir
    Finalizar

 * Formato de saída

    Cada linha da saída terá o resultado de um comando Imprimir.
    Considerando a seguinte entrada:

    Empilhar 4
    Empilhar 5
    Imprimir
    Empilhar 2
    Imprimir
    Desempilhar
    Imprimir
    Empilhar 8
    Empilhar 12
    Imprimir
    Finalizar

    A Saída seria:

    5 4
    2 5 4
    5 4
    12 8 5 4

    Observe que, na entrada, o comando Imprimir apareceu quatro vezes, e por isso a saída tem quatro linhas.
 */

import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Collection;

public class HuxleyCode {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String entrada;
        entrada = sc.nextLine();
    
        Pilhagem pilha = new Pilhagem();
    
        while(!(entrada.equals("Finalizar"))){
            
            String arrayTratado[] = entrada.split(" ");
         
            if(arrayTratado[0].equals("Empilhar")){
                int element = Integer.parseInt(arrayTratado[1]);
                pilha.push(element);
            }
            else if(arrayTratado[0].equals("Desempilhar")){
                pilha.pop();
            }
            else if(arrayTratado[0].equals("Imprimir")){
                pilha.imprimir();
            }
            entrada = sc.nextLine();
        }
	}
}

class Pilhagem {
    ArrayList<Integer> array = new ArrayList<Integer>();
    ArrayList<Integer> arrayInverted = new ArrayList<Integer>();
    
    void push(int x) {
        array.add(x);
        arrayInverted.add(0,x);
    }

    void pop() {
        array.remove(array.size()-1);
        arrayInverted.remove(0);
    }

    void imprimir(){
        for(int i = 0; i < array.size(); i++){
            int aux = arrayInverted.get(i);

            if(i == array.size() - 1){
                System.out.printf("%d\n",aux); 
            }
            else{
                System.out.printf("%d ",aux); 
            }
        }       
   }
}

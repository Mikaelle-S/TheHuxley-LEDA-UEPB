/*
 * 2216 - Pilha e o valor absoluto
 
 * Descrição
    Sua tarefa é implementar uma pilha que além de possuir as funções normais de push e pop , deverá conter uma função para retornar em O(1) o valor absoluto da diferença entre o maior e o menor elemento que já foram inseridos na pilha (sem remover o topo).

 * Formato de entrada
    A entrada será composta de vários comandos nos formatos:

    push x

    pop

    abs

    onde o x da entrada "push x" é um inteiro, onde  0 <= x <= 1000 .

    obs: não serão dados comandos de pop e abs se a pilha estiver vazia.

 * Formato de saída
    Para cada comando "pop" você deverá imprimir o topo da pilha.
    Para cada comando abs você deverá imprimir o valor absoluto da diferença entre o maior e o menor elemento já inseridos.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.io.*;
import java.util.*;

public class HuxleyCode {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Pilhagem pilha = new Pilhagem();
        while(sc.hasNext()){
            String entrada = sc.nextLine();
            String listaTratada[] = entrada.split(" ");
               
            if(listaTratada[0].equals("push")){
                int num = Integer.parseInt(listaTratada[1]);
                pilha.push(num);
            }
            else if(listaTratada[0].equals("pop")){
                pilha.pop();
            }
            else if(listaTratada[0].equals("abs")){
                pilha.abs();
            }
        }
    }
}
  
class Pilhagem {
    ArrayList< Integer > a = new ArrayList< Integer >(); 
    void push(int x) {
        a.add(x);
    }
  
    void pop() {
        System.out.println(a.get(a.size()-1));
        a.remove(a.size()-1);
    }
  
    void abs(){
        int high= -1, low = 1001;
  
        for(int i = 0; i < a.size(); i++){
            if(a.get(i) > high){
                high = a.get(i);
            }
            if(a.get(i) < low){
                low = a.get(i);
            }
        }    
        System.out.println(high - low);
    }
}
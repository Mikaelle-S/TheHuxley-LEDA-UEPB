
/*
 
 * 2892 - Criando a matriz

 * Descrição
    Faça um programa em linguagem C que crie a seguinte uma matriz quadrada N x N conforme o modelo abaixo para N = 4:
    (imagem)
    Cada elemento deve ser impresso ocupando 7 espaços de tela alinhados à esquerda.
 * Formato de entrada
    O usuário deverá inserir a ordem N da matriz.
 * Formato de saída
    O programa deve imprimir a matriz quadrada conforme exemplo da descrição, com cada elemento impresso ocupando 7 espaços de tela alinhados à esquerda, imprimindo na tela:

    Digite a ordem N da matriz:

    n      n      n      n     

    n      n      n      n     

    n      n      n      n     
*/
import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite a ordem N da matriz:");
        n = sc.nextInt();
        int matriz [][] = new int [n][n]; 
        for(int i=0; i<n;i++){
            for(int j=0; j<n;j++){
               if(i == j){
                   matriz[i][j]=1;
               }else if(i<j){
                   matriz[i][j]=10;
               }else{
                   matriz[i][j]= -10;
               }
               System.out.printf("%-7d",matriz[i][j]);
            }
            System.out.println();
        }
    }
}

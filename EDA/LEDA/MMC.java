/*
 * 2437 - MMC
 
 * Descrição
    Escreva um programa que calcule o mínimo múltiplo comum (MMC) entre dois números inteiros fornecidos pelo usuário.

 * Formato de entrada
    A entrada deve ser composta de dois números inteiros fornecidos em dois inputs diferentes.

    Exemplo:
    5
    6

 * Formato de saída
    A saída deve ser apenas o mmc entre os dois valores.

    Exemplo:
    30
 */
import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println((a * b) / mdc(a, b));
    }

    public static int mdc(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mdc(b, a % b);
        }
    }
}
/*
 * 1017 - Brincando com Fibonacci
 
 *Descrição
    Vamos brincar com Fibonacci.
    Na matemática, a Sucessão de Fibonacci (também Sequência de Fibonacci), é uma sequência de números inteiros.

 * Formato de entrada
    Um inteiro

 *  Formato de saída
    Um inteiro
 */
import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibonacci(n-1));
    }

    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
       
    }
}
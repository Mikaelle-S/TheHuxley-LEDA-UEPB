/*
 * 2522 - Conjuntos - Intersecção
 
 * Descrição
    Crie um programa que leia dois conjuntos (A e B - sem repetições em A e sem repetições em B) com 5 números inteiros em cada um. Em seguida mostre um terceiro conjunto com todos os elementos que estão em A e 
 
 * Formato de entrada
    1 2 3 4 5

    2 4 6 8 10

 * Formato de saída
    2 4
 */
port java.io.*;
import java.util.*;

public class HuxleyCode {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int []a = new int[5];
        int []b = new int[5];  
    
        a[0] = sc.nextInt();a[1] = sc.nextInt();a[2] = sc.nextInt();a[3] = sc.nextInt();a[4] = sc.nextInt();
        b[0] = sc.nextInt();b[1] = sc.nextInt();b[2] = sc.nextInt();b[3] = sc.nextInt();b[4] = sc.nextInt();
        
        int [] c = new int[10];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i] == b[j]){
                    c[i]=a[i];
                    System.out.printf("%d ",c[i]);
                }
            }
        }
    }
}
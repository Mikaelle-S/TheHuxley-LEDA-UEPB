/*
 * 2292 - Decimal para Hexadecimal (usando pilha)

 * Descrição
    Usando o tipo TPilha visto em aula e as funções básicas de pilha, construa um programa que leia um natural n e passe como parâmetro para a função char *hexadecimal(int n) que deverá devolver uma string com o valor hexadecimal de n.
    Obs.: (1) Deve ser usada uma pilha na função; (2) Cuidado com o '\0'; (3) Além das funções básicas de pilha, criar somente a hexadecimal(n); (4) não usar recursão.

 * Formato de entrada
    Um natural n (0 <= n <= 65536).

 * Formato de saída
    O correspondente hexadecimal da entrada e uma quebra de linha.
 */
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class HuxleyCode {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int entrada = sc.nextInt();
		
	    System.out.println(convertToHex(entrada));
	}
	
	public static String convertToHex(int entrada) {
		char[] hexList = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

		int rest;
		String saida = "";
		Listagem pilhagem = new Listagem();

		if(entrada == 0){
            pilhagem.colocarInicio('0');
        }
        
        while(entrada > 0) {
			rest = entrada % 16;
			pilhagem.colocarInicio(hexList[rest]);
	    	entrada /= 16;
		}
		
		Laco lugar = pilhagem.inicio;
		while(lugar != null) {
			saida += pilhagem.tirarInicio().rest;
			lugar = lugar.proximo;
		}
		return saida;
	}
}

class Listagem{
	Laco inicio = null;
	int tamanho = 0;
	
	public void colocarInicio(char rest) {
		Laco Laco = new Laco(rest);
		Laco.setProximo(inicio);
		inicio = Laco;
		tamanho++;
	}
	
	public Laco tirarInicio() {
		if (inicio == null) {
			return null;
		}
		Laco info = inicio;
		inicio = inicio.proximo;
		tamanho--;
		return info;
	}
	
	public String toString() {
		String str = "";
		
		Laco lugar = inicio;
		while(lugar != null) {
			 str += "RESTO: " + lugar.rest + "\n";
			 lugar = lugar.proximo;
		}
		return str;
	}
}

class Laco{
	char rest;
	Laco proximo;
	
	public Laco(char rest) {
		this.rest = rest;
	}

    public Laco getProximo() {
		return proximo;
	}

	public void setProximo(Laco proximo) {
		this.proximo = proximo;
	}

	public char getRest() {
		return rest;
	}

	public void setRest(char rest) {
		this.rest = rest;
	}
}
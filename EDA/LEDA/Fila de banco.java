/*
 * 5 - Fila de banco

 * Descrição
    Fila de banco é sempre uma dor de cabeça. No Banco do Brasilo, existem apenas dois caixas para atender as pessoas. Porém, toda hora do almoço é um problema, pois existem duas filas de pessoas e um dos funcionários precisa ir comer. Então, as duas filas precisam ser integradas. Sempre dá confusão. Para minimizar o problema, o gerente do banco, muito sovina, ao invés de contratar mais um funcionário, propôs a seguinte solução. As pessoas da fila do funcionário que foi almoçar devem ser intercaladas com as pessoas da fila do funcionário que ficou trabalhando, a partir da segunda posição. E haja confusão!
 * Formato de entrada
    Consiste dos inteiros n, m e k (0<=n <=10000, 0<=m <=10000, 1<=k<=2) correspondendo, respectivamente, a quantidade de pessoas que existem em cada fila e qual foi à fila que o funcionário foi almoçar, sendo k=1 para a primeira fila e k=2 para a segunda fila. Seguidos de n inteiros representando as pessoas da primeira file e m inteiros representando as pessoas da segunda fila. Os inteiros nunca se repetem.
 
 * Formato de saída
    Consiste em uma sequência de inteiros, um em cada linha representando as pessoas da nova fila.
 */
import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int pessoas = sc.nextInt();
		int filas = sc.nextInt();
		int filasOrdem = sc.nextInt();
		
		CriandoLista listaPessoas = new CriandoLista();
		CriandoLista listaFilas = new CriandoLista();
		CriandoLista listaOrdem = new CriandoLista();
	
		for(int i = 0; i < pessoas; i++) {
			listaPessoas.finalLista(sc.nextInt());
		}
		for(int i = 0; i < filas; i++) {
			listaFilas.finalLista(sc.nextInt());
		}
		
		Nope primeiroLocal = listaPessoas.start;
		Nope segundoLocal = listaFilas.start;

		if(filasOrdem == 2) {
			while(  segundoLocal != null || primeiroLocal != null) {
				if(primeiroLocal != null ) {
					listaOrdem.finalLista(primeiroLocal.id);
					primeiroLocal = primeiroLocal.next;
				}
				if(segundoLocal != null) {
					listaOrdem.finalLista(segundoLocal.id);
					segundoLocal = segundoLocal.next;
				}
			}
		}
		else {
			while( primeiroLocal != null || segundoLocal != null ) {
				if( segundoLocal != null ) {
					listaOrdem.finalLista(segundoLocal.id);
					segundoLocal = segundoLocal.next;
				}
				if( primeiroLocal != null ) {
					listaOrdem.finalLista(primeiroLocal.id );
					primeiroLocal = primeiroLocal.next;
				}
			}
		}
		
		System.out.print(listaOrdem);
	}
	

}

class CriandoLista{
	Nope start = null;
	int lenght = 0;
	int tipoDeLista = 0;
	
	public void tipo(int tipo) {
		this.tipoDeLista = tipo;
	}
	
	public void finalLista(int id) {
		Nope Nope = new Nope(id);
		if(start == null) {
			Nope.next = null;
			start = Nope;
		}
		else {
			Nope local = start;
			while( local.next != null) {
				local = local.next;
			}
			local.next = Nope;
			Nope.next = null;
		}
		lenght++;
	}
	
	
	public String toString() {
		String str = "";
		
		Nope local = start;
		while(local != null) {
			 str += local.id + "\n";
			 local = local.next;
		}
		if(start == null) {
			str += "fila vazia!\n";
		}
		
		return str;
	}
}

class Nope{
	int id;
	Nope next;
	
	public Nope(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Nope getnext() {
		return next;
	}

	public void setnext(Nope next) {
		this.next = next;
	}
}
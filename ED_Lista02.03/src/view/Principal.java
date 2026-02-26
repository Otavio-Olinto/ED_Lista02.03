/*
 * Construir uma função recursiva que receba um vetor e seu tamanho e apresente a quan�dade de 
números pares existentes no vetor. Considere que a entrada deve ser, apenas de números naturais 
diferentes de zero. 
 */

package view;

import controller.Vetor;

public class Principal {

	public static void main(String[] args) {
		// Instanciando os métodos da Classe Vetor
		Vetor metodo = new Vetor();
		
		int tamanho, vetor[]= {1, 18, 8, 76, 9, 2, 4, 21};
		
		tamanho=vetor.length;
		
		System.out.println("Neste vetor há "+metodo.quantidadePares(vetor, tamanho)+
				" números pares");

	}

}

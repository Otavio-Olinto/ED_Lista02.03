package controller;

public class Vetor {

	public Vetor() {
		super();
	}
	
	public int quantidadePares(int[] vetor, int tamanho) {
		
		int qnt=0;
		
		// O ponto de parada deve ser quando o tamanho do vetor for 0
		
		if(tamanho==0) return 0;
		
		if(vetor[tamanho-1]%2==0) qnt++;
		
		return qnt+quantidadePares(vetor, tamanho-1);
	}

}

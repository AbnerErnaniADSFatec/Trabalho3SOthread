package br.fatec;
/**
 * @author Aluno
 * 
 * Classe responsável por calcular o fatorial
 *
 * @param numero
 * 		variavel para o fatorial
 * @param tempo
 * 		tempo de dormir na thread
 * 
 * @return
 * 		esse método retorna o valor de um número
 */

public class Fatorial implements Runnable{
	private int numero;
	private int tempo;
	
	public Fatorial(int numero, int tempo) {
		super();
		this.numero = numero;
		this.tempo = tempo;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(tempo);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Fatorial(" + numero + ") = " + fatorial(numero));
	}
	
	/**
	 * @param inteiro
	 * @return Retorna o fatorial de um número
	 */
	public int fatorial(int n) {
		if(n < 1) {
			return 1;
		}else {
			return n * fatorial(n - 1);
		}
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
}

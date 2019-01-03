package br.fatec;
/**
 * 
 * @author Aluno
 *
 * Classe responsavel por calcular a raiz quadrada de um numero
 *
 * @param numero
 * 		numero a ser calculado
 * @param tempo
 * 		tempo para dormir
 * 
 * @return
 * 		retorna a raiz quadrada do numero
 */
public class RaizQuadrada implements Runnable{
	private int numero;
	private int tempo;
	
	public RaizQuadrada(int numero, int tempo) {
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
		System.out.println("RaizQuadrada(" + numero + ") = " + raizQuadrada(numero));
	}
	
	/**
	 * @param inteiro
	 * @return Retorna a raiz quadrada de um número
	 */
	public double raizQuadrada(int n) {
		return Math.sqrt(n);
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

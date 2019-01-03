package br.fatec;
/**
 * 
 * @author Aluno
 * 
 * Classe responsavel por calcular a potencia de um numero
 *
 * @param numero
 * 		numero a ser calculado
 * @param expoente
 * 		expoente da potenciação
 * @param tempo
 * 		tempo para dormir
 * 
 * @return
 * 		retorna um numero elevado ao expoente
 */
public class Potenciacao implements Runnable{
	private int numero;
	private int expoente;
	private int tempo;
	
	public Potenciacao(int numero, int expoente, int tempo) {
		super();
		this.numero = numero;
		this.tempo = tempo;
		this.expoente = expoente;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(tempo);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Potencia(" + numero + "," + expoente + ") = " + potencia(numero, expoente));
	}
	
	/**
	 * @param base
	 * @param expoente
	 * @return Retorna a potencia de um número
	 */
	public int potencia(int base, int expoente) {
		if(expoente == 0) {
			return 1;
		}else {
			return base * potencia(base, expoente - 1);
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

	public int getExpoente() {
		return expoente;
	}

	public void setExpoente(int expoente) {
		this.expoente = expoente;
	}
}

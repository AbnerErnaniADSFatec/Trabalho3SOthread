package br.fatec;
public class App {
	public static void main(String[] args) {
		//Fatorial
		//Fatorial n = new Fatorial(5, 5000);
		Fatorial n = new Fatorial(5, 0);
		Thread executor1 = new Thread(n);
		executor1.setPriority(10);
		executor1.start();
		
		//Potencia
		//Potenciacao g = new Potenciacao(2, 3, 3000);
		Potenciacao g = new Potenciacao(2, 3, 0);
		Thread executor2 = new Thread(g);
		executor2.setPriority(5);
		executor2.start();
		
		//Raiz Quadrada
		//RaizQuadrada p = new RaizQuadrada(5, 10000);
		RaizQuadrada p = new RaizQuadrada(5, 0);
		Thread executor3 = new Thread(p);
		executor3.start();
		
		System.out.println("Fim do processamento!!!");
	}
}

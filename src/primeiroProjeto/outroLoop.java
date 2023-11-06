package primeiroProjeto;

import java.util.Scanner;

public class outroLoop {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double mediaAvaliacao = 0;
		int totalDeNotas = 0;
		double nota = 0;
		
		while (nota >= 0 && nota <= 10) {
			System.out.println("Digite a avaliação de 0 a 10 ou digite outro número para sair");
			
			nota = scanner.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
			mediaAvaliacao += nota;
			totalDeNotas++;
			}
		}
		System.out.println("A média de avaliação é: "+ mediaAvaliacao/totalDeNotas);
	}
}

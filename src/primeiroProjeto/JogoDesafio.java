package primeiroProjeto;

import java.util.Random;
import java.util.Scanner;

public class JogoDesafio {
	public static void main(String[] args) {
		
		int contador = 0;
		int aleatorio = new Random().nextInt(100);
		Scanner numero = new Scanner(System.in);
		
		while (contador <= 4) {
			System.out.println(aleatorio);
			System.out.println("Digite um número entre 0 e 100");
			int numeroDigitado = numero.nextInt();
			
			
			if (numeroDigitado == aleatorio) {
				System.out.println("Parabens, você adivinhou o número!");
				break;
			}if (numeroDigitado > aleatorio ) {
				System.out.println("O numero é menor que o digitado");
			}else {
				System.out.println("O numero é maior que o digitado");
			}
			contador++;
		}
		if(contador > 4) {
		System.out.println("Você perdeu!");
		}
		else {
			System.out.println("Você venceu!");
		
		}
	}
}

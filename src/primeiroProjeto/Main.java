package primeiroProjeto;

public class Main {
	public static void main(String[] args) {
		
		int anoDeLancamento = 2022;
		int classificacao;
		boolean incluidoNoPlano = true;
		double notaDoFilme = 8.1;
		double media = (9.8 + 6.3 + 8.8) / 3;
		String sinopse;
		classificacao = (int) (media/2);
		System.out.println("Bem vindo ao Screen Match!");
		System.out.println("Filme: Top Gun: Maverick");
		System.out.println("Ano de lançamento: " + anoDeLancamento);
		System.out.println("Nota da plataforma:" + notaDoFilme);
		System.out.println("Média: " + media);
		// """ incluído apenas a partir do Java 15
		/*
		 * Essa forma de comentar, atribui mais de uma linha de uma vez só		 * 
		 */
		sinopse = """
				Filme Top Gun
				Filme de aventura com galã dos anos 80
				Muito bom!
				Ano de lançamento
				""" + anoDeLancamento;
		System.out.println(sinopse);
		System.out.println("Classificação: " + classificacao);
		
	}

}

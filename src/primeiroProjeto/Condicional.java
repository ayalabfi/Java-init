package primeiroProjeto;

public class Condicional {

	public static void main(String[] args) {
		
		int anoDeLancamento = 1990;
		boolean incluidoNoPlano = true;
		double notaDoFilme = 8.1;
		String tipoPlano = "Plus";
		
		if (anoDeLancamento >= 2022) {
			System.out.println("Lançamentos que os clientes estão curtindo!");
		} else {
			System.out.println("Filme retrô que vale a pena assistir");
		}
		// && só é aceito se os 2 forem verdadeiros, já || significa que um ou outro tem que ser verdadeiro
		if (incluidoNoPlano == true && tipoPlano.equals("Plus")) {
			System.out.println("Filme liberado");
		}else {
			System.out.println("Deve pagar a locação");
		/*
		 * switch (expressão) {
   case valor1:
      // código a ser executado se a expressão for igual a valor1
      break;
      Isso server para criar diversos tipos de case, funciona como se fosse diversos if
		 */
		}
	}
}

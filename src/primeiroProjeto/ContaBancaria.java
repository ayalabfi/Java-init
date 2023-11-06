package primeiroProjeto;

import java.util.Scanner;

public class ContaBancaria {
	public static void main(String[] args) {
		
	double saldo = 0;
    int contador = 0;
    String tipo = new String();
    String menu = """
			Selecione a opção desejada no menu:
			1 - Consultar saldos
			2 - Receber valor
			3 - Transferir valor
			4 - Consultar menu
			5 - Sair
			""";
	Scanner texto = new Scanner(System.in);
	Scanner numero = new Scanner (System.in);
	
	System.out.println("Digite seu nome");
	String nome = texto.next();
	System.out.println("""
			Selecione as opções de acordo com as opções abaixo:
			Conta Corrente = 1;
			Conta Poupança = 2;
			""");
	
	while (contador < 3) {
				int codConta = numero.nextInt();
				if (codConta == 1) {
					contador = codConta;
					break;
				} if (codConta == 2) {
					contador = codConta;
					break;
				}else {
					System.out.println("Código incorreto, selecione uma opção valida.");
				}
	}
	if (contador == 1) {
		tipo = "Corrente";
	}if (contador == 2) {
		tipo = "Poupança";
	}
	System.out.println("Nome do titular: " + nome);
	System.out.println("Tipo da conta: " + tipo);
	System.out.println("Saldo: " + saldo);
	System.out.println();
	System.out.println(menu);
	int opcao = 0;
	while (opcao < 4) {
		int opcaoCodigo = numero.nextInt();
		if (opcaoCodigo > 5){
			System.out.println("Opção invalida");
		}	
		switch (opcaoCodigo) {
		case 1: System.out.println("O seu saldo é:" + saldo);
		break;
		case 2: System.out.println("Digite o valor que deseja depositar: ");
		int deposito = numero.nextInt();
		saldo += deposito;
		System.out.println("O seu saldo agora é: " + saldo);
		break;
		case 3: System.out.println("Digite o valor que deseja transferir");
		int transferencia = numero.nextInt();
		if (saldo >= transferencia) {
		saldo -= transferencia;
		System.out.println("O seu saldo é: " + saldo);
		}
		else
		{System.out.println("Seu saldo não é suficiente");
		}
		break;
		case 4: 	System.out.println(menu);
		break;
		case 5: opcao = 4;	
			}			
		}
	}
}


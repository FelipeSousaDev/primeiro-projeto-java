package contaTerminal;
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá, qual é o seu nome?");
		
		String nome = sc.nextLine();
		
		System.out.println("Obrigado. Agora precisamos saber qual a sua Agência?");
		
		int agencia = sc.nextInt();
		
		System.out.println("Certo, e qual é o número da Conta?");
		
		int conta = sc.nextInt();
		
		System.out.println("Qual é o saldo que gostaria de sacar?");
		
		int saldo = sc.nextInt();
		
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d, e seu saldo de R$%d reais já está disponivel para saque", nome, agencia, conta, saldo);
	}

}

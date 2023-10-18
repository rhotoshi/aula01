package aula01;
import java.util.Scanner;

public class InserindoNome {

	public static void main(String[] args) {
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}

}

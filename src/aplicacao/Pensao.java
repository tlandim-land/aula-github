package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Quartos;

public class Pensao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Quartos quarto;
		
		// define a quantidade de estudantes
		System.out.print("digite a quantidade de estudantes: ");
		int n = sc.nextInt();

		// inicia o vetor baseado na classe Quartos - vetor tipo referencia
		Quartos[] vect = new Quartos[10];
			
		for(int i = 0; i < n; i ++) {
			System.out.print("nome aluno locatário: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("email aluno locatário: ");
			String email = sc.nextLine();

			System.out.print("qual quarto sera alugado: ");
			int nro = sc.nextInt();
			
			quarto = new Quartos(nome, email, nro);
			
			vect[nro] = new Quartos(nome, email, nro);
			
			System.out.println();
		}

		for(int i = 0; i < vect.length; i ++) {		
			if (i == 0) {
				System.out.println("RESUMO LOCAÇÃO QUARTOS");
			}

			if (vect[i] != null) {
				System.out.println("NOME LOCATARIO.: " + vect[i].getNome());
			    System.out.println("EMAIL LOCATARIO: " + vect[i].getEmail());
			    System.out.println("NUMEOR QUARTO..: " + vect[i].getQuarto());
			    System.out.println();
			}
		}
		
		sc.close();
	}

}

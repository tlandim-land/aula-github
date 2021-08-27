import java.util.Scanner;

public class Funcao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite 3 numeros" ); 
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a, b, c);
		
		mostraResultado(maior);
		
		
		sc.close();
	}
	
	// criacao da funcao para validar maior numero
	public static int max(int x, int y, int z) { 
		
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		
		return aux;
	}
	
	// criacao da funcao para imprimir resultado
	public static void mostraResultado(int valor) { 
		System.out.println("o maior numero digitado é : " + valor);
	}	
}

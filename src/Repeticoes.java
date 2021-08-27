import java.util.Locale;
import java.util.Scanner;

public class Repeticoes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/* while - quando se sabe o ponto de parada
		int numero;
		int soma = 0;
		
		numero = sc.nextInt();
		
		while (numero != 0) {
			soma += numero;
			
			System.out.println("digite um numero: "); numero = sc.nextInt();
		}
		*/
		
		/* for - contagem regressiva e progressiva
		int qtde;
		int numero = 0;
		int soma = 0;
		
		System.out.println("digite quantas repetições deseja: "); qtde = sc.nextInt();
		
		for (int i = 0; i < qtde; i ++) {
			System.out.println("digite um numero: "); numero = sc.nextInt();
			
			soma += numero;			
		}
				
		System.out.println("A soma dos valores digitados é : " + soma);
		*/
		
		/* do - while - executa o bloco de comandos pelo menos uma vez		
		double c = 0;
		double f = 0;
		char continua;
		
		do {
			System.out.print("Digite a temperatura em Celsius : "); c = sc.nextDouble();
		
			f = 9.0 * c / 5.0 + 32.0;
		
			System.out.println("A temperatura em fahrenheit é : " + f);
			
			System.out.print("Deseja continuar (s) ou (n) : "); continua = sc.next().charAt(0);
						
		} while(continua != 'n');
		*/
		
		//* for e for each
		
		String[] vect = new String[] {"THIAGO", "MARIA", "VICENTE", "RAYANA", "JOÃO"};
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("------------");

		for (String obj : vect) {
			System.out.println(obj);
		}
		
		sc.close();
	}

}

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* concatena��o e variaveis
		System.out.print("Ola mundo!");		
		System.out.println("Bom dia");
		
		int x = 32;
		System.out.println(x);
		
		double y = 20.5556;
		System.out.println(y);
		
		// printf > pega o padr�o de configura��o do computador
		// configura localiza��o do programa
		Locale.setDefault(Locale.US);
		
		System.out.printf("%.2f%n", y);
		
		// concatena��o 
		System.out.println("Resultado : " + y + " metros");

		System.out.printf("Resultado : %.2f metros %n", y);
		
		String nome = "Maria";
		int idade = 32;
		double renda = 5200.0;
					
						// %s = texto 
						// %d = inteiro 
						// %c = char
						// %f = ponto flutuante
						// %n = quebra de linha
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
		*/
		
		/* armazenamento de variaveis e casting
		int x, y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println();
		
		double b;
		int a;
		
		b = 5.0;
		
		// casting = convers�o explicita de tipos de dados
		a = (int) b;
		
		System.out.println(a);
		*/
		
		/* Scanner para recuperar digita��o individual 
		Scanner sc = new Scanner(System.in);
		
		// Scanner para recuperar String
		String x;
		x = sc.next();
		System.out.println("Voc� digitou : " + x);
		
		// Scanner para recuperar inteiros
		int y;
		y = sc.nextInt();		
		System.out.println("Voc� digitou : " + y);

		// Scanner para recuperar double
		double d;
		d = sc.nextDouble();		
		System.out.println("Voc� digitou : " + d);
		

		// Scanner para recuperar char
		char c;
		c = sc.next().charAt(0);		
		System.out.println("Voc� digitou : " + c);
		*/

		/* Scanner para recuperar digita��o varios  
		Scanner sc = new Scanner(System.in);
		
		String s;
		int i;
		double d;
		
		s = sc.next();
		i = sc.nextInt();
		d = sc.nextDouble();
		
		System.out.println("dados digitados: " + s + " " + i + " "+ d);
		
		sc.close();
		 */
		
		/* Scanner para recuperar digita��o ate quebra de linha   
		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		*/
		
		// fun��es matematicas
		// Math.sqrt = raiz quadrada
		// Math.pow = potencia 
		// Math.abs = valor absoluto - tira negativo caso exista
	}
}

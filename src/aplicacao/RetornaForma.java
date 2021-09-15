package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Circulo;
import entidade.Forma;
import entidade.Retangulo;
import entidade.enums.Cor;

public class RetornaForma {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Forma> list = new ArrayList<>();
		
		System.out.print("DIGITE A QUANTIDADE DE FORMAS: " );
		int qtd = sc.nextInt();
		
		for (int i = 1; i <= qtd; i++) {
			System.out.print("DIGITE QUAL A FORMA #" + i + " <R>etangulo OU <C>irculo: " );
			char forma = sc.next().charAt(0);

			System.out.print("DIGITE A COR <BLACK / BLUE / RED>: " );
			Cor cor = Cor.valueOf(sc.next());
			
			if (forma == 'R' || forma == 'r') {
				System.out.print("DIGITE A LARGURA DO RETANGULO: " );
				double largura = sc.nextDouble();
				
				System.out.print("DIGITE A ALTURA DO RETANGULO: " );
				double altura = sc.nextDouble();
				
				list.add(new Retangulo(cor, largura, altura));
				
			} else {
				if (forma == 'C' || forma == 'c') {
					System.out.print("DIGITE O RAIO DO CIRCULO: " );
					double raio = sc.nextDouble();
					
					list.add(new Circulo(cor, raio));
				} else {
					System.out.println("TIPO DE FORMA INCORRETA!" );
					i -= 1;
				}
			}
			
			System.out.println();
		}		
		
		System.out.println("AREA DAS FORMAS");
		
		for (Forma forma:list) {
			System.out.println("COR FORMA: " + forma.getCor() + " AREA: " + String.format("%.2f", forma.area()));
		}
		
		sc.close();	
	}

}


public class Diversos {

	public static void main(String[] args) {
		
		String original = "   abcde FGHIJ ABC abc DEFG   ";
		
		// transforma em minusculo
		String s01 = original.toLowerCase();

		// transforma em maiusculo
		String s02 = original.toUpperCase();

		// retira os espacos das extremidades
		String s03 = original.trim();

		// gera nova String a partir do argumento informado
		String s04 = original.substring(6);
		
		// gera nova String a partir dos argumentos informados
		String s05 = original.substring(6, 12);
		
		// gera nova String substituindo o argumento informado
		String s06 = original.replace('a', 'Y');

		// gera nova String substituindo os argumentos informados
		String s07 = original.replace("abc", "YYY");

		// obtem a posição do primeiro argumento informado
		int i = original.indexOf("abc");
		
		// obtem a posição do primeiro argumento informado		
		int j = original.lastIndexOf("abc");

		System.out.println("original : -" + original + "-");
		System.out.println("toLowerCase : -" + s01 + "-");
		System.out.println("toUpperCase : -" + s02 + "-");
		System.out.println("trim : -" + s03 + "-");
		System.out.println("substring (6) : -" + s04 + "-");
		System.out.println("substring (6, 12) : -" + s05 + "-");
		System.out.println("replace ('a', 'Y') : -" + s06 + "-");
		System.out.println("replace ('abc', 'YYY') : -" + s07 + "-");

		System.out.println("IndexOf ('abc') : " + i);
		System.out.println("lastIndexOf ('abc') : " + j);
		
		String s = "potato apple lemon";
		
		// split = recorta o string conforme separador solicitado
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println("word1 = " + word1);
		System.out.println("word2 = " + word2);
		System.out.println("word3 = " + word3);
	}

}

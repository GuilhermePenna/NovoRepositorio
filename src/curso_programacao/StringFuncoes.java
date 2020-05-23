package curso_programacao;

public class StringFuncoes {

	public static void main(String[] args) {
		String palavra = "abcde FGHI JKLMNab  ";
		String s01 = palavra.toLowerCase();
		String s02 = palavra.toUpperCase();
		String s03 = palavra.trim();
		String s04 = palavra.substring(2);
		String s05 = palavra.substring(2,9);
		String s06 = palavra.replace('a','z');
		String s07 = palavra.replace("ab","yz");
		int i = palavra.indexOf("ab");
		int j = palavra.lastIndexOf("ab");
		
		System.out.println("Original: -" + palavra + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'z'): -" + s06 + "-");
		System.out.println("replace('ab', 'yz'): -" + s07 + "-");
		System.out.println("Index of 'ab': " + i);
		System.out.println("Last index of 'ab': " + j);
		
	}

}

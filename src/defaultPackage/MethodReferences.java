package defaultPackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferences {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();

		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		// palavras.sort((Comparator.comparing(s-> s.length())));
		palavras.sort((Comparator.comparing(String::length)));

		Function<String, Integer> funcao = String::length;
		Function<String, Integer> funcao2 = s -> s.length();

		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		
		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);

		palavras.forEach(System.out::println);
	}
}

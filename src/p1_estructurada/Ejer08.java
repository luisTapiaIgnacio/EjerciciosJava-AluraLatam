package p1_estructurada;


import java.util.List;
import java.util.Arrays;

public class Ejer08 {
public static void main(String[] args) {
	List<Integer> numLista=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
	System.out.println("Numeros pares");
	numLista.stream()
	.filter(n-> n % 2 == 0)
	.forEach(n-> System.out.println(n)
	);
}
}

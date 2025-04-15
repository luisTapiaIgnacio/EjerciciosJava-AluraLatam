package p1_estructurada;

import java.util.Scanner;

//adivinar un numero random
public class Ejer06 {
public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);
	
	System.out.println("***ADIVINA EL NUMERO OCULTO entre 1-10****");
	int numAleatorio=(int)(Math.random()*10)+1;
	int numOportunidad=3;
	System.out.println("El numero aleatorio es: "+numAleatorio);
	int i=0;
	while(i< numOportunidad) {
		
		System.out.println("ADIVINA: Ingrese un numero: ");
		int num=entrada.nextInt();
		if(num==numAleatorio) {
			System.out.println("Felicidades...!ADIVINASTE");
			break;
		}
		i++;
			
	}
	
	System.out.println("N° de oportunidades finalizado...!");
	entrada.close();
}
}

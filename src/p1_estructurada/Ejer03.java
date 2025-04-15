package p1_estructurada;

import java.util.Scanner;

public class Ejer03 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 System.out.println("ELIGE UN PLAN: \n1) PLAN BASICO \n 2) PLAN PLATA \n3) PLAN PREMIUM");
	 int plan=sc.nextInt();
	 
	 switch (plan) {
	case 1: 
		System.out.println("Ud. eligio un plan basico");
		break;
	case 2:
		System.out.println("Ud. eligio un plan plata");
		break;
	case 3:
		System.out.println("Ud. eligio un plan premium...!");
		break;
	default:
		System.out.println("Valor fuera de rango...");
		break;
	}
}
}

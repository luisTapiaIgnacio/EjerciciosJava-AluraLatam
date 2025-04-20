package p1_estructurada;

import java.util.Scanner;

public class MiniProyecto01 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String nombre="Julian Mati", tipoCuenta="debito";
	double saldo=5500.20;
	String respuesta="";
	String menu="""
			1. Consultar saldo
			2. Retirar
			3. Depositar
			0. Salir
			""";
	
	boolean continuar= true;
	System.out.println("-------- TUS DATOS VISUALIZADOS AQUI ----------");
	System.out.println("- NOMBRE: "+nombre);
	System.out.println("- TIPO DE CUENTA: "+tipoCuenta);
	System.out.println("- SALDO: "+saldo);
	System.out.println("**********************************************");
	
	
	System.out.println(">>QUE OPERACION REALIZARÁ: ");
	while(continuar) {
		System.out.println(menu);
		System.out.print(">>Ingrese una opcion: ");
		int opcion=sc.nextInt();
		
		
		 switch (opcion) {
		case 0: 
			
			System.out.println( "Gracias por su operacion...! hasta pronto");
			continuar=false;
			break;
		case 1:
			System.out.println("SU SALDO ACTUAL ES: "+saldo);
			break;
		case 2: 
			System.out.println("Que monto desea retirar: ");
			int retiro=sc.nextInt();
			if(retiro>saldo) {
				System.out.println("Saldo insuficiente, solo puede retirar: "+saldo);
			}else {
				saldo = saldo-retiro;
				System.out.println("su saldo actual es: "+saldo);
			}
			
			break;
			
		case 3: 
			System.out.println("Cuanto desea depositar? ");
			int deposito = sc.nextInt();
			saldo = saldo + deposito;
			System.out.println("SU SLADO ACTUAL ES: "+saldo);
		
		default:
			System.out.println("Fuera de rango");
		
		 }
		 
		 System.out.println(respuesta);
		
	}
	
	
	 System.out.println("Saliendo de sistema....!");
	 
	 sc.close();
	
	
}
}

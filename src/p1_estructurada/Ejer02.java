package p1_estructurada;

public class Ejer02 {
public static void main(String[] args) {
	String namePeli = "Matrix: el regreso";
	int fechLanzamiento=1900;
	boolean planPremium=true;
	String planString ="plus";
	double calificacion=8.2;	
	if(planString.equals("plus")){
		System.out.println("Ud. puede gozar de todo el beneficio...!");
	}else {
		System.out.println("Suscribase a un plan");
	}
	
	if(fechLanzamiento<2000) {
		System.out.println("La pelicula es antiguaaaaa");
	}else {
		System.out.println("La pelicula es recienteee");
	}
			
	// operadores logicosssss
	
	if(planPremium && calificacion>7) {
		System.out.println("La peicula esta bien recomendada");
	} else {
		System.out.println("Tiene poca demanda");
	}
	
}}
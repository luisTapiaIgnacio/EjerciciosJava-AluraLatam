package p1_estructurada;

public class Ejer07 {
public static void main(String[] args) {
	double[] puntuaciones ={2, 5, 6.2, 8.5, 7.3};
	//si la media de puntuacion es +6
	int cant=puntuaciones.length;
	int i=0;
	double suma=0;
	while(i<cant){
		suma=suma+puntuaciones[i];		
		i++;
	}
	double total=suma/i;
	System.out.println("El total de puntaje es: "+ suma);
	System.out.println("la media es:" + total);	
}
}

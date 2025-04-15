package p1_estructurada;

public class Ejer05 {

	

	    public static void main(String[] args) {
	        // Imprimir "ZOE"
	        imprimirZ();
	        imprimirO();
	        imprimirE();
	    }

	    // Función para imprimir la letra Z (gruesa)
	    public static void imprimirZ() {
	        int tamaño = 9;
	        
	        for (int i = 0; i < tamaño; i++) {
	            for (int j = 0; j < tamaño; j++) {
	                if (i == 0 || i == tamaño - 1 || j == tamaño - i - 1) {
	                    System.out.print("**");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }

	    // Función para imprimir la letra O (gruesa)
	    public static void imprimirO() {
	        int tamaño = 9;
	        
	        for (int i = 0; i < tamaño; i++) {
	            for (int j = 0; j < tamaño; j++) {
	                if (j == 0 || j == tamaño - 1 || i == 0 || i == tamaño - 1) {
	                    System.out.print("**");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }

	    // Función para imprimir la letra E (gruesa)
	    public static void imprimirE() {
	        int tamaño = 9;
	        
	        for (int i = 0; i < tamaño; i++) {
	            for (int j = 0; j < tamaño; j++) {
	                if (j == 0 || i == 0 || i == tamaño - 1 || i == tamaño / 2) {
	                    System.out.print("**");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }
	

	
}

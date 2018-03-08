package base;

/**
 * 
 * @author Alejandro Bajo Perez
 * @author Joaquin Alonso Pesianez
 * @author Ismael Martin Ramirez
 * 
 *
 */
public class Main {


	/*
	 * Metodo para iniciar el programa.
	 */
	public static void main(String[] args) {
		gestionPrograma();

	}

	/*
	 * Metodo para gestionar el programa.
	 */
	public static void gestionPrograma() {

		ejecucion(3);

	}

	/**
	 * 
	 * Metodo que gestiona el algoritmo del programa.
	 * 
	 * @param entrada
	 * @return salida
	 */
	public static int ejecucion(int entrada) {

		int salida = 0;

		// Resuleve aqui el problema
		for (int i = 0; i < entrada; i++) {
			System.out.println("Hola mundo");
		}

		return salida;
	}
	
}

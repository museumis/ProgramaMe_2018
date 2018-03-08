package contextoporteclado;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Alejandro Bajo Perez
 * @author Joaquin Alonso Pesianez
 * @author Ismael Martin Ramirez
 * 
 *
 */
public class Main {

	// Variable utilizada para capturar el teclado.
	public static Scanner teclado;

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

		ejecucion(pedirEntero(" ¿Cuántos \" Hola Mundos \" deseas? "));

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
	
	
	/*
	 * METODOS UTILES DEL PROGRAMA 
	 */
	
	/**
	 * 
	 * Metodo para capturar String por teclado
	 *
	 * @param pregunta que se desea formular
	 * @return respuesta
	 */
	public static String pedirString(String pregunta) {
		teclado = new Scanner(System.in);
		System.out.print(pregunta);
		return teclado.nextLine();
	}

	/**
	 * 
	 * Metodo para capturar enteros por teclado
	 *
	 * @param pregunta que se desea formular
	 * @return respuesta dada
	 */
	public static int pedirEntero(String pregunta) {

		teclado = new Scanner(System.in);
		int respuesta = -1;

		System.out.print(pregunta);
		try {
			respuesta = teclado.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Debe ser un número.");
			pedirEntero(pregunta);
		}

		if (respuesta < 0) {
			System.out.println("El número debe ser mayor que 0.");
			pedirEntero(pregunta);
		}

		return respuesta;
	}
	
	/**
	 * 
	 * Metodo para capturar doubles por teclado
	 *
	 * @param pregunta que se desea formular
	 * @return respuesta dada
	 */
	public static double pedirDouble(String pregunta) {

		teclado = new Scanner(System.in);
		double respuesta = -1;

		System.out.print(pregunta);
		try {
			respuesta = teclado.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Debe ser un número.");
			pedirEntero(pregunta);
		}

		if (respuesta < 0) {
			System.out.println("El número debe ser mayor que 0.");
			pedirEntero(pregunta);
		}

		return respuesta;
	}

}

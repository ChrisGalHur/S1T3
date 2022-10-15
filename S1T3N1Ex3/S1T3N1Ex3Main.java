package S1T3N1Ex3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class S1T3N1Ex3Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*- Exercici 3
		- Donat el fitxer countrties.txt (revisa l'apartat recursos) que conté països i capitals.
		- El programa ha de llegir el fitxer i guardar les dades en un HashMap<String, String>.
		El programa demana el nom de l’usuari/ària, i després ha de mostrar un país de forma aleatòria, guardat en el HashMap.
		Es tracta de què l’usuari/ària ha d’escriure el nom de la capital del país en qüestió. Si l’encerta se li suma un punt.
		Aquesta acció es repeteix 10 vegades. Un cop demanades les capitals de 10 països de forma aleatòria,
		llavors s’ha de guardar en un fitxer anomenat classificacio.txt, el nom de l’usuari/ària i la seva puntuació.*/
		
		String nomUsu, paisAle;
		int puntuacionFinal = 0;
		
		//Leemos el archivo para obtener la informacion
		Archivo.leerArchivo();
		//Iniciamos el juego mientras recogemos datos
		nomUsu = obtencionNombre();
		puntuacionFinal = juego();
		Archivo.guardarRegistro(nomUsu, puntuacionFinal);
	}
	
	public static String obtencionNombre() {
		String nom;
		System.out.println("Dime tu nombre:");
		nom = scan.nextLine();
		System.out.println("Tienes diez intentos " + nom + ", a ver qué puntuación consigues.\n"
				+ "ADELANTE!!!\n");
		return nom;
	}
	
	public static Integer juego() {
		String capitalUsu, respuesta;
		int puntos = 0, rondas = 10;
		boolean acierto;
		
		for(int i = 0; i < rondas; i++) {	
			int rondaActual = i + 1;
			String paisAleMain = Archivo.paisAleatorio();
			System.out.println("Cuál es la capital de " + paisAleMain + "?");
			capitalUsu = scan.nextLine();
			acierto = Archivo.comprobarCapital(capitalUsu,paisAleMain);
				if(acierto == true) {
					System.out.println("Correcto!! Has ganado un punto!!\n");
					puntos++;
					System.out.println("Tu puntuación es: " + puntos + "\n"
										+ "Esta era la ronda: " + rondaActual + "/10\n");
				}else{
					System.out.println("No es correcta!!\n");
					System.out.println("Tu puntuación es: " + puntos + "\n"
										+ "Esta era la ronda: " + rondaActual + "/10\n");
				}
		}
		System.out.println("¡¡¡HEMOS ACABADO!!!\n"
				+ "HAS CONSEGUIDO: " + puntos +  " puntos.");		
		return puntos;
	}
}

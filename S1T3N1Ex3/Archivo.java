package S1T3N1Ex3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Archivo {
	
	static FileReader fr = null;
	static BufferedReader br = null;
	static Map<String, String> countries = new HashMap<>();
	static Object[] countriesArr = countries.values().toArray();
	static int ronda = 1;
	
	public static void leerArchivo() {
		try {
			fr = new FileReader ("D:\\Java\\eclipse-workspace\\S1T3\\src\\S1T3N1Ex3\\countries.txt");
			br = new BufferedReader(fr);
			String paisLimpio, paisArchivo, capitalLimpia, capitalArchivo;

			String linea;
			while((linea = br.readLine()) != null) {
				 String[] separador = linea.split(" ");
		            if (separador.length > 1) {
		            	paisArchivo = (separador[0]);
		                paisLimpio = eliminarBarraBaja(paisArchivo);
		                capitalArchivo = (separador[1]);
		                capitalLimpia = eliminarBarraBaja(capitalArchivo);
				countries.put(capitalLimpia, paisLimpio);
		            }
			}
		fr.close();
		}catch(IOException e){
			System.out.println("No puedo leer el archivo");
		}	
	}
	
	public static String paisAleatorio() {
		Object[] countriesArr = countries.values().toArray();
		String paisAle = ((String) countriesArr[new Random().nextInt(countriesArr.length - 1)]);
		return paisAle;
	}
	
	public static boolean comprobarCapital(String capitalComprobar, String paisComprobar) {
		boolean comprobacion = false;
		String paisBuscando = "";
		
		for(String capitales : countries.keySet()) {
			if (paisComprobar.equalsIgnoreCase(paisBuscando = countries.get(capitales))) {
				if(capitalComprobar.equals(capitales)){
					comprobacion = true;
				}
			}
		}
		return comprobacion;
	}
	
	public static void guardarRegistro(String nomGuardar, int puntuacioGuardar){
		try{
            FileWriter fichero = new FileWriter("D:\\Java\\eclipse-workspace\\S1T3\\src\\S1T3N1Ex3\\classificacio.txt", true);
            PrintWriter pw = new PrintWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fichero);
            
           	pw.println(nomGuardar + ": " + puntuacioGuardar);
           	
           	fichero.close();
        }catch(Exception e) {
        	System.out.println("(No se ha podido guardar el registro.)");;
        }
		System.out.println("\n(Se ha guardado registro.)");
	}
		
	public static String eliminarBarraBaja(String palabraSucia) {
		String palabraLimpia = "";
		
		for (int i = 0; i < palabraSucia.length(); ++i) {
			if (palabraSucia.charAt(i) == '_') {
				palabraLimpia += " ";
			}else {
				palabraLimpia += palabraSucia.charAt(i);
			}
		}
		
	return palabraLimpia;
	}
}

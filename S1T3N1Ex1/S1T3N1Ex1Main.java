package S1T3N1Ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class S1T3N1Ex1Main {

	public static void main(String[] args) {
		
		/*Nivel 1
		- Ejercicio 1
		-Crea una clase llamada Month con un atributo "name" (que almacenará el nombre del mes del año).
		-Añade 11 objetos Month (cada uno con su atributo diferente) en un ArrayList, a excepción del objeto con atributo "Agost". 
		-Después, efectúa la inserción en el lugar que corresponde a este mes y demuestra que lo ArrayList mantiene el orden correcto.
		-Convierte lo ArrayList del ejercicio anterior en un HashSet y asegúrate que no permite duplicados.
		Recorre la lista con un for y con un iterador.*/
		
		ArrayList <Month> meses = new ArrayList<Month>();	
		
		//Creamos los 12 Objetos Month
		Month enero = new Month("Enero");
		Month febrero = new Month("Febrero");
		Month marzo = new Month("Marzo");
		Month abril = new Month("Abril");
		Month mayo = new Month("Mayo");
		Month junio = new Month("Junio");
		Month julio = new Month("Julio");
		Month agosto = new Month("Agosto");
		Month septiembre = new Month("Septiembre");
		Month octubre = new Month("Octubre");
		Month noviembre = new Month("Noviembre");
		Month diciembre = new Month("Diciembre");
		
		//Añadimos los objetos Month al ArrayList
		meses.add(enero);
		meses.add(febrero);
		meses.add(marzo);
		meses.add(abril);
		meses.add(mayo);
		meses.add(junio);
		meses.add(julio);
		//Agosto no lo incluyo en el ArrayList
		meses.add(septiembre);
		meses.add(octubre);
		meses.add(noviembre);
		meses.add(diciembre);
		
		//Comprobamos la lista SIN Agosto
		System.out.println("Sin Agosto:\n"
				+ "");
		for(int i = 0; i< meses.size(); i++) {
			System.out.println(meses.get(i));
		}
		System.out.println("________________");
		
		//Introducimos Agosto en el Array
		meses.add(7, agosto);
		
		//Comprobamos la lista CON Agosto
		System.out.println("\n"
				+ "Con Agosto:\n"
				+ "");
		for(int i = 0; i< meses.size(); i++) {
			System.out.println(meses.get(i));		
			}
		System.out.println("________________");
		
		//--------- HASHSET ---------
		//Creamos un iterador
		Iterator<Month> iterador = meses.iterator();
		
//		//Convertimos ArrayList en un HashSet
		HashSet<Object> hashSet = new HashSet<>(meses);
		
		//Añadimos otro objeto con nombre Agosto a ver si admite duplicados
		Month agosto2 = new Month("Agosto");
		hashSet.add(agosto2);
		
		//Recorrer la lista con for
		System.out.println("\n"
				+ "For:\n"
				+ "");
		for(Object mes : hashSet) {
			System.out.println(mes.toString());
		}
		System.out.println("________________");
		
		//Recorrer la lista con el Iterator
		System.out.println("\n"
				+ "Iterator:\n"
				+ "");
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}

	}

}

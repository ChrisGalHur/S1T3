package S1T3N2Ex1Ex2;

import java.util.Objects;

public class Restaurant{

	//Atributos
	private String nom;
	private int puntuacio;
	
	//Constructores
	public Restaurant(String nom, int puntiacio) {
		this.nom = nom;
		this.puntuacio = puntiacio;
	}

	//Getters
	public String getNom() {
		return nom;
	}

	public int getPuntiacio() {
		return puntuacio;
	}

	//Setters
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPuntiacio(int puntiacio) {
		this.puntuacio = puntiacio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nom, puntuacio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(nom, other.nom) && puntuacio == other.puntuacio;
	}
	
	public int compare(Object obj1, Object obj2) {
		Restaurant res1 = (Restaurant)obj1;
		Restaurant res2 = (Restaurant)obj2;
		
		return puntuacio;
		
	}

}

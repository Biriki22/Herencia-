package clases;

import java.util.Objects;

public class Animal {
	private static int ContAnimal;
	private int idAnimal;
	private String NombreAnimal;
	private boolean chip; //Indica si tiene o no chip

	
	/////////CONSTRUCTORES//////////////////
	public Animal(int idAnimal,String NombreAnimal,boolean chip) {
		super();
		ContAnimal++;
		this.idAnimal = idAnimal;
		NombreAnimal = NombreAnimal;
		this.chip = chip;
	}
	public Animal(int idAnimal) {
		super();
		this.idAnimal = idAnimal;
		NombreAnimal = "********+";
		this.chip = false;
	}
	
	
	/////////GETTER Y SETTERS//////////////////


	public static int getContAnimal() {
		return ContAnimal;
	}
	public static void setContAnimal(int contAnimal) {
		ContAnimal = contAnimal;
	}
	public int getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}
	public String getNombreAnimal() {
		return NombreAnimal;
	}
	public void setNombreAnimal(String nombreAnimal) {
		NombreAnimal = nombreAnimal;
	}
	public boolean isChip() {
		return chip;
	}
	public void setChip(boolean chip) {
		this.chip = chip;
	}
	/////////TO STRING//////////////////
	@Override
	public String toString() {
		return "Animal [idAnimal=" + idAnimal + ", NombreAnimal=" + NombreAnimal + ", chip=" + chip + "]";
	}


/////////HASH CODE Y EQUALS//////////////////

	@Override
	public int hashCode() {
		return Objects.hash(NombreAnimal, chip, idAnimal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(NombreAnimal, other.NombreAnimal) && chip == other.chip && idAnimal == other.idAnimal;
	}
	
	
}

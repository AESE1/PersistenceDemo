package com.natwest.persistencedemo.persistence.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true, nullable = false)
	private String species;
	
	@Override
	public int hashCode() {
		return Objects.hash(domesticated, habitat, id, noOfLegs, species);
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
		return Objects.equals(domesticated, other.domesticated) && Objects.equals(habitat, other.habitat)
				&& Objects.equals(id, other.id) && noOfLegs == other.noOfLegs && Objects.equals(species, other.species);
	}

	@Column
	private int noOfLegs;
	
	@Column
	private Boolean domesticated;
	
	@Column
	private String habitat;

	@Override
	public String toString() {
		return "Animal [id=" + id + ", species=" + species + ", noOfLegs=" + noOfLegs + ", domesticated=" + domesticated
				+ ", habitat=" + habitat + "]";
	}

	public Animal() {
		super();
	}

	public Animal(String species, int noOfLegs, Boolean domesticated, String habitat) {
		super();
		this.species = species;
		this.noOfLegs = noOfLegs;
		this.domesticated = domesticated;
		this.habitat = habitat;
	}

	public Long getId() {
		return id;
	}


	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

	public Boolean getDomesticated() {
		return domesticated;
	}

	public void setDomesticated(Boolean domesticated) {
		this.domesticated = domesticated;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	
	
	
	
	
	
	
	
	

}

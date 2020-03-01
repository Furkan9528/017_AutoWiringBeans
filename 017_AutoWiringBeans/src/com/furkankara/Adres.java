package com.furkankara;

public class Adres {
	
	private String tamAdres;

	public String getTamAdres() {
		return tamAdres;
	}

	public void setTamAdres(String tamAdres) {
		this.tamAdres = tamAdres;
	}

	@Override
	public String toString() {
		return "Tam Adres :" +getTamAdres().toUpperCase().toString();
	}
	
	
	
}

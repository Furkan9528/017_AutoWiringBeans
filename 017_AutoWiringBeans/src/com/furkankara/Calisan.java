package com.furkankara;

public class Calisan {

	private String adi,soyadi;
	private Adres adres;


	public Calisan(Adres adres) {
		this.adres = adres;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public Adres getAdres() {
		return adres;
	}
	public void setAdres(Adres adres) {
		this.adres = adres;
	}


	@Override
	public String toString() {
		return "Calisan [adi=" + adi + ", soyadi=" + soyadi + ", adres=" + adres + "]";
	}
	
	
	

}

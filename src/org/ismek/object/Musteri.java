package org.ismek.object;

public class Musteri {

	private int id;
	private String isim;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String adi) {
		this.isim = adi;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " - " + isim;
	}
}
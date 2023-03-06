package app;

public class Player {
	private int loydetytParit;
	private String nimi;
	
	public Player(String nimi) {
		this.nimi = nimi;
		loydetytParit = 0;
	}
	
	public String getNimi() {
		return nimi;
	}
	public int getLoydetytParit() {
		return loydetytParit;
	}
	public void loysiParin() {
		loydetytParit++;
	}
}

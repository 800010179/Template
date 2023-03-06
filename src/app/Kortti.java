package app;

public class Kortti {
	private String nimi;
	private boolean onLoydetty;
	
	public Kortti(String nimi) {
		this.nimi = nimi;
		onLoydetty = false;
	}
	
	public void loyda() {
		onLoydetty = true;
	}
	
	public boolean onkoLoydetty() {
		return onLoydetty;
	}
	
	public String getNimi() {
		return nimi;
	}
}

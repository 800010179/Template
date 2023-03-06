package app;

import java.util.ArrayList;

public class Kortit {
	private int loydetytParit;
	private int maara;
	private Kortti[] kortit;
	private ArrayList<Kortti> korttilista;
	private boolean paritLoydetty;
	public Kortit() {
		loydetytParit = 0;
		korttilista = new ArrayList<>();
		paritLoydetty = false;
		maara = 12;
		kortit = new Kortti[maara];
		boolean lisatty;
		int randomInt;
		korttilista.add(new Kortti("kissa"));
		korttilista.add(new Kortti("kissa"));
		korttilista.add(new Kortti("koira"));
		korttilista.add(new Kortti("koira"));
		korttilista.add(new Kortti("lehmä"));
		korttilista.add(new Kortti("lehmä"));
		korttilista.add(new Kortti("sika"));
		korttilista.add(new Kortti("sika"));
		korttilista.add(new Kortti("kala"));
		korttilista.add(new Kortti("kala"));
		korttilista.add(new Kortti("lammas"));
		korttilista.add(new Kortti("lammas"));
		
		for(int i = 0; i < maara-1; i++) {
			lisatty = false;
			while(!lisatty) {
				randomInt = (int)(11 * Math.random());
				while(kortit[randomInt] != null) {
					randomInt = (int)(11 * Math.random());
				}
				if(kortit[randomInt] == null) {
					kortit[randomInt] = korttilista.get(i);
					lisatty = true;
				}
				
			}
		}
		
	}
	
	public boolean getParitLoydetty() {
		return paritLoydetty;
	}
	
	public boolean nostaPari() {
		int randomInt1 = (int)(11 * Math.random());
		while(kortit[randomInt1].onkoLoydetty()) {
			randomInt1 = (int)(11 * Math.random());
		}
		
		int randomInt2 = (int)(11 * Math.random());
		while(randomInt1 == randomInt2 && kortit[randomInt2].onkoLoydetty()) {
			randomInt2 = (int)(11 * Math.random());
		}
		
		String kortti1 = kortit[randomInt1].getNimi();
		System.out.println("Ensimmäinen nostettu kortti: " + kortti1);
		String kortti2 = kortit[randomInt2].getNimi();
		System.out.println("Toinen nostettu kortti: " + kortti2);
		if(kortti1.equals(kortti2)) {
			kortit[randomInt1].loyda();
			kortit[randomInt2].loyda();
			System.out.println("Pari löytyi");
			
			loydetytParit += 2;
			if(loydetytParit == 12) {
				paritLoydetty = true;
			}
			
			return true;
		}
		else {
			System.out.println("Ei paria");
			return false;
		}
	}
}

package app;

public class Muistipeli extends Game{
	Kortit kortit;
	Player[] pelaajat;
	boolean peliLoppunut;
	@Override
	void initializeGame() {
		System.out.println("Peli alkaa, pelaajia on " + super.playersCount);
		peliLoppunut = false;
		kortit = new Kortit();
		pelaajat = new Player[super.playersCount];
		for(int i = 0; i < super.playersCount; i++) {
			pelaajat[i] = new Player("Pelaaja " + (i+1));
		}
	}

	@Override
	void makePlay(int player) {
		
		System.out.println("Pelaaja " + pelaajat[player].getNimi() + " koittaa löytää parin");
		boolean loysikoParin = kortit.nostaPari();
		if(loysikoParin) {
			pelaajat[player].loysiParin();
		}
		if(kortit.getParitLoydetty()) {
			peliLoppunut = true;
			
		}
		
	}

	@Override
	boolean endOfGame() {
		if(peliLoppunut) {
			return true;
		}
		return false;
	}

	@Override
	void printWinner() {
		System.out.println("Peli päättyi pelaajien saamat parit:");
		for(Player player : pelaajat) {
			System.out.println("Pelaajan " + player.getNimi() + " saamat parit " + player.getLoydetytParit());
		}
		
	}

}

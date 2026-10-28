package fussballklub.trinerteam;

import java.util.ArrayList;

public class Spielgruppe {

	private ArrayList<Mannschaft> spieler;
	private Kapitän kapitän;
	private String trainerTeamName;

	public Spielgruppe(ArrayList<Mannschaft> spieler) {
		super();
		this.spieler = spieler;
	}

	public void addSpieler(Mannschaft neueSpieler) {

		this.spieler.add(neueSpieler);

	}

	public void setKapitän(Kapitän gruppenKapitän) {
		this.kapitän = gruppenKapitän;
	}
	
	

	public void setTrainerTeamName(String trainerTeamName) {
		this.trainerTeamName = trainerTeamName;
	}

	public Spielgruppe(String trainerTeamName) {
		super();
		this.trainerTeamName = trainerTeamName;
	}

	public ArrayList<Mannschaft> getSpieler() {
		return spieler;
	}

	public Kapitän getKapitän() {
		return kapitän;
	}
	
	public Spielgruppe() {
		this.spieler = new ArrayList<Mannschaft>();
	}
}

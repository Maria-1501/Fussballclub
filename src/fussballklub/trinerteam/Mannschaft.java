package fussballklub.trinerteam;

public class Mannschaft {
	private String vorname;
	private String name;
	private String geburtsdatum;
	private String rolle;
	private int nummerSpieler;
	
	public Mannschaft(String vorname, String name, String geburtsdatum, String rolle, int nummerSpieler) {
		super();
		this.vorname = vorname;
		this.name = name;
		this.geburtsdatum = geburtsdatum;
		this.rolle = rolle;
		this.nummerSpieler = nummerSpieler;
	}

	public String getVorname() {
		return vorname;
	}

	public String getName() {
		return name;
	}

	public String getGeburtsdatum() {
		return geburtsdatum;
	}

	public String getRolle() {
		return rolle;
	}

	public int getNummerSpieler() {
		return nummerSpieler;
	}

	@Override
	public String toString() {
		return "Mannschaft vorname = " + vorname + ", name = " + name + ", geburtsdatum = " + geburtsdatum + ", rolle = "
				+ rolle + ", nummerSpieler = " + nummerSpieler;
	}


}

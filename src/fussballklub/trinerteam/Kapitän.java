package fussballklub.trinerteam;

public class Kapitän extends Mannschaft {

	public Kapitän(String vorname, String name, String geburtsdatum, String rolle, int nummerSpieler) {
		super(vorname, name, geburtsdatum, rolle, nummerSpieler);
	}

	@Override
	public String toString() {
		return "Kapitän; " + super.toString();
	}
	

}

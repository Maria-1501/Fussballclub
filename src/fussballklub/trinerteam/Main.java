package fussballklub.trinerteam;

public class Main {
	public static void main(String[] args) {

		Mannschaft spieler1 = new Mannschaft("Ivan", "Ivanov", "01.01.2000", "Verteidiger", 4);
		Mannschaft spieler2 = new Mannschaft("Petr", "Petrov", "05.05.1999", "Verteidiger", 2);
		Kapitän kapitaen = new Kapitän("Sidr", "Sidorov", "10.10.1998", "Abwehrkapitän", 5);

		Defensive defGruppe = new Defensive();
		defGruppe.setTrainerTeamName("Alex Ivanov");
		defGruppe.setKapitän(kapitaen);
		defGruppe.addSpieler(spieler1);
		defGruppe.addSpieler(spieler2);

		System.out.println("=== INFO ===");
		System.out.println("GruppenName: " + defGruppe.getClass().getSimpleName());
		System.out.println("=== Trainer ===");
		System.out.println("Trainername: " + defGruppe.getTrainerTeamName());
		System.out.println("=== Kapitän ===");
        System.out.println("Kapitän: " + defGruppe.getKapitän());
		System.out.println("=== Spieler ===");
		System.out.println("Spieler:");

		for (Mannschaft spieler : defGruppe.getSpieler()) {
			System.out.println(" " + spieler);
		}
	}

}


public class Kunde extends Person {

	private int kundennummer;

	/**
	 * Parameterloser Konstruktor.
	 */
	public Kunde() {
		super(); // Konstruktor der Oberklasse wird aufgerufen
	}

	/**
	 * Mit diesem Konstruktor erfolgt die Initialisierung der Attribute durch die
	 * uebergebenen Parameter.
	 * 
	 * @param nachname   Nachname des Kunden
	 * @param vorname    Vorname des Kunden
	 * @param strasse    Strasse zur Adresse des Kunden
	 * @param hausnummer Hausnummer zur Adresse des Kunden
	 * @param ort        Ort zur Adresse des Kunden
	 * @param plz        PLZ zur Adresse des Kunden
	 * @param weiblich   Flag ob Kunde weiblich ist
	 */
	public Kunde(String nachname, String vorname, String strasse, String hausnummer, String ort, String plz,
			boolean weiblich) {
		// Konstruktor der Oberklasse wird aufgerufen
		super(nachname, vorname, strasse, hausnummer, ort, plz, weiblich);
		this.kundennummer = 0;
	}

	/**
	 * Mit diesem Konstruktor erfolgt die Initialisierung der Attribute durch die
	 * uebergebenen Parameter inkl. setzen der Kundennummer.
	 * 
	 * @param nachname     Nachname des Kunden
	 * @param vorname      Vorname des Kunden
	 * @param strasse      Strasse zur Adresse des Kunden
	 * @param hausnummer   Hausnummer zur Adresse des Kunden
	 * @param ort          Ort zur Adresse des Kunden
	 * @param plz          PLZ zur Adresse des Kunden
	 * @param weiblich     Flag ob Kunde weiblich ist
	 * @param kundennummer Kundennummer fuer den Kunden
	 */
	public Kunde(String nachname, String vorname, String strasse, String hausnummer, String ort, String plz,
			boolean weiblich, int kundennummer) {
		// Konstruktor der Oberklasse wird aufgerufen
		super(nachname, vorname, strasse, hausnummer, ort, plz, weiblich);
		// Kundennummer setzen
		this.kundennummer = kundennummer;
	}

	/**
	 * Die Methode setKundenNr setzt die Kundennummer.
	 * 
	 * @param kundennummer Kunennummer der Kunden
	 */
	public void setKundenNr(int kundennummer) {
		this.kundennummer = kundennummer;
	}

	/**
	 * Die Methode getKundenNr gibt die Kundennummer aus.
	 * 
	 * @return int Kundennummer
	 */
	public int getKundenNr() {
		return kundennummer;
	}

	/**
	 * Gibt die richtige Anrede zurueck.
	 * 
	 * @return die Anrede
	 */

	@Override
	protected String getAnrede() {
		// Adressarray erzeugen
		String anrede;
		// Anrede nach Geschlecht festlegen
		if (isWeiblich()) {
			anrede = " Frau Kundin";
		} else {
			anrede = " Herrn Kunde";
		}
		return anrede;
	}
	
	/**Methode zur Repräsentation eines Kunde Objektes als String.
     * @return das Kudne Objekt als String
	 */
	@Override
	public String toString() {
		StringBuilder returnString = new StringBuilder();

		returnString.append("Vorname: " + this.vorname + System.lineSeparator());
		returnString.append("Nachname: " + this.nachname + System.lineSeparator());
		returnString.append("Straße, Hausnummer: " + this.strasse + " " + this.hausnummer + System.lineSeparator());
		returnString.append("PLZ Ort: " + this.plz + " " + this.ort);
		if (isWeiblich()) {
			returnString.append("Geschlecht: " + "weiblich" + System.lineSeparator());
		}
		returnString.append("Geschlecht: " + "männlich" + System.lineSeparator());
		if (getKundennummer())){
			returnString.append("Kundennummer: " + "kundennummer" + System.lineSeparator());
		}
		return returnString.toString();
	}
}

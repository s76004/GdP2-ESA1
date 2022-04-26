
public class Angestellte extends Person {

	// Instanzvariable gehalt
	private float gehalt;

	/**
	 * Parameterloser Konstruktor.
	 */
	public Angestellte() {
		super(); // macht deutlich, dass der Konstruktor der Oberklasse
		// aufgerufen wird
	}

	/**
	 * Mit diesem Konstruktor erfolgt die Initialisierung der Attribute durch die
	 * uebergebenen Parameter.
	 * 
	 * @param nachname   Nachname des Angestellten
	 * @param vorname    Vorname des Angestellten
	 * @param strasse    Strasse zur Adresse des Angestellten
	 * @param hausnummer Hausnummer zur Adresse des Angestellten
	 * @param ort        Ort zur Adresse des Angestellten
	 * @param plz        PLZ zur Adresse des Angestellten
	 * @param weiblich   Flag ob Angestellter weiblich ist
	 * @param gehalt     Gehalt des Angestellten
	 */
	public Angestellte(String nachname, String vorname, String strasse, String hausnummer, String ort, String plz,
			boolean weiblich, float gehalt) {
		// Aufruf des Konstruktors der Oberklasse
		super(nachname, vorname, strasse, hausnummer, ort, plz, weiblich);
		// Gehalt initialisieren
		this.gehalt = gehalt;
	}

	/**
	 * Die Methode getGehalt() dient zur Ausgabe der Gehaltskosten. Sie wird von der
	 * Klasse Firma aufgerufen.
	 * 
	 * @param keine
	 * @return float Gehalt des Angestellten
	 */
	public float getGehalt() {
		return gehalt;
	}

	/**
	 * Gibt die richtige Anrede zurueck.
	 * 
	 * @return die Anrede
	 */
	@Override
	protected String getAnrede() {
		String anrede;
		if (isWeiblich()) {
			anrede = " Frau Angestellte";
		} else {
			anrede = " Herrn Angestellte";
		}
		return anrede;
	}
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
		if (getGehalt == false )(){
			returnString.append("Gehalt: " + "gehalt" + System.lineSeparator());
		}
		return returnString.toString();
	}
}

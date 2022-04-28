
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FirmaTester {

	/**
	 * Main-Methode.
	 *
	 * @param args Uebergabeparameter
	 */
	public static void main(String[] args) {
		Firma kmu = new Firma(4, "Java4You");
		Angestellte ang1 = new Angestellte("Taylor", "Elisabeth", "Amrummer Strasse", "10", "Hamburg", "13353", true,
				410000f);
		kmu.addAngestellte(ang1);
		// result should be 410000
		System.out.println(kmu.alleGehaelter());
		Angestellte ang2 = new Angestellte("Mueller", "Mark", "Amrummer Strasse", "11", "Berlin", "13353", false,
				10000f);
		kmu.addAngestellte(ang2);
		// result should be 420000
		System.out.println(kmu.alleGehaelter());
		Kunde k1 = new Kunde("Cruise", "Tom", "Amrummer Strasse", "12", "Frankfurt", "13353", false);
		kmu.addKunde(k1);
		// result should be 0
		System.out.println(k1.getKundenNr());
		Kunde k2 = new Kunde("Jolie", "Angelina", "Amrummer Strasse", "13", "Nizza", "13354", true);
		kmu.addKunde(k2);
		// result should be 1
		System.out.println(k2.getKundenNr());
		// check we have the right people
		kmu.alleAdressenAusgeben();
		Kunde k3 = new Kunde("Deneuve", "Catherine", "Amrummer Strasse", "14", "Paris", "13353", true);
		// should not be possible
		kmu.addKunde(k3);
		// should be true
		System.out.println(kmu.istVoll());

		List<Person> persons = new ArrayList<>();
		persons.add(k2);
		persons.add(k1);
		persons.forEach(System.out::println);
		persons = sort(persons);
		persons.forEach(System.out::println);
	}

	/**
	 * Methode um mit Hilfe von Lambda eine Liste von Person-Objekten zu sortieren.
	 * @param p die zu sortierende Liste
	 * @return die sortierte Liste
	 */
	public static List<Person> sort(List<Person> p) {
		p.stream().sorted(Comparator.comparing(Person::getPlz)).toList();
		p.forEach(System.out::println);
		//zweites ausgeben

		p.stream().sorted(Comparator.comparing(Person::getOrt)).toList();
		p.forEach(System.out::println);
		return p;
	}
}

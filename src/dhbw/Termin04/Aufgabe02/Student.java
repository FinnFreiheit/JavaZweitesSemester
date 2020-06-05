package dhbw.Termin04.Aufgabe02;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Studenten sind eindeutig durch eine 9-stellige Matrikelnummer identifizierbar. 
 * Sie haben ferner einen Vornamen, einen Nachname, eine Anschrift bestehend aus einer Straße, einer Postleitzahl und einem Ort. 
 */
public class Student implements Comparable<Student>
{

	private String nachname;
	private String vorname;
	private String matrikelNummer;
	private String ort;
	private String plz;
	private Date immatrikulationsDatum;
	private Date exmatrikulationsDatum;
	
	//wird für die Darstellung von Datum verwendet
	//für unterstützte Formate nach Javadoc von SimpleDateFormat goggeln.
	private SimpleDateFormat datumsFormatter = new SimpleDateFormat("dd.MMM yyyy");
	
	/**
	 * Konstruktor für Studenten.
	 * Ein Student existiert erst mit der Immatrikulation, vorher macht es keinen Sinn!
	 * Die Matrikelnummer wird durch das System vergeben und kommt von aussen.
	 * Diese identifiziert einen Studenten eindeutig.
	 * Eine Änderung der Daten ist nur durch spezielle Methoden vorgesehen.
	 * Diese gibt es aktuell noch nicht. 
	 * @inv Immatrikulationsdatum liegt in der Vergangenheit
	 * @inv Exmatrikulationsdatum ist optional, wenn es vorliegt, liegt es nach der Immatrikulation
	 * 
	 * @param nachname der Nachname des Studenten (Pflichtfeld)
	 * @param vorname der Vorname des Studenten (Pflichtfeld)
	 * @param matrikelNummer die identifizierende 9-stellige Matrikelnummer (Pflichtfeld)
	 * @param ort der Wohnort (Pflichtfeld)
	 * @param plz die Postleitzahl des Wohnorts (Pflichtfeld)
	 */
	public Student(String nachname, String vorname, String matrikelNummer, String ort, String plz) {
		super();
		this.nachname = nachname;
		this.vorname = vorname;
		//Es wird hier nicht explizit geprüft, ob die Matrikelnummer eine valide neunstellige Id ist.
		this.matrikelNummer = matrikelNummer;
		this.ort = ort;
		//Es wird hier nicht explizit geprüft, ob die PLZ eine valide 5 stellige ID ist.
		this.plz = plz;
		//Setze das Immatrikulationsdatum durch das akutelle Datum
		this.immatrikulationsDatum = new Date();
	}


	/**
	 * Student wird exmatrikuliert.
	 * @pre Student muss immatrikuliert sein (Datum muss vor heutigem Datum liegen und er darf noch nicht exmatrikuliert sein)
	 * @post Student ist exmatrikuliert (Datum liegt vor und liegt nach dem Immatrikulationsdatum)
	 * 
	 */
	public void exmatrikulieren() {
		//Student muss immatrikuliert sein!
		if (immatrikulationsDatum == null) {
			System.out.println("Der Student ist noch nicht immatrikuliert");
			return;
		}
		//Student muss noch immatrikuliert sein
		if (exmatrikulationsDatum != null) {
			System.out.println("Der Student ist bereits exmatrikuliert.");
		}
		//Immatrikulationsdatum muss vor dem Exmatrikulationsdatum liegen
		Date now = new Date();
		if (now.before(immatrikulationsDatum)) {
			System.out.println("Der Student ist noch nicht immatrikuliert und kann daher nicht exmatrikuliert werden.");
			return;
		} 
		exmatrikulationsDatum = now;
	}


	/**
	 * @return the nachname
	 */
	public String getNachname() {
		return nachname;
	}


	/**
	 * @return the vorname
	 */
	public String getVorname() {
		return vorname;
	}


	/**
	 * @return the matrikelNummer
	 */
	public String getMatrikelNummer() {
		return matrikelNummer;
	}


	/**
	 * @return the ort
	 */
	public String getOrt() {
		return ort;
	}


	/**
	 * @return the plz
	 */
	public String getPlz() {
		return plz;
	}


	/**
	 * @return the immatrikulationsDatum
	 */
	public Date getImmatrikulationsDatum() {
		return immatrikulationsDatum;
	}


	/**
	 * @return the exmatrikulationsDatum
	 */
	public Date getExmatrikulationsDatum() {
		return exmatrikulationsDatum;
	}
	

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "Student [nachname=" + nachname + ", vorname=" + vorname + ", matrikelNummer=" + matrikelNummer
				+ ", ort=" + ort + ", plz=" + plz + ", immatrikulationsDatum=" + formatDate(immatrikulationsDatum)
				+ ", exmatrikulationsDatum=" + formatDate(exmatrikulationsDatum) + "]";
	}

	private String formatDate(Date date) {
		if (date == null) {
			return "";
		}
		return datumsFormatter.format(date);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Studenten sind eindeutig durch ihre Matrikelnummer identifiziert.
	 * Hinweis: equals und hashcode müssen immer synchron implementiert sein!
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		//repräsentiert diesselbe Instanz
		if (this == obj) {
			return true;
		}
		//sichere ab, das beide Klassen identisch sind
		//verschiedene Subklassen sollen nicht gleiche Objekte repräsentieren.
		if (obj.getClass() == getClass()) {
			Student student = (Student) obj;
			return getMatrikelNummer().equals(student.getMatrikelNummer()); 
		}
		return false;
	}


	/**
	 * {@inheritDoc}
	 * Hinweis: equals und hashcode müssen immer synchron implementiert sein!
	 */
	@Override
	public int hashCode() {
		//Hashcode des identifizierenden Merkmals
		return matrikelNummer.hashCode();
	}

	/**
	 * Compares this object with the specified object for order.  Returns a
	 * negative integer, zero, or a positive integer as this object is less
	 * than, equal to, or greater than the specified object.
	 *
	 * <p>The implementor must ensure
	 * {@code sgn(x.compareTo(y)) == -sgn(y.compareTo(x))}
	 * for all {@code x} and {@code y}.  (This
	 * implies that {@code x.compareTo(y)} must throw an exception iff
	 * {@code y.compareTo(x)} throws an exception.)
	 *
	 * <p>The implementor must also ensure that the relation is transitive:
	 * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
	 * {@code x.compareTo(z) > 0}.
	 *
	 * <p>Finally, the implementor must ensure that {@code x.compareTo(y)==0}
	 * implies that {@code sgn(x.compareTo(z)) == sgn(y.compareTo(z))}, for
	 * all {@code z}.
	 *
	 * <p>It is strongly recommended, but <i>not</i> strictly required that
	 * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
	 * class that implements the {@code Comparable} interface and violates
	 * this condition should clearly indicate this fact.  The recommended
	 * language is "Note: this class has a natural ordering that is
	 * inconsistent with equals."
	 *
	 * <p>In the foregoing description, the notation
	 * {@code sgn(}<i>expression</i>{@code )} designates the mathematical
	 * <i>signum</i> function, which is defined to return one of {@code -1},
	 * {@code 0}, or {@code 1} according to whether the value of
	 * <i>expression</i> is negative, zero, or positive, respectively.
	 *
	 * @param student the object to be compared.
	 * @return a negative integer, zero, or a positive integer as this object
	 * is less than, equal to, or greater than the specified object.
	 * @throws NullPointerException if the specified object is null
	 * @throws ClassCastException   if the specified object's type prevents it
	 *                              from being compared to this object.
	 */
	@Override
	public int compareTo(Student student)
	{
		return this.matrikelNummer.compareTo(student.matrikelNummer);
	}
}

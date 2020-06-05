package dhbw.Termin04.Aufgabe02;

import java.util.Arrays;

import dhbw.Termin04.Aufgabe02.Student;

/**
 * Liste für Studenten, der nur bis zu einer vorgedefinierten Anzahl Studenten hinzugefügt werden dürfen.
 * In der Liste darf ein Student nur einmal vorkommen.
 * Studenten sind durch ihre Matrikelnummer eindeutig identifizerbar.
 * @inv. Die Liste darf nie mehr als MAX_ANZAHL_STUDENTEN Elemente haben.
 * @inv. Die Liste darf keine Lücken enthalten, d.h. die Elemente werden immer ans Ende angehängt 
 * und bei Entfernen eines Elements werden die entstandenen Lücken sofort wieder geschlossen. 
 *
 */
public class StudentenListe
{

	//maximale anzahn von Studenten in der Liste;
	private final static int MAX_ANZAHL_STUDENTEN = 10;
	
	//Container für die Studenten;
	private Student[] liste;
	
	// zählt die Anzahl der immatrikulierten Studenten
	private int anzahl;

	public StudentenListe() {
		super();
		liste = new Student[MAX_ANZAHL_STUDENTEN];
		anzahl = 0;
	}
	
	/**
	 * Füge einen neuen Studenten der Liste hinzu.
	 * @pre Anzahl kleiner als MAX_ANZAHL_STUDENTEN
	 * @pre student noch nicht in der Liste enthalten.
	 * @param student der hinzuzufügende Student.
	 */
	public void addStudent(Student student) {
		if (anzahl < MAX_ANZAHL_STUDENTEN && !containsStudent(student.getMatrikelNummer())) {
			liste[anzahl] = student;
			anzahl++;
		}
	}
	
	/**
	 * Entferne einen Studenten aus der Liste. 
	 * Sofern der Student vorhanden war, sind eventuelle Lücken in der Reihung durch 
	 * Neusortierung der Reihung zu schließen.
	 * @param matrikelNummer die Id des zu entfernenden Studenten.
	 */
	public void removeStudent(String matrikelNummer) {
		//Es wird nun der Index benötigt, da nach entfernen die Reihung ohne Lücken sortiert werden soll.
		//Es genügt nach der Anzahl zu suchen und nicht die komplette Liste durchzulaufen
		int index = -1; //indiziert keinen gefundenen eintrag
		for (int i = 0; i < anzahl; i++) {
			if (liste[i].getMatrikelNummer().equals(matrikelNummer)) {
				index = i;
				break;
			}
		}
		//entferne Student und sortiere Liste nur um wenn Student in der Liste enthalten ist
		if (index > -1) {
			for (int i = index; i < anzahl; i++) {
				liste[i] = liste[i+1];
			}
			//setze letztes Element zurück auf null
			liste[anzahl] = null;
			//reduziere Anzahl;
			anzahl--;
		}
	}
	
	/**
	 * prüft die Liste, ob bereits ein Student mit der Matrikelnummer enthalten ist.
	 * @param matrikelNummer zu prüfende Matrikelnummer
	 * @return true, wenn Nummer bereits enthalten, sonst false;
	 */
	private boolean containsStudent(String matrikelNummer) {
		//Es wird nicht explizit geprüft, ob matrikelNummer eine valide 9 stellige ID ist.
		//Achtung; eine Iteration durch forEach-Konstrukt würde auf "Null"-Elemente stossen!
		for (int i=0; i < anzahl; i++) {
			Student student = liste[i];
			if (student.getMatrikelNummer().equals(matrikelNummer)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * liefert die Anzahl der in der Liste aufgenommenen Studenten. 
	 * @return Anzahl der in der Liste aufgenommenen Studenten.
	 */
	public int getAnzahlStudenten() {
		return anzahl;
	}
	
	/**
	 * Sucht nach Studenten, die dem Filterkriterium entsprechen.
	 * @param filter Filter für die Suche, alle Kriterien müssen erfüllt sein.
	 * @return Reihung von Studenten, die den Kriterien genügen.
	 */
	public Student[] suche(StudentFilter filter) {
		//Mehr als Vollauswahl ist nicht möglich
		Student[] result = new Student[anzahl];
		int filterAnzahl = 0;
		//Achtung; eine Iteration durch forEach-Konstrukt würde auf "Null"-Elemente stossen!
		for (int i=0; i < anzahl; i++) {
			Student student = liste[i];
			if (filter.matchFilter(student)) {
				result[filterAnzahl] = student;
				filterAnzahl++;
			}
		}
		//redimensioniere Ergebnis auf die exakt erforderliche Anzahl
		//erzeuge unter Verwendung der Hilfsklasse eine neue Reihung der erforderlichen Größe.
		return Arrays.copyOf(result, filterAnzahl);
	}
	
	/**
	 * Für die Testausgabe.
	 */
	public void printListe()
	{
		System.out.println("Die Liste enthält folgende Studenten:");
		for (int i=0; i < anzahl; i++) {
			Student student = liste[i];
			System.out.println(student.toString());
		}
	}

	public Student getStudent(int index)
	{
		if(index >= 0 && index < this.getAnzahlStudenten()) {
			return liste[index];
		}
		else {
			return null;
		}
	}

	public void sortStudent()
	{
		Student temp;
		for(int i = 1  ; i < liste.length; i++)
		{
			for(int j = 0; j < liste.length - i; j++ )
			{
				if((liste[j].compareTo(liste[j + 1])) > 0 )
				{
					temp = getStudent(j);
					liste[j] = liste[j + 1];
					liste[j+1] = temp;
				}
			}
		}
	}
}

import java.util.Scanner; // Importiere die Scanner-Klasse für Benutzereingaben


public class Main {
    static Scanner scanner = new Scanner(System.in); // Scanner-Objekt für Benutzereingaben

    public static void main(String[] Args) {
        // Endlosschleife für das Hauptmenü
        while (true) {
            // Menü anzeigen
            System.out.println("\n--- Studentenverwaltung ---");
            System.out.println("1: hinzufügen"); // Option zum Hinzufügen eines Studenten
            System.out.println("2: entfernen"); // Option zum Entfernen eines Studenten
            System.out.println("3: Durchschnittsalter"); // Option zur Berechnung des Durchschnittsalters
            System.out.println("4: Anzeigen"); // Option zur Anzeige aller gespeicherten Studenten
            System.out.println("5: Beenden"); // Option zum Beenden des Programms
            System.out.print("Auswahl: ");

            int option = scanner.nextInt(); // Benutzer gibt eine Option ein

            // Schalter für die Menüoptionen
            switch (option) {
                case 1:
                    Methoden.addStudent(); // Methode zum Hinzufügen eines Studenten aufrufen
                    break;
                case 2:
                    Methoden.removeStudent(); // Methode zum Entfernen eines Studenten aufrufen
                    break;
                case 3:
                    Methoden.durchschnittsalter(); // Methode zur Berechnung des Durchschnittsalters aufrufen
                    break;
                case 4:
                    Methoden.alleAnzeigen(); // Methode zum Anzeigen aller Studenten aufrufen
                    break;
                case 5:
                    System.out.println("Programm beendet."); // Beenden-Nachricht
                    return; // Programm beenden
                default:
                    System.out.println("Ungültige Eingabe."); // Fehlernachricht bei falscher Eingabe
            }
        }
    }
}

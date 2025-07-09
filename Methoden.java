import java.util.Scanner;

public class Methoden {

    // Globale Variablen
    // Arrays, um die Namen und Alter der Studenten zu speichern
    static String[] Studenten = new String[10]; // Array für die Namen der Studenten
    static int[] alter = new int[10]; // Array für die Alter der Studenten
    static int studentenanzahl = 0; // Zählt, wie viele Studenten aktuell gespeichert sind
    static Scanner scanner = new Scanner(System.in); // Scanner-Objekt für Benutzereingaben

    // Methode zum Hinzufügen eines Studenten
    public static void addStudent() {
        // Überprüfen, ob noch Platz im Array ist
        if (studentenanzahl < 10) {
            System.out.print("Welchen Studenten wollen Sie hinzufügen? ");
            scanner.nextLine(); // Eingabepuffer leeren (wichtig nach nextInt())
            String name = scanner.nextLine(); // Name des Studenten eingeben

            System.out.print("Alter des Studenten: ");
            int studentenAlter = scanner.nextInt(); // Alter des Studenten eingeben

            // Student und Alter ins Array einfügen
            Studenten[studentenanzahl] = name; // Name speichern
            alter[studentenanzahl] = studentenAlter; // Alter speichern
            studentenanzahl++; // Anzahl der Studenten erhöhen

            System.out.println("Student hinzugefügt!"); // Bestätigungsmeldung
        } else {
            System.out.println("Liste ist voll."); // Fehlermeldung, wenn das Array voll ist
        }
    }

    // Methode zum Entfernen eines Studenten
    public static void removeStudent() {
        // Überprüfen, ob die Liste leer ist
        if (studentenanzahl > 0) {
            System.out.print("Welchen Studenten möchten Sie entfernen? (Nummer eingeben): ");
            int nummer = scanner.nextInt(); // Nummer des zu entfernenden Studenten eingeben

            // Überprüfen, ob die Nummer gültig ist
            if (nummer > 0 && nummer <= studentenanzahl) {
                // Verschieben der Einträge im Array, um die Lücke zu schließen
                for (int i = nummer - 1; i < studentenanzahl - 1; i++) {
                    Studenten[i] = Studenten[i + 1]; // Verschiebe Namen
                    alter[i] = alter[i + 1]; // Verschiebe Alter
                }
                // Letzten Eintrag im Array löschen
                Studenten[studentenanzahl - 1] = null; // Name entfernen
                alter[studentenanzahl - 1] = 0; // Alter auf 0 setzen
                studentenanzahl--; // Anzahl der Studenten reduzieren

                System.out.println("Student entfernt!"); // Bestätigungsmeldung
            } else {
                System.out.println("Ungültige Nummer. Bitte erneut versuchen."); // Fehlernachricht
            }
        } else {
            System.out.println("Liste ist leer."); // Meldung, wenn keine Studenten in der Liste sind
        }
    }

    // Methode zur Berechnung des Durchschnittsalters
    public static void durchschnittsalter() {
        // Überprüfen, ob Studenten vorhanden sind
        if (studentenanzahl > 0) {
            int summe = 0; // Variable für die Summe des Alters
            // Alle Alter summieren
            for (int i = 0; i < studentenanzahl; i++) {
                summe += alter[i];
            }
            // Durchschnitt berechnen
            double durchschnittsalter = (double) summe / studentenanzahl; // Division als Gleitkomma
            System.out.printf("Das Durchschnittsalter beträgt: %.2f Jahre%n", durchschnittsalter);
        } else {
            System.out.println("Liste ist leer."); // Meldung, wenn keine Studenten vorhanden sind
        }
    }

    // Methode zum Anzeigen aller Studenten
    public static void alleAnzeigen() {
        // Überprüfen, ob Studenten vorhanden sind
        if (studentenanzahl > 0) {
            System.out.println("\n--- Studentenliste ---");
            // Alle Studenten im Array durchlaufen und ausgeben
            for (int i = 0; i < studentenanzahl; i++) {
                System.out.println((i + 1) + ". Name: " + Studenten[i] + ", Alter: " + alter[i]);
            }
        } else {
            System.out.println("Keine Studenten in der Liste."); // Meldung, wenn keine Studenten vorhanden sind
        }
    }
}

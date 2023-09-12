import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private Controller controller;
    private Database db;

    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        m.db = new Database();
        m.controller = new Controller(m.db);
        m.startProgram();
    }

    public void startProgram() {
        int brugerValg = -1;
        while (brugerValg != 3) {
            System.out.println("""
                    Velkommen til superhelteuniverset!
                    1. Opret en ny superhelt
                    2. Vis oprettede superhelte
                    3. Afslut
                    """);

            brugerValg = keyboard.nextInt();
            keyboard.nextLine();

            håndterBrugerValg(brugerValg);
        }
    }

    public void håndterBrugerValg(int brugerValg) {
        if (brugerValg == 1) {
            System.out.print("Indtast navnet på din superhelt: ");
            String navn = keyboard.nextLine();
            System.out.print("Indtast din superhelts superheltenavn: ");
            String superheltenavn = keyboard.nextLine();
            System.out.print("Er din superhelt menneske? (true/false): ");
            boolean menneske = keyboard.nextBoolean();
            keyboard.nextLine();
            System.out.print("Indtast superkraft: ");
            String superkraft = keyboard.nextLine();
            System.out.print("Indtast skabelsesår af din superhelt: ");
            int skabelsesår = keyboard.nextInt();
            System.out.print("Indtast styrke: ");
            int styrke = keyboard.nextInt();

            controller.tilføjSuperhelt(navn, superheltenavn, superkraft, skabelsesår, menneske, styrke);
        } else if (brugerValg == 2) {
            visSuperhelte();
        } else if (brugerValg == 3) {
            afslut();
        }
    }

    public void visSuperhelte() {
        ArrayList<Superhelt> superhelte = controller.hentSuperhelte();

        if (superhelte.isEmpty()) {
            System.out.println("Du har ikke oprettet nogen superhelte endnu");
        } else {
            System.out.println("Liste over oprettede superhelte: ");
            for (Superhelt superhelt : superhelte) {
                System.out.println(superhelt);
            }
        }
    }

    public void afslut() {
        System.out.println("Programmet er afsluttet ");
        System.exit(0);
    }
}
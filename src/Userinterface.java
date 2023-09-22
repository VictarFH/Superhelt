import java.util.Scanner;

public class Userinterface {
    private Controller controller;
    private Scanner keyboard = new Scanner(System.in);

    public void startProgram() {

        Userinterface m = new Userinterface();
        Database db = new Database();
        m.controller = new Controller(db);
        m.tilføjSuperhelt();

    }

    public void tilføjSuperhelt() {

        System.out.println("""
                Velkommen til superhelteuniverset!
                1. Opret en ny superhelt
                2. Vis oprettede superhelte
                3. Søg efter superhelt
                4. Ændre superhelte
                9. Afslut
                """);
        char brugerValg = keyboard.next().charAt(0);
        keyboard.nextLine();

        if (brugerValg == '1') {

            System.out.print("Indtast din superhelts rigtige navn: ");
            String navn = keyboard.nextLine();
            System.out.print("Indtast din superhelts superheltenavn: ");
            String superheltenavn = keyboard.nextLine();
            System.out.print("Er din superhelt menneske? (true/false): ");
            boolean menneske = keyboard.nextBoolean();
            keyboard.nextLine();
            System.out.print("Indtast superkraft: ");
            String superkraft = keyboard.nextLine();
            System.out.print("Indtast skabelsesår af din superhelt: ");
            if (!keyboard.hasNextInt()) {
                String text = keyboard.next();
                System.out.println(text + " er ikke et gyldigt tal. Prøv igen. ");
            }
            int skabelsesår = keyboard.nextInt();
            System.out.print("Indtast styrke 1-10: ");
            int styrke = keyboard.nextInt();
            System.out.println("Din superhelt er blevet oprettet! ");

            controller.tilføjSuperhelt(navn, superheltenavn, superkraft, skabelsesår, menneske, styrke);
            tilføjSuperhelt();

        } else if (brugerValg == '2') {
            visSuperhelt();
        } else if (brugerValg == '3') {
            søgSuperhelt();
        } else if (brugerValg == '4') {
            ændreSuperhelt();
        } else if (brugerValg == '9')
            afslut();
    }

    public void visSuperhelt() {
        System.out.println("Dine gemte superhelte: ");
        for (Superhelt s : controller.hentSuperhelte()) {
            System.out.println(s);
        }
        tilføjSuperhelt();
    }

    public void søgSuperhelt() {
        System.out.println("Skriv navnet på den superhelt du vil søge efter: ");
        String søgeNavn = keyboard.next();
        controller.søgSuperhelt(søgeNavn);
        tilføjSuperhelt();

    }

    public void ændreSuperhelt() {
        System.out.println("Skriv navnet på den superhelt du vil søge efter: ");
        String søgBestemtNavn = keyboard.next();
        controller.visSuperhelt(søgBestemtNavn);
        System.out.println("Hvad vil du ændre på din superhelt? ");
        System.out.println("1. Navn");
        System.out.println("2. Superheltenavn ");
        System.out.println("3. Superkraft ");
        System.out.println("4. Skabelsesåret for din superhelt ");
        System.out.println("5. Om din superhelt er et menneske ");
        System.out.println("6. Styrkeniveauet ");
        char superhelteÆndring = keyboard.next().charAt(0);

        if (superhelteÆndring == '1') {
            System.out.println("Hvad vil du ændre din superhelts rigtige navn til? ");
            String nytNavn = keyboard.next();
            controller.ændreNavn(søgBestemtNavn, nytNavn);
            System.out.println("Din superhelts rigtige navn er ændret! ");
            søgBestemtNavn = nytNavn;
            controller.visSuperhelt(søgBestemtNavn);
            tilføjSuperhelt();

        } else if (superhelteÆndring == '2') {
            System.out.println("Hvad vil du ændre din superhelts superheltenavn til? ");
            String nytSuperheltenavn = keyboard.next();
            controller.ændreSuperheltenavn(søgBestemtNavn, nytSuperheltenavn);
            System.out.println("Superheltenavnet er ændret! ");
            controller.visSuperhelt(søgBestemtNavn);
            tilføjSuperhelt();

        } else if (superhelteÆndring == '3') {
            System.out.println("Hvad vil du ændre din superhelts superkraft til? ");
            String nySuperkraft = keyboard.next();
            controller.ændreSuperkraft(søgBestemtNavn, nySuperkraft);
            System.out.println("Superkraften er ændret! ");
            controller.visSuperhelt(søgBestemtNavn);
            tilføjSuperhelt();

        } else if (superhelteÆndring == '4') {
            System.out.println("Hvad vil du ændre din superhelts skabelsesår til? ");
            int nytSkabelsesår = keyboard.nextInt();
            controller.ændreSkabelsesår(søgBestemtNavn, nytSkabelsesår);
            System.out.println("Skabelsesåret er ændret! ");
            controller.visSuperhelt(søgBestemtNavn);
            tilføjSuperhelt();

        } else if (superhelteÆndring == '5') {
            System.out.println("Er din superhelt stadig et menneske? ");
            boolean nyErMenneske = keyboard.nextBoolean();
            controller.ændreErMenneske(søgBestemtNavn, nyErMenneske);
            System.out.println("Menneskestatus er ændret! ");
            controller.visSuperhelt(søgBestemtNavn);
            tilføjSuperhelt();

        } else if (superhelteÆndring == '6') {
            System.out.println("Hvad vil du ændre din superhelts styrkeniveau til? ");
            int nytStyrkeNiveau = keyboard.nextInt();
            controller.ændreStyrkeNiveau(søgBestemtNavn, nytStyrkeNiveau);
            System.out.println("Styrkeniveauet er ændret! ");
            controller.visSuperhelt(søgBestemtNavn);
            tilføjSuperhelt();
        }
    }

    public void afslut() {
        System.out.println("Programmet er afsluttet. ");
        System.exit(0);
    }
}

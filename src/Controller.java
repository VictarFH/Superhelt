import java.util.ArrayList;

public class Controller {
    private Database db;

    public Controller(Database db) {
        this.db = db;
    }

    public void tilføjSuperhelt(String navn, String superheltenavn, String superkraft, int skabelsesår, boolean menneske, int styrke) {
        db.tilføjSuperhelt(navn, superheltenavn, superkraft, skabelsesår, menneske, styrke);
    }


    public void søgSuperhelt(String søgeNavn) {
        db.søgSuperhelt(søgeNavn);
    }


    public void ændreNavn(String søgBestemtNavn, String nytNavn){
        db.ændreNavn(søgBestemtNavn, nytNavn);
    }
    public void ændreSuperheltenavn(String søgBestemtNavn, String nytVirkeligeNavn){
        db.ændreSuperheltenavn(søgBestemtNavn, nytVirkeligeNavn);
    }
    public void ændreSuperkraft(String søgBestemtNavn, String nySuperkraft){
        db.ændreSuperkraft(søgBestemtNavn, nySuperkraft);
    }
    public void ændreSkabelsesår(String søgBestemtNavn, int nytÅrSkabt){
        db.ændreSkabelsesår(søgBestemtNavn, nytÅrSkabt);
    }
    public void ændreErMenneske(String søgBestemtNavn, Boolean nyErMenneske){
        db.ændreErMenneske(søgBestemtNavn, nyErMenneske);
    }
    public void ændreStyrkeNiveau(String søgBestemtNavn, int nytStyrkeNiveau){
        db.ændreStyrkeNiveau(søgBestemtNavn, nytStyrkeNiveau);
    }


    public ArrayList<Superhelt> hentSuperhelte() {
        return db.hentSuperhelte();
    }

    public void visSuperhelt(String søgBestemtNavn) {
        db.visSuperhelt(søgBestemtNavn);

    }
}

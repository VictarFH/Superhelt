import java.util.ArrayList;

public class Controller {
    private Database db;

    public Controller(Database db) {
        this.db = db;
    }

    public void tilføjSuperhelt(String navn, String superheltenavn, String superkraft, int skabelsesår, boolean menneske, int styrke) {
        db.tilføjSuperhelt(navn, superheltenavn, superkraft, skabelsesår, menneske,  styrke);
    }

    public ArrayList<Superhelt> hentSuperhelte() {
        return db.hentSuperhelte();
    }
}

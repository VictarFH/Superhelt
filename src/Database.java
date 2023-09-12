import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    private ArrayList<Superhelt> superhelte = new ArrayList<>();

    public void tilføjSuperhelt(String navn, String superheltenavn, String superkraft, int skabelsesår, boolean menneske, int styrke) {
        Superhelt superhelt = new Superhelt(navn, superheltenavn, superkraft, skabelsesår, menneske, styrke);
        superhelte.add(superhelt);
    }

    public ArrayList<Superhelt> hentSuperhelte() {
        return superhelte;
    }
}

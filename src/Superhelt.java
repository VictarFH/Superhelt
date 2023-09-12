import java.util.Scanner;
import java.util.ArrayList;

public class Superhelt {

    //Attributter
    private String navn;
    private String superheltenavn;
    private String superkraft;
    private int skabelsesår;
    private boolean menneske;
    private int styrke;

    //parametre
    public Superhelt(String navn, String superheltenavn, String superkraft, int skabelsesår, boolean menneske, int styrke) {
        this.navn = navn;
        this.superheltenavn = superheltenavn;
        this.superkraft = superkraft;
        this.skabelsesår = skabelsesår;
        this.menneske = menneske;
        this.styrke = styrke;
    }

    @Override
    public String toString() {
        return "Superhelt{" +
                "navn='" + navn + '\'' +
                ", superheltenavn='" + superheltenavn + '\'' +
                ", superkraft='" + superkraft + '\'' +
                ", skabelsesår=" + skabelsesår +
                ", menneske=" + menneske +
                ", styrke=" + styrke +
                '}';
    }
}
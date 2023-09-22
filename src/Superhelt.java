import java.util.Scanner;
import java.util.ArrayList;

public class Superhelt {


    private String navn;
    private String superheltenavn;
    private String superkraft;
    private int skabelsesår;
    private boolean menneske;
    private int styrke;


    public Superhelt(String navn, String superheltenavn, String superkraft, int skabelsesår, boolean menneske, int styrke) {
        this.navn = navn;
        this.superheltenavn = superheltenavn;
        this.superkraft = superkraft;
        this.skabelsesår = skabelsesår;
        this.menneske = menneske;
        this.styrke = styrke;
    }

    public String getNavn() {
        return navn;
    }

    public String getSuperheltenavn() {
        return superheltenavn;
    }

    public String getSuperkraft() {
        return superkraft;
    }

    public int getSkabelsesår() {
        return skabelsesår;
    }

    public boolean getMenneske() {
        return menneske;
    }

    public int getStyrke() {
        return styrke;
    }

    public void setNavn(String n) {
        navn = n;
    }

    public void setSuperheltenavn(String r) {
        superheltenavn = r;
    }

    public void setSuperkraft(String s) {
        superkraft = s;
    }

    public void setSkabelsesår(int y) {
        skabelsesår = y;
    }

    public void setMenneske(boolean i) {
        menneske = i;
    }

    public void setStyrke(int s) {
        styrke = s;
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
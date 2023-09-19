import java.util.ArrayList;

public class Database {

    private ArrayList<Superhelt> superhelte = new ArrayList<Superhelt>();


    public void tilføjSuperhelt(String navn, String superheltenavn, String superkraft, int skabelsesår, boolean menneske, int styrke) {
        superhelte.add(new Superhelt(navn, superheltenavn, superkraft, skabelsesår, menneske, styrke));
    }

    public ArrayList<Superhelt> hentSuperhelte() {
        return superhelte;
    }


    public void søgSuperhelt(String søgeNavn) {
        for (Superhelt p : hentSuperhelte()) {
            if (søgeNavn.equalsIgnoreCase(p.getNavn()) || p.getNavn().contains(søgeNavn)) {
                System.out.println("Superhelte fundet: " + p.getNavn());
            } else {
                System.out.println("Superhelte ikke fundet " + søgeNavn);
            }
        }
    }


    public Superhelt visSuperhelt(String søgBestemtNavn) {
        for (Superhelt s : superhelte) {
            if (s.getNavn().equalsIgnoreCase(søgBestemtNavn)) {
                System.out.println(hentSuperhelte());
            } else if (!s.getNavn().equalsIgnoreCase(søgBestemtNavn)) {
                System.out.println("Superhelten kunne ikke findes ");
            }
        }
        return null;
    }

    public Superhelt ændreNavn(String søgBestemtNavn, String nytNavn) {
        for (Superhelt s : superhelte) {
            if (s.getNavn().equalsIgnoreCase(søgBestemtNavn)) {
                s.setNavn(nytNavn);
            }
        }
        return null;
    }

    public Superhelt ændreSuperheltenavn(String søgBestemtNavn, String nytSuperheltenavn) {
        for (Superhelt s : superhelte) {
            if (s.getNavn().equalsIgnoreCase(søgBestemtNavn)) {
                s.setNavn(nytSuperheltenavn);
            }
        }
        return null;
    }

    public Superhelt ændreSuperkraft(String søgBestemtNavn, String nySuperkraft) {
        for (Superhelt s : superhelte) {
            if (s.getNavn().equalsIgnoreCase(søgBestemtNavn)) {
                s.setSuperkraft(nySuperkraft);
            }
        }
        return null;
    }

    public Superhelt ændreSkabelsesår(String søgBestemtNavn, int nytSkabelsesår) {
        for (Superhelt s : superhelte) {
            if (s.getNavn().equalsIgnoreCase(søgBestemtNavn)) {
                s.setSkabelsesår(nytSkabelsesår);
            }
        }
        return null;
    }

    public Superhelt ændreErMenneske(String søgBestemtNavn, Boolean nyErMenneske) {
        for (Superhelt s : superhelte) {
            if (s.getNavn().equalsIgnoreCase(søgBestemtNavn)) {
                s.setMenneske(nyErMenneske);
            }
        }
        return null;
    }

    public Superhelt ændreStyrkeNiveau(String søgBestemtNavn, int nytStyrkeNiveau) {
        for (Superhelt s : superhelte) {
            if (s.getNavn().equalsIgnoreCase(søgBestemtNavn)) {
                s.setStyrke(nytStyrkeNiveau);
            }
        }
        return null;
    }
}
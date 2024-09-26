import java.util.*;

public class Medienbibliothek {

    private List<Medium> medienbibliothek;

    public Medienbibliothek(List<Medium> medienbibliothek) {
        this.medienbibliothek = medienbibliothek;
    }

    public Medienbibliothek() {
        this.medienbibliothek = new ArrayList<Medium>();
        }

    public void mediumHinzufügen(Medium m) {
        medienbibliothek.add(m);
    }

    public void alleAnzeigen() {

        for(Medium m : medienbibliothek) {
            System.out.println(m.toString());
        }
    }

    public void anzeigen(String titel) {

        for(Medium m : medienbibliothek) {
            if(m.getTitel().compareTo(titel) == 0) {
                System.out.println(m.toString());
            }
        }
    }

}

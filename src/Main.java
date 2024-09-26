import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Film film1 = new Film("Test",new Genre("Horror"),new Urheber("Peter","Mustermann","Hollywood"), LocalDate.now(), "Peter",120, true, true, "TestKommentar");
        EBook ebook1 = new EBook("Testbuch",new Genre("Sachbuch"),new Urheber("Max","Mustermann","fff"),LocalDate.now(),"Peter","1243",140,"Dritte","hhhh");
        Medienbibliothek m = new Medienbibliothek();
        m.mediumHinzufügen(film1);
        m.mediumHinzufügen(ebook1);
        m.alleAnzeigen();
        m.anzeigen("Testbuch");
        m.anzeigen("hhhh");
    }
}
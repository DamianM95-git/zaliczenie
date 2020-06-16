import java.util.ArrayList;
import java.util.List;

public class Biblioteka {
  private int idGenerator = 1;
  private List<Ksiazka> ksiazki;
  private List<Uzytkownik> uzytkownicy;

  private List<WpisRejestru> rejestrWypozyczen;

  public Biblioteka() {
    this.ksiazki = new ArrayList<>();
    this.uzytkownicy = new ArrayList<>();
    this.rejestrWypozyczen = new ArrayList<>();
  }

  public void dodajKsiazke(Ksiazka ksiazka){
    ksiazka.setId(idGenerator);
    idGenerator = idGenerator +1;
    this.ksiazki.add(ksiazka);
  }

  public void dodajUzytkownika(Uzytkownik uzytkownik){
    uzytkownik.setId(idGenerator++);
    this.uzytkownicy.add(uzytkownik);
  }

  public boolean czyKsiazkaJestDostepna(Ksiazka ksiazka){
    if (rejestrWypozyczen.isEmpty()){
      return true;
    }
    for (WpisRejestru wpis : rejestrWypozyczen){
      if (wpis.getKsiazka().equals(ksiazka) && wpis.getDataZwrotu() == null){
        return false;
      }
    }
    return true;
  }

  public void odzyskajZKopii(List<Ksiazka> ksiazki, List<Uzytkownik> uzytkownicy, List<WpisRejestru> rejestrWypozyczen){
    this.ksiazki = ksiazki;
    this.uzytkownicy = uzytkownicy;
    this.rejestrWypozyczen = rejestrWypozyczen;
  }

  public List<Ksiazka> getKsiazki() {
    return ksiazki;
  }

  public List<Uzytkownik> getUzytkownicy() {
    return uzytkownicy;
  }
}

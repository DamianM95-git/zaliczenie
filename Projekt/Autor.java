package Projekt;

public class Autor {
  private String imie;
  private String nazwisko;

  public String getImie() {
    return imie;
  }

  public void setImie(String imie) {
    this.imie = imie;
  }

  public String getNazwisko() {
    return nazwisko;
  }

  public void setNazwisko(String nazwisko) {
    this.nazwisko = nazwisko;
  }

  @Override public String toString() {
    return imie + " " + nazwisko;
  }
}

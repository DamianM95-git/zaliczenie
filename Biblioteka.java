import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String opcja;
    do{
    System.out.println("Podaj nazwę uzytkownika");
    String user = scan.nextLine();
    System.out.println("Podaj hasło dla danego użytkownika");
    String passw = scan.nextLine();

  System.out.println("Nazwa użytkownia to: \n" + user + "\na hasło: \n" +passw);

  HashMap<String,String> sampleMap = new HashMap<>();
  sampleMap.put(user,passw);

  System.out.println ("Podaj nazwę użytkownika, którą wprowadziłeś, a ja powiem jakie ma hasło");
  String user1 = scan.nextLine();
  for(String key : sampleMap.keySet()) 
  {
    String value = sampleMap.get(key);
    System.out.println("Dla użytkownika: "+ key + " hasło to: " + value);
      //else{
      //System.out.println("Podałeś nieprawidlową nazwę użytkownika\n");
      //continue;
  }
  
  System.out.println("Jeśli chcesz zakończyć wybierz Q "+
  "jesli nie, podaj inny znak. ");
  opcja = scan.next();
    }
    while ((!opcja.equalsIgnoreCase("Q")));
    
}
}

import java.util.Scanner;

public class Prompter{
  Scanner scanner = new Scanner(System.in);
  
  public static boolean isInteger(String s, int radix) {
    if(s.isEmpty()) return false;
    for(int i = 0; i < s.length(); i++) {
        if(i == 0 && s.charAt(i) == '-') {
            if(s.length() == 1) return false;
            else continue;
        }
        if(Character.digit(s.charAt(i),radix) < 0) return false;
    }
    return true;
}
  
  public int promptForInt(String promptPhrase){
    String input = "";
    boolean isInt = false;
    while(!isInt){
      System.out.print(promptPhrase + " ");
      input = scanner.next();
      if(isInteger(input,10)){
        isInt = true;
      } else {
        System.out.println("Oops! You need to give me an integer!");
      }
    }
    return Integer.parseInt(input);
  }
  
  public String promptForString(String promptPhrase){
    System.out.print(promptPhrase + " ");
    return scanner.nextLine();
  }
  
  public void out(String output){
    System.out.print(output);
  }
  
  public void promptForEnter(String promptPhrase){
    String temp = promptForString(promptPhrase);
    scanner.nextLine();
    return;
  }
}
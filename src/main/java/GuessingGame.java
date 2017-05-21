public class GuessingGame {
    public static void main(String[] args) {
      Prompter prompter = new Prompter();
      prompter.out("ADMINISTRATOR SETUP\n====================\n");
      String item = prompter.promptForString("What type of item is in the jar: ");
      int maxItems;
      maxItems = prompter.promptForInt("maximum amount of " + item + " in the jar: ");
      
      Jar jar = new Jar(item, maxItems);
      jar.fill();
      
      prompter.out("PLAYER\n====================\nYour goal is to guess how many " + jar.getItemName() + " are in the jar.");
      
      int guess;
      int tries = 1;
      do{
        guess = prompter.promptForInt("Your guess should be between 1 and " + Integer.toString(jar.getMaxItems()) + ".  How many " + jar.getItemName() + "? ");
        if(guess < jar.getActualItems()){
          tries++;
          prompter.out("too low. ");
        }else if(guess > jar.getActualItems() && guess <= jar.getMaxItems()){
          tries++;
          prompter.out("too high. ");
        } else if (guess > jar.getMaxItems()){
          prompter.out("Your guess must be less than maximum fill amount, " + Integer.toString(jar.getMaxItems()) + ".\n");
        }
      }while(guess != jar.getActualItems());
      
      prompter.out("You got it in " + Integer.toString(tries) + " attempt(s).\n");
    }
}

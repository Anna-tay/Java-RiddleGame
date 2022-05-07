import java.util.Scanner;

public class Hint {


  public static void getHint(int count, String[] awnsers, int num){
    if (count == 4){
      Scanner myObj = new Scanner(System.in);
      String userGuess;
      Display.displayIt("do you want a hint?[Y/N]"); 
      userGuess = myObj.nextLine();

      if (userGuess.equalsIgnoreCase("y")){
        Display.displayIt("the hint is: " + awnsers[num+12]);
        Display.displayIt(" ");
      }else{
        Display.displayIt("your loss!");
      }
    }

  }
}

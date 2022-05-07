import java.util.Scanner;
public class Input {
  
    public static int userInput(String[] mylist, int num){
        Scanner myObj = new Scanner(System.in);
        String userGuess;
        System.out.println(mylist[num]);
        Display.displayIt("What do you think it is?(one word awnsers)"); 
        userGuess = myObj.nextLine();
  
        if (userGuess.equalsIgnoreCase(mylist[num+6])){
            Display.displayIt("Great job! you guessed it");
          return 6;
        }else{
            Display.displayIt("Sorry try again");
          return 1;
        }  
         
      }
}

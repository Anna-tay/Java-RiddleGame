import java.util.Scanner;
public class StartGame {
    public static void start(){
        System.out.println("Hello to guess the Riddle! Want to play?[y/n]");
        Scanner myObj = new Scanner(System.in);
        String userGuess = myObj.nextLine();
        if (userGuess.equalsIgnoreCase("y")){
            Display.displayIt("let's go");
            play();
        }else{
            Display.displayIt("OK, well we will have to play next time!");
        } 
    }

    public static void play(){
        // my lists for riddles and anwsers 
        String[] mylist = {" I'm tall when I'm young, and I'm short when I'm old. What am I", "What has a ring, but no finger?", "What is always in front of you but can't be seen?", "What has to be broken before you can use it?", "What can't talk but will reply when spoken to?", "I have branches, but no fruit, trunk or leaves. What am I?", "Candle", "phone", "future", "egg", "echo", "bank", "Can---", "p--ne", "fut---", "eg-", "e-c-", "b--k"  }; 
        
        //varibles 
        int guessedIt = 0;
        int num = randomNumber();
        int count = 0;
        //game loop, until they guess it right or they guesed too many times
        while(guessedIt != 6){
            // print makes it look cleaner 
            Display.displayIt(" ");
            //gets count of guesses
            // Calls the GuessCount class to find what the guess count is
            count = GuessCount.countNumber(count);
            //gives hint 
            Hint.getHint(count, mylist, num);
            // did they guess right?
            guessedIt = Input.userInput(mylist, num);
            // if guessed == 8 then end game  
            if (count == 6){
                guessedIt = 6;
                Display.displayIt("The word is: " + mylist[num+6]);
                Display.displayIt("Thank you for playing!");
            }
        }
    }

    // gets random number
    static int randomNumber(){
        int min = 0;
        int max = 5;
        int number = (int)Math.floor(Math.random()*(max-min+1)+min);
        return number;
      }
}

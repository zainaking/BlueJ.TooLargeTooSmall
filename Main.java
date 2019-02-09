
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(){
    
    Random randomNumber = new Random();    
    Scanner scanner = new Scanner(System.in);
   
  int success = 0;
  int guess = 0;
  
  while(true) {
   int winningNumber = randomNumber.nextInt(10);
   int numberOfGuesses = 0;
  
  while(true) {
      
      System.out.println("Please enter a number between 1-10");
      
      guess = scanner.nextInt();
      numberOfGuesses++;
      
       if (guess < 1 || guess > 10){
              System.out.println("Please enter a number 1-10");
             
            } else if(guess == winningNumber){
              success++;
              System.out.println("Congratulations you won! The winning number was: " + winningNumber);
              
              break;
            } else if (guess < winningNumber){
              System.out.println("Your guess is too low!");
            }else if (guess > winningNumber){
              System.out.println("Your guess is too high!");
    }
    System.out.println("Do you want to play again? (1:Yes/2:No)");
    
    if(scanner.nextInt() != 1)
    break;
}
}
}
}
  

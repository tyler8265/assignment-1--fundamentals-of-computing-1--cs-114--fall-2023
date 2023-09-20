// Import libraries here


// Tyler Bertrand

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Assignment1 {
  public static void main(String[] args)
  {
    float fahrenheit;
    float celsius; 
    String randomString;
    String reversedString;
    int min;
    int max;
    int randomInt;
    Scanner scan = new Scanner(System.in);

    //Spells out my initials with the letter of my initials
    System.out.println("TTTTTTTTTTTTTTTTTT     BBBBBBBBBBBBB");
    System.out.println("TTTTTTTTTTTTTTTTTT     BBB         BBB" );
    System.out.println("      TTTTTT           BBB          BBB"   );
    System.out.println("      TTTTTT           BBB         BBB");
    System.out.println("      TTTTTT           BBBBBBBBBBBBBB");
    System.out.println("      TTTTTT           BBB          BBB");
    System.out.println("      TTTTTT           BBB           BBB");
    System.out.println("      TTTTTT           BBB          BBB");
    System.out.println("      TTTTTT           BBBBBBBBBBBBB");
    System.out.println("                                             ");
    
    //Requests the user to input an integer that will be assigned to the "Fahrenheit" variable
    System.out.println("Please enter a number in Fahrenheit: ");
    fahrenheit = scan.nextInt();
    
    //Stores the Celsius temperature counterpart to the Fahrenheit temperature from the user input
    celsius = ((fahrenheit - 32) * 5/9);

    //Prompts the user for a 5 character string, then saves the string in reverse without the first and last characters
    System.out.println("Please enter a 5 character string: ");
    randomString = scan.nextLine();
    randomString = randomString.substring(1, randomString.length() - 1);
    reversedString = new StringBuilder(randomString).reverse().toString();
    System.out.println(reversedString);

    //Generate a random number between 32 - 16,384, including the two numbers.
    min = 31;
    max = 16385;
    randomInt = ThreadLocalRandom.current().nextInt(min, max);
    System.out.println("Random number generated. Continuing...");

    //Adds the Celsius Temperature to the beginning of the string and adds the random generated number to the end.
   
    System.out.println("Your new string is " + celsius + reversedString + randomInt);
    scan.close();
  }
} 

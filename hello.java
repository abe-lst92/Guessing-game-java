

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hello {

   
  

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomUserlimits;
        boolean answer = false;
        int tries = 0;
        int upperRange;
        int lowerRange;

        System.out.println("Enter the Dificulty(in lower case)");        
            String difficulty = sc.nextLine();
            System.out.println("Select the maximun number to the guessing number(it can be 200, 300, 400, or even 1000)");        
            upperRange = sc.nextInt();
            System.out.print("Enter minimun guessing number(0 through your choice): ");
            lowerRange = sc.nextInt();
            randomUserlimits = random.nextInt(upperRange - lowerRange) + lowerRange;

//  System.out.println("Select the maximun number to the " + randomUserlimits);        

        while (!answer) {
            System.out.println(" Try to Guess the number ");
            int playerAnswer = sc.nextInt();

            if (difficulty.equals("hard")) {
                if (tries < 5) {

                    if (playerAnswer == randomUserlimits) {
                        System.out.println("You got the number");
                        System.out.println("Number of tries " + tries);

                        answer = true;

                    } else if (randomUserlimits < playerAnswer) {
                        System.out.println("Arrrrrggggg! Number to high!");
                    } else {
                        System.out.println("Nouuuuu! to low.");
                    }

                } else if (tries == 5) {

                    if (playerAnswer == randomUserlimits) {
                        System.out.println("You got the number");
                        System.out.println("Number of tries " + tries);

                        answer = true;

                    }
                    if (playerAnswer != randomUserlimits) {
                        System.out.println(
                                "You didn't get the number " + randomUserlimits + " Hopefully you got it next time");

                        break;

                    }

                }
                tries++;

            } else if(!difficulty.equals("hard")){

                while (!answer) {
                    System.out.println(" Try to Guess the number ");
                    int playerAnswer2 = sc.nextInt();


                        if (playerAnswer2 == randomUserlimits) {
                            System.out.println("You got the number");
                            System.out.println("Number of tries " + tries);

                            answer = true;

                        } else if (randomUserlimits < playerAnswer2) {
                            System.out.println("Arrrrrggggg! Number too high!");
                        } else {
                            System.out.println("Nouuuuu! too low.");
                        }
                    

                }
            }

        }

       

    }

}


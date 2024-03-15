package codsoft;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random random = new Random();
    int randomNumber(){
        int randomNumber = random.nextInt(100);
         return randomNumber;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    GuessNumber g = new GuessNumber();
    int score = 0;
    int guess = g.randomNumber();
        System.out.println("Guess Number : ");
        int inputNumber =0;

    while (inputNumber != guess){

        score++;

        inputNumber = sc.nextInt();

        if(inputNumber < guess){
            System.out.println("Too Low...");
        }
        else if(inputNumber > guess ){
            System.out.println("Too High...");
        }
        else if(inputNumber == guess){
            System.out.println("Correct...");
            System.out.println("Well Done");
            System.out.println("You Attempted : "+ score);
        }
    }
    }
}

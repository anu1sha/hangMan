package lickingheights.com;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//
         Scanner keyboard;
        keyboard = new Scanner(System.in);
        String consent;
        String secretPhrase;

        System.out.println("Hello Welcome to my hangman game");
        System.out.println("Let me explain the game");
        System.out.println("This is a two person game");
        System.out.println("The first person enters their phrase");
        System.out.println("The second person guesses the phrase in less than 15 tries");
        System.out.println("Are you ready to begin?");
        consent = keyboard.nextLine();
        System.out.println("Great! player one can now put in the word and " +
                "player two may not look");
        secretPhrase = keyboard.nextLine().toLowerCase();
        String [] guessPhraseBreakdown = secretPhrase.split("");



















    }
}

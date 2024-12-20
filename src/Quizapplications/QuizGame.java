package Quizapplications;

import java.util.Scanner;

public class QuizGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Questions and answers
	        String[] questions = {
	                "What is the capital of France?",
	                "Which planet is known as the Red Planet?",
	                "What is the square root of 64?",
	                "What is the capital of AndharaPradesh?",
	                "Which is the Largest State in india?",
	                "What is tha National Bird of india?",
	                ""
	        };

	        String[][] options = {
	                {"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"},
	                {"1. Earth", "2. Mars", "3. Jupiter", "4. Venus"},
	                {"1. 6", "2. 7", "3. 8", "4. 9"},
	                {"1.Mumbai", "2.Amaravathi", "3.Vizag", "4.Hyderabad"},
	                {"1.Andhrapradesh", "2.Rajasthan", "3.Mumbai", "4.Goa"},
	                {"1.Parrot", "2.Eagle", "3.Peacock", "4.Dove"}
	        };

	        int[] correctAnswers = {3, 2, 3,2,2,3}; // Correct option numbers
	        boolean usedLifeline = false; // Tracks if lifeline is used

	        System.out.println("Welcome to the Quiz Game!");
	        System.out.println("You can use a lifeline once to eliminate two incorrect options.");
	        System.out.println("Let's get started!");

	        for (int i = 0; i < questions.length; i++) {
	            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
	            for (String option : options[i]) {
	                System.out.println(option);
	            }

	            System.out.print("Enter your answer (or type 'L' to use lifeline): ");
	            String input = scanner.next();

	            if (input.equalsIgnoreCase("L")) {
	                if (usedLifeline) {
	                    System.out.println("You have already used the lifeline!");
	                } else {
	                    usedLifeline = true;
	                    System.out.println("Lifeline activated! Two incorrect options are removed.");
	                    int correctOption = correctAnswers[i];
	                    for (int j = 0; j < options[i].length; j++) {
	                        if (j + 1 == correctOption || Math.random() > 0.5) {
	                            System.out.println(options[i][j]);
	                        }
	                    }
	                }
	                System.out.print("Enter your answer: ");
	                input = scanner.next();
	            }

	            int answer = Integer.parseInt(input);
	            if (answer == correctAnswers[i]) {
	                System.out.println("Correct!");
	            } else {
	                System.out.println("Wrong! The correct answer was: " + options[i][correctAnswers[i] - 1]);
	            }
	        }

	        System.out.println("\nQuiz over! Thanks for playing.");
	        scanner.close();
	    }
	









}





	
				       
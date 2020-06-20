package com.game;

import java.util.Scanner;

public class GameDemo {

	public static void main(String[] args) {
		
		
		DeckGame sl = new DeckGame();

        System.out.println("Card Game \n Player Options");
        System.out.println("1. Start Game \n  \n2. Exit Game");
        System.out.print("Select your option : ");

        int i = 1;

        while (i != 0)
        {
                Scanner in = new Scanner(System.in);
                i = in.nextInt();

                switch (i)
                {
                        case 1:
                                System.out.println("Provide the Number of Players( should be greater than or equal to 2 and less than 4) : ");
                                in = new Scanner(System.in);
                                i = in.nextInt();
                                sl.playGame(i);

                                sl.displayWinners();
                                break;

                        case 2:
                                System.exit(0);
                }

                System.out.println();
                System.out.println("Card Game \n Select User Options");
                System.out.println("1. Start Game \n2. Exit Game");
                System.out.print("Select your option : ");
        }
}

	}



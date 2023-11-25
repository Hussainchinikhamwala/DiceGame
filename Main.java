import java.util.Scanner;

public class Main {


        public static void main (String[]args){
            int myGame = 1;

        Dicegame newGame = new Dicegame("Lets get the game started");


            do {
                newGame.play();
                Scanner playAgain = new Scanner(System.in);
                System.out.println("Do you want to play again? 1 = yes || 0 = no");
                int myGamee = playAgain.nextInt();

                if (myGamee == 0 || myGamee == 1) {
                    myGame = myGamee;
                }

                else {
                    System.out.println("Invalid Input. Please enter 1 for yes or 0 for no");
                }


            }

            while (myGame == 1);




    }
}
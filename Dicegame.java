import java.util.Random;
import java.util.Scanner;



public class Dicegame {

    int myNumber = 0;
    private Dice dice1;
    private Dice dice2;
    private String header;

    public Dicegame(String header){
        this();
        this.header = header;
        System.out.println(header);

    }

    public Dicegame() {
        this.dice1 = new Dice();
        this.dice2 = new Dice();
    }



    public void play() {


        Scanner userInput = new Scanner(System.in);
        System.out.println("How many times do you want to roll the dice?");
        int userrInput = userInput.nextInt();

        if (userrInput > 10 || userrInput < 0) {

            System.out.println("Please enter a value within the range of 1 to 10");
        }
        myNumber = userrInput;
        int doublesCounter = 0;

        for (int i = 1; i <= myNumber; i++) {
            dice1.roll();
            dice2.roll();
            int value1 = dice1.getValue();
            int value2 = dice2.getValue();
            System.out.println("Dice 1 : " +value1 + " Dice 2:  "+ value2);

            if (value1 == value2){
                doublesCounter++;

//                int numDice = value1 + value2;
                System.out.println("Turn " + i + " dice rolls " + value1 + " and " + value2 );

            }



        }

        if (doublesCounter == 0) {

            System.out.println("no doubles");
        }






    }
}

//        #G

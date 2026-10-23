package com.pluralsight;

public class DiceRollApp {
    public static void main(String[] args) {

        //Create an instance of dice
        Dice dice = new Dice();

        //create counters for rolls of 2,4,6,and 7


        //declare variable for number of loops
        int loop = 0;
        int twoCount = 0;
        int fourCount = 0;
        int sixCount = 0;
        int sevenCount = 0;

        //Set loop for 100 times

        for (loop = 0; loop <= 100; loop++) {
            int roll1 = dice.Roll(1, 6);
            int roll2 = dice.Roll(1, 6);
            int sum = roll1 + roll2;

            // Add if statements for (2,4,6,and 7 counter)
            if (sum == 2) {
                twoCount++;
            } else if (sum == 4) {
                fourCount++;
            } else if (sum == 6) {
                sixCount++;
            } else if (sum == 7) {
                sevenCount++;
            }


            //Print of dice rolls
            System.out.printf("Roll %d : %d,%d , Sum: %d\n", loop, roll1, roll2, sum);

        }

            // Print 2,4,6 and 7 counters to display
            System.out.println("\n" +
                "Total Number of 2's" + " " + twoCount + "\n" +
                "Total Number of 3's" + " " + fourCount + "\n" +
                "Total Number of 6's" + " " + sixCount + "\n" +
                "Total Number of 7's" + " " + sevenCount);



    }

}

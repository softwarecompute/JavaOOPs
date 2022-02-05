/***********************
  fishing game simulation
 Tony Gaddis Programming Challenge 6.18
 * *************
 */

import java.util.Scanner;



public class FishingGame {
    public static void main(String[] args) {

        boolean repeat = true;
        int totalPoints = 0;
        String fish = "";

        //Create an instance of Scanner class

        Scanner scanner = new Scanner(System.in);



        final int sides = 6;

        //Create an object of Die class with number of sides
        Die fishing = new Die(sides);

        //Repeat the game until user enter n to stop

        while(repeat)
        {
            //call roll method
            fishing.roll();

            //check if die value is 1

            if(fishing.getValue() == 1)
            {
                fish = "Goldfish";
                //Add value to totalPoints

                totalPoints+=fishing.getValue();
            }
            else if(fishing.getValue()==2)
            {
                fish = "Blobfish";
                //Add value to totalPoints

                totalPoints+=fishing.getValue();

            }
            else if(fishing.getValue()==2)
            {
                fish = "Blobfish";
                //Add value to totalPoints

                totalPoints+=fishing.getValue();

            }
            else if(fishing.getValue()==3)
            {
                fish = "Tilapia";
                //Add value to totalPoints

                totalPoints+=fishing.getValue();

            }
            else if(fishing.getValue()==4)
            {
                fish = "Sunfish";
                //Add value to totalPoints

                totalPoints+=fishing.getValue();

            }
            else if(fishing.getValue()==5)
            {
                fish = "Salmon";
                //Add value to totalPoints

                totalPoints+=fishing.getValue();

            }
            else if(fishing.getValue()==6)
            {
                fish = "Zebrafish";
                //Add value to totalPoints

                totalPoints+=fishing.getValue();

            }

            System.out.println("User got " + fish);
            System.out.println("Do you want to fish some more? [y or n]");

            //read choice from user

            char choice = scanner.next().charAt(0);
            //check if the choice is n

            if(choice == 'n')
                //set repeat boolean to false
                repeat = false;
        }

        //print total number of fishing points earned
        System.out.println("Total fishing points earned: " + totalPoints);
    }
}

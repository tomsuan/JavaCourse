package com.farm;

import java.util.Arrays;
import java.util.Random;

public class Farmer {
    String name;
    //Each farmer has a group of animals
    Animal[] animalList;
    //Amount of animals in each group.
    int animalCount;
    //Unique ID for each farmer.
    static int counter;
    //Price per kg per animal.
    double price;
    //Total price per animal.
    double totalPrice;
    //True = sheep farmer: False = cattle farmer
    boolean type;
    //Farmer ID
    int id;

    public Farmer(String name, int animalCount, double price,
                  boolean type) {
        super();
        /*
		 * static counter incremented and each iteration is
		 * going to an Id for each farmer
		 */
        counter++;
        this.name = name;
        this.animalCount = animalCount;
        this.type = type;
        //Creates a group of animals
        animalList = new Animal[animalCount];

        //	Animal[] animalList2=new Animal[4];
        //Puts the instance variable equal to the static variable counter.
        id = counter;
		/*
		 * Populates the herd based on the amount of animals
		 * and the type of farmer.
		 */
        popHerd();
		/*
		 * Caculates total price of the herd
		 */
        totalPrice = calcTotalPrice(price);
    }

    private void popHerd() {
        //If type is TRUE, the farmer is a sheep farmer.
        if (type == true) {
            //Loop will iterate for sheep.
            for (int i = 0; i < animalCount; i++) {
				/*
				 * This will ensure first two sheep will be male
				 * and placed in the first two positions in the
				 * animalList array.
				 */
                if (i < 2) {
                    //A random weight between 100 and 200.
                    int weight = randInt(100, 200);
                    //Will be male.
                    animalList[i] = new Sheep(weight, false);
                }
				/*
				 * Resmainder sheep will be female
				 * and placed in the animalList array.
				 */
                else {//A random weight between 75 and 100
                    int weight = randInt(75, 100);
                    //Will be female.
                    animalList[i] = new Sheep(weight, true);
                }
            }
        }
		/*
		 * If not sheep farmer then cattle farmer.
		 */
        else {
			/*
			 * Loop will iterate just twice and populate the
			 * first two places in the animalList array.
			 */
            for (int i = 0; i < 2; i++) {
                int weight = randInt(300, 500);
                animalList[i] = new Cow(weight, false);

            }/*
			Loop will start at position 2 in the
			animlList array and continue until the end 
			of the array
			*/
            for (int j = 2; j < animalCount; j++) {
                int weight = randInt(200, 300);
                animalList[j] = new Cow(weight, true);
            }
        }
    }

    /*
     * Calculates total price each farmer will for all their animals.
     * double price is the price per kg paid to farmer
     */
    private double calcTotalPrice(double price) {
		/*
		 * Total price
		 */
        double total = 0;
		/*
		 * Price per animal
		 */
        for (int i = 0; i < animalCount; i++) {
			/*
			 * Call calcPrice method for each animal
			 * which gets how much each animal is worth.
			 */
            total += animalList[i].calcPrice(price);
        }
        return total;
    }

    private int randInt(int min, int max) {

        // Usually this can be a field rather than a method variable
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }


    @Override
    public String toString() {
	/*
	 * Prinsts out the farmer object, which in turn calls the toString
	 * method for each animal.
	 */
        return "Farmer [name=" + name + ", animalList=" + Arrays.toString(animalList) + ", animalCount=" + animalCount + " total price is " + totalPrice
                + "]";
    }


}

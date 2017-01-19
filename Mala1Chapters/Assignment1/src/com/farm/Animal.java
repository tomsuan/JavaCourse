package com.farm;

/*
 * Animal class is abstract so cannot create an instance of Animal.
 */
public abstract class Animal {
    /*
     * Every animal will have a weight,
     * a sex which if true will make the gender "female" and if false will make
     * the gender "male"
     */
    double weight;
    boolean sex;
    String gender;

    //empty constructor
    Animal() {

    }

    /*
     * constuctor that takes a double and a boolean and
     * determines gender of animal
     */
    Animal(double weight, boolean sex) {
        this.weight = weight;
        //if sex is true
        if (sex)
            gender = "Female";
        else
            gender = "Male";
    }

    /*
     * calculates the value of each animal
     */
    double calcPrice(double pricePerKg) {
        return weight * pricePerKg;
    }
}

/*
 * Cow extends animal so inherits weight, sex and gender and
 * also the calcPrice() method
 */
class Cow extends Animal {
    int id;
    static int counter = 0;

    //empty Cow constructor
    Cow() {

    }

    /*
     * Cow constructor that takes a weight and sex
     * calls the superconstructor with these values
     * increments our static counter by 1
     * assigns the id of the cow based on the static counter
     */
    Cow(double weight, boolean sex) {
        /*
		 * this is a call to the Animal
		 * Constructor that takes a double
		 * and a boolean
		 */
        super(weight, sex);
        counter++;
        id = counter;
        System.out.println("cow counter is " + counter);
    }

    /*the toString method
     * for the Cow
     */
    @Override
    public String toString() {
        return "Cow [id=" + id + ", weight=" + weight + ", gender=" + gender + "]\n";
    }

}

/*
 * Sheep extends animal so inherits weight, sex and gender and
 * also the calcPrice() method
 */
class Sheep extends Animal {
    int id;
    static int counter = 0;

    //empty sheep constructor
    Sheep() {

    }

    /*
     * Sheep constructor that takes a weight and sex
     * calls the superconstructor with these values
     * increments our static counter by 1
     * assigns the id of the Sheep based on the static counter
     */
    Sheep(double weight, boolean sex) {
        super(weight, sex);
        counter++;
        id = counter;
        // TODO Auto-generated constructor stub
        System.out.println("sheep counter is " + counter);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     * the toString() method for the Sheep
     */
    @Override
    public String toString() {
        return "Sheep [id=" + id + ", weight=" + weight + ", gender=" + gender + "]";
    }

}

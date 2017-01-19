package com.farm;

public class Farmer2<t extends Animal> {
    //String name;
    //t[]animalList;
    int animalCount;
    static int counter;
    double price;
    double totalPrice;
    //Animal<t>[] elements = new Animal [animalCount];
    t myT;

    public Farmer2(/*int animalCount, double price, double totalPrice,*/ t myT) {
        super();
        //	this.animalCount = animalCount;
        //	this.price = price;
        //	this.totalPrice = totalPrice;
        this.myT = myT;
        System.out.println(myT.getClass().getSimpleName());
        myT.getClass().getSimpleName();
        //	t newT=new t();
        //	Animal myAnimal=new Animal();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Farmer2 [myT=" + myT + "]";
    }

	
	
	
	/*
	private void popHerd(){
		for(int i=0;i<animalCount;i++){
			for(int j=0;j<2;j++)
			{
				int weight=randInt(50,100);
				animalList[j]=new Animal(weight,false);
			}
			int weight=randInt(25,50);
			animalList[i]=new Sheep(weight,true);	
		}
	}
	*/

}

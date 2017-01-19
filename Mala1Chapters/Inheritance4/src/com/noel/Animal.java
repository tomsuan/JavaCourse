package com.noel;
/*
 * only allowed one public class per file
 * and it has to be the same name as the file
 */
public class Animal {
	int age=23;
	double weight=12.5;
}

class Mammal extends Animal{
	double pregnancyTime=14;
}

class Dolphin extends Mammal{
	double swimSpeed=34.5;
}

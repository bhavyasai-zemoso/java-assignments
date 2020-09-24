package com.training.assignment7;

class InheritanceHierarchy {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0]=new Rat();
        rodents[1]=new Mice();
        rodents[2]=new Squirrel();
        for (Rodent rodent : rodents) {
            rodent.printName();
            rodent.displayHabits();
        }
    }
}

abstract class Rodent {
	
	Rodent() {
        System.out.println("This is Rodent class constructor.");
    }
	
    abstract void printName();

    abstract void displayHabits();

    
}

class Rat extends Rodent {

    Rat() {
        System.out.println("This is Rat class constructor");
    }

    @Override
    void printName() {
        System.out.println("Name is Rat");
    }

    @Override
    void displayHabits() {
        System.out.println("BlackRats build their nests high up and BrownRats like to be close to the ground");
    }
}

class Mice extends Rodent {

    Mice() {
        System.out.println("This is Mice class Constructor");
    }

    @Override
    void printName() {
        System.out.println("Name is Mice");
    }

    @Override
    void displayHabits() {
        System.out.println("Mice build their nests in burrows");
    }
}

class Squirrel extends Rodent {

    Squirrel() {
        System.out.println("This is Squirrel class constructor");
    }

    @Override
    void printName() {
        System.out.println("Name is Squirrel");
    }

    @Override
    void displayHabits() {
        System.out.println("Squirrel digs holes in Trees or on ground");
    }
}

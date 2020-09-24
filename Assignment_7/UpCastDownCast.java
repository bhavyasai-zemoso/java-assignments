package com.training.assignment7;

public class UpCastDownCast {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[3];
        cycles[0]=new UniCycle();
        cycles[1]=new BiCycle();
        cycles[2]=new TriCycle();
   
        /**
         *  As there is no balance method in parent(Cycle) class, there will be an error
         *  cycles[0].balance();
         *  cycles[0].balance();
         *  cycles[0].balance();
        */
        
        
        
        //downcasting to unicycle and bicycle
         
        
        ((UniCycle)cycles[0]).balance();
        ((BiCycle)cycles[1]).balance();

        // As there is no balance method in TriCycle, there will be an error.
        //((TriCycle)cycles[2]).balance();

    }
}

class Cycle {
    Cycle() {
        System.out.println("This is Cycle class constructor.");
    }
}

class UniCycle extends Cycle{
	UniCycle() {
        System.out.println("This is UniCycle class constructor.");
    }

    void balance() {
        System.out.println("This is balance method of UniCycle class.");
    }
}

class BiCycle extends Cycle{
    BiCycle() {
        System.out.println("This is BiCycle class constructor.");
    }

    void balance() {
        System.out.println("This is balance method of BiCycle class.");
    }
}

class TriCycle extends Cycle{
    TriCycle() {
        System.out.println("This is TriCycle class constructor.");
    }

}

